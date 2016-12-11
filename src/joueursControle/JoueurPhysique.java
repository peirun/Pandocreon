package joueursControle;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import cartesControle.CartesSurTable;
import controle.Partie;
import modele.Apocalypse;
import modele.Carte;
import modele.CarteAction;
import modele.Croyant;
import modele.DeusEx;
import modele.GuideSpirituel;

public class JoueurPhysique extends Joueur {
	private CarteAction c;
	private ArrayList<CarteAction> carteADefausser = new ArrayList<CarteAction>();

	//Il y a quelques proble
	
	public void choisirDefausse() {
			while (true) {
				System.out.println("Etape 1 - Defausse");
				System.out.println("  1. Ajouter une carte a defausser");
				System.out.println("  2. Enlever une carte a defausser");
				System.out.println("  3. Valider ou quitter");
				int n = Partie.getInt("Choix : ", 1, 3);
				switch(n) {
					case 1:
						System.out.println("Chosir un carte a defausser"+'\n');
						this.showCartes();
						int a=Partie.sc.nextInt();
						this.carteADefausser.add(this.cartesALaMain.remove(a));
						break;
					case 2:
						this.showCartesAdefausser(carteADefausser);
						int l = Partie.sc.nextInt();
						this.cartesALaMain.add(carteADefausser.get(l));
						break;
					case 3:
						// TODO: defausser les cartes choisies
						return;
				}
			}	
	}
	public void showCartesAdefausser(ArrayList<CarteAction> carteActions) {
		for (int i = 0; i < carteADefausser.size(); i++) {
			System.out.println(i + ".");
			System.out.println(carteADefausser.get(i).toString());
		}
	}
	public void showCartes() {
		for (int i = 0; i < cartesALaMain.size(); i++) {
			System.out.println(i + ".");
			System.out.println(cartesALaMain.get(i).toString());
		}
	}

	public void utiliser() {
	
		showCartes();
		showPointAction();
		while(true) {
			System.out.println("Choisir quel operation vous voulez utilisez");
			System.out.println("1. Utiliser carte a ma main");
			System.out.println("2. Utiliser carte sur la table");
			System.out.println("3. Valider ou quitter");
			System.out.println("Choix £º");
			int n=Partie.sc.nextInt();
			switch(n) {
				case 1:
					showCartes();
					System.out.println("Choisi une carte");
					int i = Partie.sc.nextInt();
					CarteAction c= cartesALaMain.remove(i);
					//utiliser carte
					switch(c.getType()) {
					case "Croyant":
					Croyant croyant = (Croyant)c;
					poserCroyant(croyant);
					break;
					case "Guide":
					GuideSpirituel gs=(GuideSpirituel)c;
					poserGuide(gs);
					break;
					case "DeuxEx":
					DeusEx de = (DeusEx)c;
					de.sacrifier(this);
					break;
					case "Apocalypse":
					Partie.getPartie().ApocalypseProcess(this);
					break;
					}					
					break;
					
					case 2:
					if(this.getGuideSpirituels().size()==0) {
						System.out.println("Vous n'avez pas encore pose guide");
					}else {
						for (int m = 0; m < this.getGuideSpirituels().size(); m++) {
							System.out.println(m + ".");
							System.out.println(this.getGuideSpirituels().get(m).toString());
					}
					int o = Partie.sc.nextInt();
					this.rattacherCroyant(this.getGuideSpirituels().get(o));
					}
					break;
					
					case 3:
					return;	
			
		}
		
		}
	}
	
	
	
	public void sacrifier() {
		showPointAction();
		showCartes();
		System.out.println("Choisir un carte£º");
		int i = Partie.sc.nextInt();
		c = cartesALaMain.remove(i);
		
		switch(c.getType()) {
			case "Croyant":
			Croyant croyant = (Croyant)c;
			croyant.sacrifier(this);
			break;
			
			case "DeusEx":
			DeusEx deusEx=(DeusEx)c;
			deusEx.sacrifier(this);
			break;
			
			case "GuideSpirituel":
			GuideSpirituel guideSpirituel=(GuideSpirituel)c;
			guideSpirituel.sacrifier(this);
			break;
			
			case "Apocalypse":
			Apocalypse apocalypse = (Apocalypse)c;
			apocalypse.sacrifier(this);
			break;
		
		}
		
		
	}
	
