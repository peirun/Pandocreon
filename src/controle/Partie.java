package controle;
import modele.*;
import cartesControle.*;
import joueursControle.*;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;


public class Partie {
	
	private static Partie partie=null;
	
	private int nbJoueurs;
	private ArrayList<Joueur> joueurs;
	private Cartes cartes;
	private CartesDivinite divinites;//nouveaux
	//private Phase phase;
	private Tour tour;
	private CartesSurTable cartesSurTable;
	
	public static Partie getInstance() {
		if(partie==null) {
			partie = new Partie();
		}
		
		return partie;
	}
	
	private Partie() {
		this.setNbJoueurs(0);
		this.joueurs = new ArrayList<Joueur>();
		this.cartes = Cartes.getInstance();
		this.setCarteSurTable(CartesSurTable.getCartesSurTable());
	}
	//getPartie
	public static Partie getPartie() {
		return partie;
	}
	
	//ajouter joueurs
	public void addJoueurs() {
		joueurs.add(new Joueur());
		this.setNbJoueurs(this.getNbJoueurs() + 1);
	}
	//suprimer joueurs
	public void deleteJoueurs() {
		joueurs.remove(joueurs.size() - 1);
	}
	
	public void commencerPartie() {
		//test
		System.out.println("commence un partie");
		
		//test
		System.out.println("remplir le nombre de joueurs qui va joue");
		Scanner sc = new Scanner(System.in);
	
		int n = 0;
		n = sc.nextInt();
		//Ajouter exception pour ici

//		ajouter joueurs
		for(int i = 0;i < n; i++) {
			this.addJoueurs();
		}
		
		Iterator<Joueur> it = joueurs.iterator();
		
		while(it.hasNext()) {
			Joueur j = it.next();			
			j.completerMain(cartes);
						
			//j.setDivinite(Divinite.getInstance().returnDivinite());
			if(it.hasNext()) {
				j.setProchainJoueur(joueurs.get(j.getNumJoueur() + 1));
				System.out.println("Joueur" + j.getNumJoueur() +"Initialisation fini");
			}else {
				j.setProchainJoueur(joueurs.get(0));
				System.out.println("Joueur" + j.getNumJoueur() +"Tous les joueurs initialisent");
			}
		}
		tour = new Tour(joueurs, 0);
		//test
		System.out.println("进入第一圈");
		tour.commencerNouveauTour();
	}
	
	
	
	//Decider qui va gagner
//	public int compareNbPriere() {
//		if(this.getNbJoueurs() <= 3) {
//			int max= joueurs.get(0).getNbPriere();
//			int index = 0;
//			int tmp = 0;
//			int i = 1;
//			while(i < joueurs.size()) {
//				tmp = joueurs.get(i).getNbPriere();
//				if(tmp >= max) {
//					max = tmp;
//					index = i;
//				}
//				i++;
//			}
//			i = 0;
//			while(i < joueurs.size()) {
//				if(i != index) {
//					if(max == joueurs.get(i).getNbPriere()) {
//						return -1;
//					}
//				}
//			}
//			return index;
//		}else {
//			int min= joueurs.get(0).getNbPriere();
//			int index = 0;
//			int tmp = 0;
//			int i = 1;
//			while(i < joueurs.size()) {
//				tmp = joueurs.get(i).getNbPriere();
//				if(tmp <= min) {
//					min = tmp;
//					index = i;
//				}
//				i++;
//			}
//			i = 0;
//			while(i < joueurs.size()) {
//				if(i != index) {
//					if(min == joueurs.get(i).getNbPriere()) {
//						return -1;
//					}
//				}
//			}
//			return index;
//		}
//	}
	public void supprimerJoueur(Joueur j) {
		joueurs.remove(j);
	}
	
	//commencer un partie
	
	
	public void terminerPartie() {
		
	}

	public void ApocalypseProcess(Joueur j) {
//		int index = this.compareNbPriere();
//		if(this.getNbJoueurs() <= 3) {
//			if(index != -1) {
//				System.out.println("玩家" + this.joueurs.get(index).getNumj() + "获胜！！！");
//				this.terminerPartie();
//			}else {
//				System.out.println("世界末日无效！");
//				System.gc();
//				this.tour = new Tour(this.joueurs, j.getNumj());
//				tour.setEnableApocalypse(false);
//				System.out.println("进入下一回合！");
//				tour.commencerNouveauTour();
//			}
//		}else {
//			if(index != -1) {
//				Joueur jF = this.getJoueurs().get(index); //失败玩家
//				System.out.println("玩家" + j.getNumj() + "滚蛋！！！");
//				Iterator<Croyant> itCroyantDeJF = jF.getCroyants().iterator();
//				while(itCroyantDeJF.hasNext()) {
//					this.carteSurTable.getCroyantPublic().add(itCroyantDeJF.next());
//				}
//				this.eliminerJoueur(this.getJoueurs().get(index));
//				System.gc();
//				this.tour = new Tour(this.joueurs, j.getNumj());
//				tour.setEnableApocalypse(false);
//				System.out.println("进入下一回合！");
//				tour.commencerNouveauTour();
//			}else {
//				System.out.println("世界末日无效！");
//				System.gc();
//				this.tour = new Tour(this.joueurs, j.getNumj());
//				tour.setEnableApocalypse(false);
//				System.out.println("进入下一回合！");
//				tour.commencerNouveauTour();
//			}
//		}
	}
	
	
	
	
	
	
	
	
	public Tour getCurrentTour() {
		return this.tour;
	}
	public Cartes getCartes() {
		return this.cartes;
	}
	public int getNbJoueurs() {
		return nbJoueurs;
	}
	public void setNbJoueurs(int nbJoueurs) {
		this.nbJoueurs = nbJoueurs;
	}
	public CartesSurTable getCartesSurTable() {
		return cartesSurTable;
	}
	public void setCarteSurTable(CartesSurTable cartesSurTable) {
		this.cartesSurTable = cartesSurTable;
	}
	public ArrayList<Joueur> getJoueurs() {
		return this.joueurs;
	}
}
