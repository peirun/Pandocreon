package modele;
import interfaceBoite.Sacrifier;
import joueursControle.Joueur;

public abstract class Croyant extends CarteAction implements Sacrifier {

	protected boolean estRattache;

	protected int nbPierre;
	
	
	protected Croyant() {
		super();
		this.type="Croyant";
	}
	
	
	
	
	
	public boolean isEstRattache() {
		return estRattache;
	}



	public void setEstRattache(boolean estRattache) {
		this.estRattache = estRattache;
	}



	



	public int getNbPierre() {
		return nbPierre;
	}



	public void setNbPierre(int nbPierre) {
		this.nbPierre = nbPierre;
	}



	public void utiliser() {
	
	}
	
	public void sacrifier(Joueur joueur) {}
}