	public void poserGuide(GuideSpirituel cs) {
		switch(cs.getOrigine()) {
		case Carte.JOUR:
			if(this.pointActionJour >= 1) {
				this.setGuideSpirituels(cs);
				this.pointActionJour -= 1;
			}else {
				System.out.println("PointAction manque");
				cartesALaMain.add(cs);
			}
			break;
		case Carte.NEANT:
			if(this.pointActionNeant >= 1) {
				this.setGuideSpirituels(cs);
				this.pointActionNeant -= 1;
			}else if(this.pointActionJour >= 2) {
				this.setGuideSpirituels(cs);
				this.pointActionJour -=2;
			}else if(this.pointActionNuit>=2) {
				this.setGuideSpirituels(cs);
				this.pointActionNuit -=2;
			}
			else {
				System.out.println("PointAction manque");
				cartesALaMain.add(cs);
			}
			break;
		
		case Carte.NUIT:
			if(this.pointActionNuit >= 1) {
				this.setGuideSpirituels(cs);
				this.pointActionNuit -= 1;
			}else {
				System.out.println("PointAction manque");
				cartesALaMain.add(cs);
			}
			break;
		default :
			break;
		}
		
//		int i = Partie.sc.nextInt();
//		if(this.cartesALaMain.get(i) instanceof GuideSpirituel) {
//			GuideSpirituel g=(GuideSpirituel)this.cartesALaMain.get(i);
//			if((g.getOrigine()=="jour"&&this.pointActionJour>=1)) {
//				this.setGuideSpirituels(g);
//				this.compterPointAction(g);
//			}else if(g.getOrigine()=="nuit"&&this.pointActionNuit>=1){
//				this.setGuideSpirituels(g);
//				this.compterPointAction(g);
//			}else if(g.getOrigine()=="neant"&&this.pointActionNeant>=1) {
//				this.setGuideSpirituels(g);
//				this.compterPointAction(g);
//			}else if(g.getOrigine()=="neant"&&this.pointActionJour>=2){
//				this.setGuideSpirituels(g);
//				this.compterPointAction(g);
//			}else if(g.getOrigine()=="neant"&&this.pointActionNuit>=2) {
//				this.setGuideSpirituels(g);
//				this.compterPointAction(g);
//			}else {
//				System.out.println("Guide rate");//pour test
//			}
//	}else {
//		System.out.println("Ce n'est pas une carte guide");
//	}

		
	}
	
	public void rattacherCroyant(GuideSpirituel guide) {
		ArrayList<Croyant> croyants = CartesSurTable.getInstance().getCroyantDeposes();
		
		while(true) {
			if(CartesSurTable.getInstance().getCroyantDeposes().size() == 0) {
				System.out.println("Il n'y pas de croyant£¡");
				break;
			}
			if(guide.getNbCroyantSontRattache() == guide.getNbCroyantMax()) {
				System.out.println("Cette guidespirituel ratacher croyants au maximum£¡");
				break;
			}
			else {
				System.out.println("Choisir quel croyant vous voulez rattacher: ");
				int n = -1;
				n = Partie.sc.nextInt();
				boolean FLAG = false;
				while(!FLAG) {
					try{
						n = Partie.sc.nextInt();
						if(n >= 0 && n < CartesSurTable.getInstance().getCroyantDeposes().size()) {
							FLAG = true;
						}else {
							System.out.println("on ne trouve pas ce carte");
							Partie.sc.next();
							FLAG = false;
						}
					}catch(InputMismatchException e) {
						System.out.println("Tap Illegally");
						FLAG = false;
					}
				}
				
//				 
			}			
		}
	}
	@Override
	public void choisirUneOperation() {
		while (true) {
			System.out.println("chose un chiox: 0:utiliser, 1:sacrifier, 2:mettreAFinTonPhase");
			int n = Partie.sc.nextInt();

			switch (n) {
			
			case 0:
				utiliser();
				break;
			case 1:
				sacrifier();
				break;
			case 2:
				mettreAFinTonPhase();
				return;
			default:
				//
				break;
			}
		}
	}

}		

