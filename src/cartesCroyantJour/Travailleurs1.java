package cartesCroyantJour;
import joueursControle.Joueur;
import modele.Croyant;

public class Travailleurs1 extends Croyant{
	private String[] dogemes={"Symboles","Humain","Chaos"};
	private String[] dogemesDivinite={"Nature","Mistique"};
	
	
	public Travailleurs1() {
	
		this.nom="Travailleurs";
		this.origine=Croyant.JOUR;
		String[] dogmes= {Croyant.SYMBOLES,Croyant.HUMAIN,Croyant.CHAOS};
		this.description="Emp¨ºche une Divinit¨¦ poss¨¦dant le Dogme Nature ou "
				+ "Mystique de sacrifier une de ses cartes de Croyants durant ce tour.";
		this.nbPierre=2;
	}
	
	public void sacrifier(Joueur joueur){
//		joueur.setPeutSacrifierCroyant(false);
	}

	
//=============================================================================
	public String[] getDogemesDivinite() {
		return dogemesDivinite;
	}

	public void setDogemesDivinite(String[] dogemesDivinite) {
		this.dogemesDivinite = dogemesDivinite;
	}

}
