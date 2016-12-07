package controle;
import java.util.ArrayList;
import java.util.Iterator;

import joueursControle.Joueur;


public class Tour {
	
	private Tour prochainTour;
	private ArrayList<Joueur> joueurs;
	private int premiereJoueur;
	private boolean enableApocalypse;
	private static int numTour = 1;
	
	Tour(ArrayList<Joueur> joueurs, int premiere) {
		this.joueurs = joueurs;
		this.premiereJoueur = premiere;
		for(Iterator<Joueur> it = joueurs.iterator();it.hasNext();) {
			it.next().setaJouee(false);
		}
		if(numTour == 1) {
			this.enableApocalypse = false;
		}
	}
	
	Tour(ArrayList<Joueur> joueurs, Tour tourAvant) {
		this.joueurs = joueurs;
		this.premiereJoueur = tourAvant.getPremiereJoueur();
		if(this.premiereJoueur == joueurs.size() - 1) {
			premiereJoueur = 0;
		}else {
			premiereJoueur ++;
		}
		for(Iterator<Joueur> it = joueurs.iterator();it.hasNext();) {
			it.next().setaJouee(false);
		}
		if(tourAvant.isEnableApocalypse() == false) {
			this.setEnableApocalypse(true);
		}
	}
	
	private void distribuerPointAction() {
		int n = joueurs.get(premiereJoueur).lancerDe();
		switch(n) {
		case 0:
			System.out.println("jour");
			int i = 0;
			while(i < joueurs.size()) {
				Joueur j = joueurs.get(i);
				if(j.getDivinite() == "jour") {
					j.setPointActionJour(j.getPointActionJour() + 2);
				} else if(j.getDivinite() == "Aube") {
					j.setPointActionJour(j.getPointActionJour() + 1);
				}
				i++;
			}
			break;
		case 1:
			System.out.println("neant");
			int i1 = 0;
			while(i1 < joueurs.size()) {
				Joueur j1 = joueurs.get(i1);
				if(j1.getDivinite() == "Aube" || j1.getDivinite()
						== "Crepuscule") {
					j1.setPointActionNeant(j1.getPointActionNeant() + 1);
				}
				i1++;
			}
			break;
		case 2:
			System.out.println("nuit");
			int i2=0;
			while(i2< joueurs.size()) {
				Joueur j2 = joueurs.get(i2);
				if(j2.getDivinite() == "Nuit") {
					j2.setPointActionJour(j2.getPointActionJour() + 2);
				}else if(j2.getDivinite() == "Crepuscule") {
					j2.setPointActionNuit(j2.getPointActionNuit() + 1);
				}
				i2++;
			}
			break;
		default:
			System.out.println("Il y a quelques erreurs en distributant des cartes");
			return;
		}
		
	}
	
	
	
	
	public void commencerNouveauTour() {
		this.distribuerPointAction();
		joueurs.get(premiereJoueur).phase();
		terminerLeTour();
	}
	public void terminerLeTour() {
		prochainTour = new Tour(joueurs, this);
		
		//test
		System.out.println("La tour prochain");
		prochainTour.commencerNouveauTour();
	}
	
	
	
	public int getPremiereJoueur() {
		return premiereJoueur;
	}
	public boolean isEnableApocalypse() {
		return enableApocalypse;
	}
	public void setEnableApocalypse(boolean enableApocalypse) {
		this.enableApocalypse = enableApocalypse;
	}
	public static int getnumTour() {
		return numTour;
	}
	public static void setnumTour(int numTour) {
		Tour.numTour = numTour;
	}

}
