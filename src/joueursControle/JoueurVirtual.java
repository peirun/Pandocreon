package joueursControle;

import java.util.ArrayList;
import java.util.List;

import modele.CarteAction;
import modele.GuideSpirituel;

public class JoueurVirtual {

	public JoueurVirtual() {
	
	}
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

	public Divinite getCarteDivinite() {
		return carteDivinite;
	}

	public void setCarteDivinite(Divinite carteDivinite) {
		this.carteDivinite = carteDivinite;
	}

	public int getPointActionJour() {
		return pointActionJour;
	}

	public void setPointActionJour(int pointActionJour) {
		this.pointActionJour = pointActionJour;
	}

	public int getPoinActionNuit() {
		return poinActionNuit;
	}

	public void setPoinActionNuit(int poinActionNuit) {
		this.poinActionNuit = poinActionNuit;
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

	public boolean isaJouee() {
		return aJouee;
	}

	public void setaJouee(boolean aJouee) {
		this.aJouee = aJouee;
	}

	public int getNbPierre() {
		return nbPierre;
	}
}
