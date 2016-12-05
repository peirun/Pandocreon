package modele;
import interfaceBoite.Sacrifier;
import joueursControle.Joueur;

public class Croyant extends CarteAction implements Sacrifier {

	private boolean estRattache;
	private int nbCroyantRepresente; 
	
	protected Croyant() {
		super();
		this.type="Croyant";
	}
	
	public void utiliser() {
	
	}
	
	public void sacrifier(Joueur joueur) {}
}
