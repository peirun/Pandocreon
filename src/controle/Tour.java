package controle;
import joueursControle.*;
import cartesControle.*;
import cartesCroyantModele.*;
import cartesDiviniteModele.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.*;

import modele.*;


public class Tour {
	
	private Tour prochainumTour;
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
			int k = 0;
			while(k < joueurs.size()) {
				Joueur j = joueurs.get(k);
				if(j.getDivinite() == "Aube" || j.getDivinite()
						== "Crepuscule") {
					j.setPointActionNeant(j.getPointActionNeant() + 1);
				}
				k++;
			}
			break;
		case 2:
			System.out.println("nuit");
			int i1 = 0;
			while(i1 < joueurs.size()) {
				Joueur j = joueurs.get(i1);
				if(j.getDivinite() == "Nuit") {
					j.setPointActionJour(j.getPointActionJour() + 2);
				}else if(j.getDivinite() == "Crepuscule") {
					j.setPointActionNuit(j.getPointActionNuit() + 1);
				}
				i1++;
			}
			break;
		default:
			return;
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
	
	
	public void commencerNouveauTour() {
		distribuerPointAction();
		joueurs.get(premiereJoueur).phase();
		terminerLeTour();
	}
	public void terminerLeTour() {
		prochainumTour = new Tour(joueurs, this);
		
		//测试代码 ，用后删除！！！
		System.out.println("进入下一圈");
		prochainumTour.commencerNouveauTour();
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
