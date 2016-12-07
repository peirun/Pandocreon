package cartesCroyantNeant;
import joueursControle.Joueur;
import modele.Croyant;

public class Alienes1 extends Croyant{
	
	private String[] dogemesDivinite={Croyant.NATURE,Croyant.MYSTIQUE};
	
	public Alienes1() {
	
		this.nom="Alienes";
		this.origine=Croyant.NEANT;
		String[] dogmes= {Croyant.SYMBOLES,Croyant.HUMAIN,Croyant.CHAOS};
		this.description="Emp¨ºche une Divinit¨¦ poss¨¦dant "
				+ "le Dogme Nature ou Mystique de sacrifier une de ses cartes de Croyants durant ce tour.";
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
