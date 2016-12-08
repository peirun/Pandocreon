package joueursControle;

import java.util.List;
import java.util.Scanner;

import javax.sound.midi.Patch;

import cartesControle.CartesSurTable;
import controle.Partie;
import modele.Carte;
import modele.CarteAction;
import modele.Croyant;
import modele.DeusEx;
import modele.GuideSpirituel;

public class JoueurPhysique extends Joueur {
	//Il y a quelques problems
	
	public void choisirDefausse() {	
		
		boolean end = false;
		try {
			do{
				showCartes();
				System.out.println("Choisir quels cartes vous voulez perdre：");
				int n=Partie.sc.nextInt();
				if(n >= 0 && n < cartesALaMain.size()) {
					cartesALaMain.remove(n);
				}else {
					System.out.println("Il n'y a pas de ce carte que vous chosissez. Reessayer s'il vous plait");
					continue;
				}
				System.out.println("Continuer deffausser，ou tap 'false' pour quitter");
				end = Partie.sc.next().equals("false");
			}while(!end);
		}catch(Exception e) {
			System.out.println("Reessayer tap");
			
			choisirDefausse();
		}
		
		System.out.println("Defausse fini");
	}

	public void showCartes() {
		for (int i = 0; i < cartesALaMain.size(); i++) {
			System.out.println(i + ".");
			System.out.println(cartesALaMain.get(i).toString());
		}
	}

	public void utiliser() {
		showPoinAction();
		System.out.println("Choisir un carte：");
		showCartes();
		int i = Partie.sc.nextInt();
		CarteAction c= cartesALaMain.remove(i);
		
		//utiliser carte
		switch(c.getType()) {
		case "Croyant":
		Croyant croyant = (Croyant)c;
		poserCroyant(croyant);
		break;
		case "Guide":
		GuideSpirituel guide = (GuideSpirituel)c;
		poserGuide(guide);
		break;
		case "DeuxEx":
		DeusEx de = (DeusEx)c;
		de.sacrifier(this);
		break;
		case "Apocalypse":
		Partie.getPartie().ApocalypseProcess(this);
		break;
		}
	}
	
	
	public void sacrifier() {
	
	}
	
	
		
		
	public void poserCroyant(Croyant cc) {
			switch(cc.getOrigine()) {
			case Carte.JOUR:
				if(this.pointActionJour >= 1) {
					CartesSurTable.getInstance().getCroyantDeposes().add(cc);
					this.pointActionJour -= 1;
				}else {
					System.out.println("PointAction manque");
					cartesALaMain.add(cc);
				}
				break;
			case Carte.NEANT:
				if(this.pointActionNeant >= 1) {
					CartesSurTable.getInstance().getCroyantDeposes().add(cc);
					this.pointActionNeant -= 1;
				}else {
					System.out.println("PointAction manque");
					cartesALaMain.add(cc);
				}
				break;
			
			case Carte.NUIT:
				if(this.pointActionNuit >= 1) {
					CartesSurTable.getInstance().getCroyantDeposes().add(cc);
					this.pointActionNuit -= 1;
				}else {
					System.out.println("PointAction manque");
					cartesALaMain.add(cc);
				}
				break;
			default :
				break;
			}
	}
		
	public void poserGuide(GuideSpirituel guide) {
		List<CarteAction> croyants = CartesSurTable.getInstance().getCroyantDeposes();
		Scanner sc = Partie.sc;
		
		int idCroyant = 0; //信徒卡编号
		
		for (CarteAction c : croyants) {
			System.out.println(idCroyant);
			System.out.println(c);
		}
		while(true) {
			if(CartesSurTable.getInstance().getCroyantDeposes().size() == 0) {
				System.out.println("Il n'y pas de croyant！");
				break;
			}
			if(guide.getNbCroyantSontRattache() == guide.getNbCroyantMax()) {
				System.out.println("Cette guidespirituel ratacher croyants au maximum！");
				break;
			}
			
			System.out.println("Choisir quel croyant vous voulez rattacher: ");
			int n = -1;
			n = sc.nextInt();
//			boolean FLAG = false;
//			while(!FLAG) {
//				try{
//					n = sc.nextInt();
//					if(n >= 0 && n < cartesSurTable.getInstance().getCroyantDeposes().size()) {
//						FLAG = true;
//					}else {
//						System.out.println("找不到该卡片，请重新输入！");
//						sc.next();
//						FLAG = false;
//					}
//				}catch(InputMismatchException e) {
//					System.out.println("非法输入");
//					FLAG = false;
//				}
//			}
			
			Croyant c =(Croyant) CartesSurTable.getInstance().getCroyantDeposes().remove(n);
			guide.getCroyants().add(c);
			guide.setNbCroyantSontRattache(guide.getNbCroyantSontRattache() + 1);
			System.out.println("Rattacher croyant reussi！");
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
