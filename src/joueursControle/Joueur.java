package joueursControle;

import modele.*;
import cartesControle.*;
import controle.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class Joueur {

	private int numJoueur;
	private ArrayList<CarteAction> cartesALaMain;
	private Divinite divinite;
	private int pointActionJour;
	private int pointActionNeant;
	private int pointActionNuit;
	private int nbPriere;
	private List<Croyant> croyants = new ArrayList<Croyant>();
	private List<GuideSpirituel> guideSpirituels = new ArrayList<GuideSpirituel>();
	private CartesSurTable cartesSurTable = CartesSurTable.getCartesSurTable();

	public Joueur() {
		setCartesALaMain(new ArrayList<CarteAction>());
		// comment distribuer divinite
		// carteDivinite = new Divinite();
		setPointActionJour(0);
		setPointActionNeant(0);
		setPointActionNuit(0);
		nbPriere = 0;
		this.divinite = CartesDivinite.getInstance().returnDivinite();
	}
	// obtenir pierre

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


	public void utiliser() {
		// test
		System.out.println("utiliser");
	}

	public final void completerMain() {
		// test
		Cartes cartes = Cartes.getInstance();
		System.out.println("completerMain");

		while (cartesALaMain.size() < 7) {
			cartesALaMain.add(cartes.retirerCarte());// nouveaux
		}
	}

	public abstract void choisirDefausse();

	public void sacrifier() {
		// test
		System.out.println("sacrifier");
	}

	public void mettreAFinTonPhase() {
		// test
		System.out.println("mettreAFinTonPhase");
		Tour t = Partie.getInstance().getTour();
		t.terminerPhase(this);
	}

	// autres methods
	public final int lancerDe() {
		// test
		System.out.println("lancerDE");
		Random random = new Random();
		return random.nextInt(3);
	}

	public void phase() {
		// test
		System.out.println("PHASE COMMENCE");
		this.choisirDefausse();
		this.completerMain();
		this.choisirUneOperation();
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

	public String getDivinite() {
		return divinite.getOrigine();
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

}
