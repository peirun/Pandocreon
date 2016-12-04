package joueursControle;

import modele.*;
import cartesControle.*;
import cartesDiviniteModele.*;
import cartesCroyantModele.*;
import controle.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import modele.*;



public class Joueur {

	private int numJoueur;
	private ArrayList<CarteAction> cartesALaMain;
	private Divinite divinite;
	private int pointActionJour;
	private int pointActionNeant;
	private int pointActionNuit;
	private int nbPriere;
	private List<Croyant> croyants = new ArrayList<Croyant>();
	private List<GuideSpirituel> guideSpirituels = new ArrayList<GuideSpirituel>();
	private Phase phase;
	private CartesSurTable cartesSurTable = CartesSurTable.getCartesSurTable();
	private Joueur prochainJoueur;
	private static int nbJoueurs = 0;
	private boolean aJouee;

	public Joueur() {
		setCartesALaMain(new ArrayList<CarteAction>());
		// comment distribuer divinite
		// carteDivinite = new Divinite();
		setPointActionJour(0);
		setPointActionNeant(0);
		setPointActionNuit(0);
		nbPriere = 0;
		phase = new Phase(this);// phase(this)
		this.setNumJoueur(nbJoueurs);
		nbJoueurs++;

	}
	// obtenir pierre

	public void choisirUneOperation(int n) {
		switch (n) {
		case 0:
			deffausser();
			break;
		case 1:
			completerMain(Partie.getPartie().getCartes());
			break;
		case 2:
			utiliser();
			break;
		case 3:
			sacrifier();
			break;
		case 4:
			capaciter();
			break;
		default:
			//
			break;
		}
	}

//Choisir un operation
	public void deffausser() {
		// test
		System.out.println("deffausser");
	}

	public void utiliser() {
		// test
		System.out.println("utiliser");
	}

	public void completerMain(Cartes cartes) {
		// test
		System.out.println("completerMain");
	}

	public void sacrifier() {
		// test
		System.out.println("sacrifier");
	}

	public void capaciter() {
		// test
		System.out.println("capaciter");
	}
	
	public void mettreAFinTonPhase() {
		// test
		System.out.println("mettreAFinTonPhase");
	}

//autres methods
	public void lancerDe() {
		// test
		System.out.println("lancerDE");
	}

	public void phase() {
		// test
		System.out.println("PHASE COMMENCE");
		this.phase.start();
	}

	public void afficherCartes() {
		// test
		System.out.println("AFFICHERcARTES");
	}

	public void afficherPointAction() {
		// test
		System.out.println("AFFICHERpOINTaCTION");
	}

	// herite des methodes du joueur

	public int getNumJoueur() {
		return numJoueur;
	}

	public void setNumJoueur(int numJoueur) {
		this.numJoueur = numJoueur;
	}

	public ArrayList<CarteAction> getCartesALaMain() {
		return cartesALaMain;
	}

	public void setCartesALaMain(ArrayList<CarteAction> cartesALaMain) {
		this.cartesALaMain = cartesALaMain;
	}

	

	public string getDivinite() {
		return Divinite.getOrigine();
	}

	public void setDivinite(Divinite divinite) {
		this.divinite = divinite;
	}

	public int getPointActionJour() {
		return pointActionJour;
	}

	public void setPointActionJour(int pointActionJour) {
		this.pointActionJour = pointActionJour;
	}

	public int getPointActionNuit() {
		return pointActionNuit;
	}

	public void setPointActionNuit(int poinActionNuit) {
		this.pointActionNuit = poinActionNuit;
	}

	public int getPointActionNeant() {
		return pointActionNeant;
	}

	public void setPointActionNeant(int pointActionNeant) {
		this.pointActionNeant = pointActionNeant;
	}

	public List<Croyant> getCroyants() {
		return croyants;
	}

	public void setCroyants(List<Croyant> croyants) {
		this.croyants = croyants;
	}

	public List<GuideSpirituel> getGuideSpirituels() {
		return guideSpirituels;
	}

	public void setGuideSpirituels(List<GuideSpirituel> guideSpirituels) {
		this.guideSpirituels = guideSpirituels;
	}

	public CartesSurTable getCartesSurTable() {
		return cartesSurTable;
	}

	public void setCartesSurTable(CartesSurTable cartesSurTable) {
		this.cartesSurTable = cartesSurTable;
	}
	
	

	public int getNbPriere() {
		return nbPriere;
	}

	public boolean isaJouee() {
		return aJouee;
	}

	public void setaJouee(boolean aJouee) {
		this.aJouee = aJouee;
	}

	
	
	public Joueur getProchainJoueur() {
		return prochainJoueur;
	}

	public void setProchainJoueur(Joueur prochainJoueur) {
		this.prochainJoueur=prochainJoueur;
	}
	

}
