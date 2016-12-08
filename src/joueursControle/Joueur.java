package joueursControle;

import modele.*;
import cartesControle.*;
import controle.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class Joueur {

	protected int numJoueur;
	protected ArrayList<CarteAction> cartesALaMain;
	protected Divinite divinite;
	protected int pointActionJour;
	protected int pointActionNeant;
	protected int pointActionNuit;
	protected int nbPriere;
	protected List<Croyant> croyants = new ArrayList<Croyant>();
	protected List<GuideSpirituel> guideSpirituels = new ArrayList<GuideSpirituel>();

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

	public abstract void choisirUneOperation();
	

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
	public abstract void utiliser();

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
		System.out.println(CartesSurTable.getInstance().getCroyantDeposes());
		System.out.println(CartesSurTable.getInstance().getCroyantRattaches(this));
		System.out.println(CartesSurTable.getInstance().getGuidesUtilises(this));
		this.choisirDefausse();
		this.completerMain();
		this.choisirUneOperation();
	}
	
	public void showPoinAction() {
		System.out.println("Divinite:"+this.getDivinite());
		System.out.println("Jour:"+ this.getPointActionJour());
		System.out.println("Nuit:"+this.getPointActionNuit());
		System.out.println("Neant:"+this.getPointActionNeant());	
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

	public void setCartesALaMain(ArrayList<CarteAction> cartes) {
		this.cartesALaMain = cartes;
	}

	public String getDivinite() {
		return divinite.toString();
	}

	public String getOrigine() {
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

	public int getNbPriere() {
		return nbPriere;
	}

}
