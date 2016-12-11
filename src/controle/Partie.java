package controle;

import cartesControle.*;
import joueursControle.*;
import modele.Croyant;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

public class Partie {

	private static Partie instance = null;

	private ArrayList<Joueur> joueurs;
	private Cartes cartes;
	private Tour tour;
	private CartesSurTable cartesSurTable;
	public static Scanner sc = new Scanner(System.in);

	public static int getInt(String question, int min, int max) {
		int nb = 0;
		do {
		try {
			System.out.print(question);
			nb = sc.nextInt();
			if(nb<min || nb> max) {
				System.out.println("Nombre invalide");
			}
		}catch(InputMismatchException e){
				System.out.println("Nombre invalide");
			}
			sc.nextLine();
			}while (nb < min || nb > max);
		return nb;
	}

	public static Partie getInstance() {
		if (instance == null) {
			instance = new Partie();
		}
		return instance;
	}

	private Partie() {
		this.joueurs = new ArrayList<Joueur>();
		this.cartes = Cartes.getInstance();
		this.setCarteSurTable(CartesSurTable.getInstance());
	}
	
	public static Partie getPartie() {
		return instance;
	}

	// ajouter joueurs
	public void addJoueurs() {
		Joueur j = new JoueurVirtual(new IAFacile());
		j.completerMain();
		j.setDivinite(CartesDivinite.getInstance().returnDivinite());
		joueurs.add(j);
	}

	// suprimer joueurs
	

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

	// renvoyer index qui va gagner et perdre 
	// siil y a des doublons , comment on trait? 
	 public int compareNbPriere() {
	 	if(this.joueurs.size() <= 3) {
			 int max= joueurs.get(0).getNbPriere();
	 		 int index = 0;
			 int tmp = 0;
	 		 int i = 1;
	 		 while(i < joueurs.size()) {
	 				tmp = joueurs.get(i).getNbPriere();
	 				if(tmp >= max) {
	 					max = tmp;
	 					index = i;
	 				}
					 i++;
	 			}
	 		i = 0;
		    while(i < joueurs.size()) {
	 			if(i != index) {
	 				if(max == joueurs.get(i).getNbPriere()) {
	 					return -1;
						 }
						}
				 }
	 				return index;
				 }else {
	 				int min= joueurs.get(0).getNbPriere();
				    int index = 0;
				    int tmp = 0;
	 				int i = 1;
			 while(i < joueurs.size()) {
	 				tmp = joueurs.get(i).getNbPriere();
	 					if(tmp <= min) {
	 						min = tmp;
	 						index = i;
	 						}
						 i++;
	 					}
	 					i = 0;
	 			while(i < joueurs.size()) {
	 					if(i != index) {
	 						if(min == joueurs.get(i).getNbPriere()) {
	 							return -1;
	 							}
	 						}
	 					}
	 					return index;
					}
	 	}
	public void supprimerJoueur(Joueur j) {
		joueurs.remove(j);
	}
	public void deleteJoueurs() {
		joueurs.remove(joueurs.size() - 1);
	}

	// commencer un partie

	public void terminerPartie() {

	}
	//apocalypse
	public void ApocalypseProcess(Joueur j) {
		 int index = this.compareNbPriere();
		 if(this.getNbJoueurs() <= 3) {
		 	if(index != -1) {
		 		System.out.println("Joueur" + this.joueurs.get(index).getNumJoueur() +
		 			"Gagne£¡£¡£¡");
		 		this.terminerPartie();
		 	}else {
		 	System.out.println("Apocalypse inutile£¡");
		 //System.gc();
		 	this.tour = new Tour(this.joueurs);
		 	System.out.println("Entre la tour prochain£¡");
		 	tour.commencerNouveauTour();
		 	}
		 }else {
		 	if(index != -1) {
		 		Joueur jF = this.getJoueurs().get(index); //joueur perdu
		 		System.out.println("Joueur" + j.getNumJoueur() + "joueur go out£¡£¡£¡");
		 		Iterator<Croyant> itCroyantDeJF = jF.getCroyants().iterator();
		 		while(itCroyantDeJF.hasNext()) {
				 this.cartesSurTable.getCroyantDeposes().add(itCroyantDeJF.next());
		 		}
		 		this.supprimerJoueur(this.getJoueurs().get(index));
		 //System.gc();
			 	this.tour = new Tour(this.joueurs);
		 		tour.setEnableApocalypse(false);
		 		System.out.println("La tour prochain£¡");
		 		tour.commencerNouveauTour();
		 	}else {
		 		System.out.println("Apolypse inutile£¡");
		 //System.gc();
		 		this.tour = new Tour(this.joueurs);
		 		tour.setEnableApocalypse(false);
		 		System.out.println("La tour prochain£¡");
		 		tour.commencerNouveauTour();
		 }
		 }
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

	public static int getUtiliser(String string, int i, int j) {
		// TODO Auto-generated method stub
		return 0;
	}
}
