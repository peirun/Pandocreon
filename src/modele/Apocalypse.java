package modele;
import joueursControle.*;


public abstract class Apocalypse extends CarteAction{
	public Apocalypse() {
		super();
		this.type="Apocalypse";
	}
	
	public void utiliser() {
	}
	
	public void sacrifier(Joueur joueur) {
	
		utiliser();
	}
	
}
