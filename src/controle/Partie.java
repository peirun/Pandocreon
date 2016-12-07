package controle;

import cartesControle.*;
import joueursControle.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Partie {

	private static Partie instance = null;

	private ArrayList<Joueur> joueurs;
	private Cartes cartes;
	private Tour tour;
	private CartesSurTable cartesSurTable;
	public static Scanner sc = new Scanner(System.in);

	public static Partie getInstance() {
		if (instance == null) {
			instance = new Partie();
		}
		return instance;
	}

	private Partie() {
		this.joueurs = new ArrayList<Joueur>();
		this.cartes = Cartes.getInstance();
		this.setCarteSurTable(CartesSurTable.getCartesSurTable());
	}

	// ajouter joueurs
	public void addJoueurs() {
		Joueur j = new JoueurVirtual();
		j.completerMain();
		j.setDivinite(CartesDivinite.getInstance().returnDivinite());
		joueurs.add(j);
	}

	// suprimer joueurs
	public void deleteJoueurs() {
		joueurs.remove(joueurs.size() - 1);
	}

	public void commencerPartie() {
		// test
		System.out.println("commence un partie");

		// test
		System.out.println("remplir le nombre de joueurs qui va joue");

		int n = 0;
		n = sc.nextInt();
		// Ajouter exception pour ici

		// ajouter joueurs
		Joueur j = new JoueurPhysique();
		j.completerMain();
		j.setDivinite(CartesDivinite.getInstance().returnDivinite());
		joueurs.add(j);

		for (int i = 0; i < n - 1; i++) {
			this.addJoueurs();
		}

		this.tour = new Tour(joueurs);
		this.tour.commencerNouveauTour();
	}

	// Decider qui va gagner
	// public int compareNbPriere() {
	// if(this.getNbJoueurs() <= 3) {
	// int max= joueurs.get(0).getNbPriere();
	// int index = 0;
	// int tmp = 0;
	// int i = 1;
	// while(i < joueurs.size()) {
	// tmp = joueurs.get(i).getNbPriere();
	// if(tmp >= max) {
	// max = tmp;
	// index = i;
	// }
	// i++;
	// }
	// i = 0;
	// while(i < joueurs.size()) {
	// if(i != index) {
	// if(max == joueurs.get(i).getNbPriere()) {
	// return -1;
	// }
	// }
	// }
	// return index;
	// }else {
	// int min= joueurs.get(0).getNbPriere();
	// int index = 0;
	// int tmp = 0;
	// int i = 1;
	// while(i < joueurs.size()) {
	// tmp = joueurs.get(i).getNbPriere();
	// if(tmp <= min) {
	// min = tmp;
	// index = i;
	// }
	// i++;
	// }
	// i = 0;
	// while(i < joueurs.size()) {
	// if(i != index) {
	// if(min == joueurs.get(i).getNbPriere()) {
	// return -1;
	// }
	// }
	// }
	// return index;
	// }
	// }
	public void supprimerJoueur(Joueur j) {
		joueurs.remove(j);
	}

	// commencer un partie

	public void terminerPartie() {

	}

	public void ApocalypseProcess(Joueur j) {
		// int index = this.compareNbPriere();
		// if(this.getNbJoueurs() <= 3) {
		// if(index != -1) {
		// System.out.println("玩家" + this.joueurs.get(index).getNumj() +
		// "获胜！！！");
		// this.terminerPartie();
		// }else {
		// System.out.println("世界末日无效！");
		// System.gc();
		// this.tour = new Tour(this.joueurs, j.getNumj());
		// tour.setEnableApocalypse(false);
		// System.out.println("进入下一回合！");
		// tour.commencerNouveauTour();
		// }
		// }else {
		// if(index != -1) {
		// Joueur jF = this.getJoueurs().get(index); //失败玩家
		// System.out.println("玩家" + j.getNumj() + "滚蛋！！！");
		// Iterator<Croyant> itCroyantDeJF = jF.getCroyants().iterator();
		// while(itCroyantDeJF.hasNext()) {
		// this.carteSurTable.getCroyantPublic().add(itCroyantDeJF.next());
		// }
		// this.eliminerJoueur(this.getJoueurs().get(index));
		// System.gc();
		// this.tour = new Tour(this.joueurs, j.getNumj());
		// tour.setEnableApocalypse(false);
		// System.out.println("进入下一回合！");
		// tour.commencerNouveauTour();
		// }else {
		// System.out.println("世界末日无效！");
		// System.gc();
		// this.tour = new Tour(this.joueurs, j.getNumj());
		// tour.setEnableApocalypse(false);
		// System.out.println("进入下一回合！");
		// tour.commencerNouveauTour();
		// }
		// }
	}

	public Tour getTour() {
		return this.tour;
	}

	public Cartes getCartes() {
		return this.cartes;
	}

	public int getNbJoueurs() {
		return joueurs.size();
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
