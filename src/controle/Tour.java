package controle;

import java.util.ArrayList;

import joueursControle.Joueur;
import joueursControle.JoueurPhysique;

public class Tour {
	private ArrayList<Joueur> joueurs;
	private int joueurCourant;
	private boolean enableApocalypse;
	private int numTour = 0;

	Tour(ArrayList<Joueur> joueurs) {
		this.joueurs = joueurs;
		this.enableApocalypse = false;
	}

	private void distribuerPointAction() {
		int n = joueurs.get(0).lancerDe();
		switch (n) {
		case 0:
			System.out.println("jour");
			int i = 0;
			while (i < joueurs.size()) {
				Joueur j = joueurs.get(i);
				if ("jour".equalsIgnoreCase(j.getOrigine())) {
					j.setPointActionJour(j.getPointActionJour() + 2);
				} else if ("aube".equalsIgnoreCase(j.getOrigine())) {
					j.setPointActionJour(j.getPointActionJour() + 1);
				}
				i++;
			}
			break;
		case 1:
			System.out.println("neant");
			int i1 = 0;
			while (i1 < joueurs.size()) {
				Joueur j1 = joueurs.get(i1);
				if ("Aube".equalsIgnoreCase(j1.getOrigine()) || "crepuscule".equalsIgnoreCase(j1.getOrigine())) {
					j1.setPointActionNeant(j1.getPointActionNeant() + 1);
				}
				i1++;
			}
			break;
		case 2:
			System.out.println("nuit");
			int i2 = 0;
			while (i2 < joueurs.size()) {
				Joueur j2 = joueurs.get(i2);
				if ("nuit".equalsIgnoreCase(j2.getOrigine())) {
					j2.setPointActionJour(j2.getPointActionJour() + 2);
				} else if ("crepuscule".equalsIgnoreCase(j2.getOrigine())) {
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

	private void joueurSuivant() {
		System.out.println("Joueur " + joueurCourant);
		if(joueurs.get(joueurCourant) instanceof JoueurPhysique) {
			//JoueurPhysique.getDivinite();
			JoueurPhysique joueur = (JoueurPhysique) joueurs.get(joueurCourant);
			joueur.showPoinAction();
			joueur.showCartes();
		}
		joueurs.get(joueurCourant).phase();
	}

	public void commencerNouveauTour() {
		++numTour;
		// test
		System.out.println("Debut de tour");
		this.distribuerPointAction();
		this.joueurCourant = 0;
		joueurSuivant();
	}

	public void terminerLeTour() {
		joueurs.add(joueurs.remove(0));
		commencerNouveauTour();
	}

	public void terminerPhase(Joueur j) {
		if (joueurs.indexOf(j) == joueurCourant) {
			++joueurCourant;
			if (joueurCourant >= joueurs.size()) {
				terminerLeTour();
			} else {
				joueurSuivant();
			}
		}
	}

	public boolean isEnableApocalypse() {
		return enableApocalypse;
	}

	public void setEnableApocalypse(boolean enableApocalypse) {
		this.enableApocalypse = enableApocalypse;
	}

	public int getnumTour() {
		return numTour;
	}

}
