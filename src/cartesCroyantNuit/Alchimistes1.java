package cartesCroyantNuit;
import joueursControle.Joueur;
import modele.Croyant;

public class Alchimistes1 extends Croyant{
	private String[] dogemes={"Symboles","Nature","Chaos"};
	private String[] dogemesDivinite={"Humain","Mistique"};
	
	public Alchimistes1() {
	
		this.nom="Alchimistes";
		this.origine=Croyant.NUIT;
		String[] dogmes= {Croyant.SYMBOLES,Croyant.NATURE,Croyant.CHAOS};
		this.description="Emp¨ºche une Divinit¨¦ poss¨¦dant le Dogme Humain ou Mystique "
				+ "de sacrifier une de ses cartes de Croyants durant ce tour de jeu.";
		this.nbPierre=2;
	}
	
	public void sacrifier(Joueur joueur){
//		joueur.setPeutSacrifierCroyant(false);
	}

	public String[] getDogemesDivinite() {
		return dogemesDivinite;
	}

	public void setDogemesDivinite(String[] dogemesDivinite) {
		this.dogemesDivinite = dogemesDivinite;
	}

}
