package cartesCroyantJour;
import joueursControle.Joueur;
import modele.Croyant;

public class Travailleurs2 extends Croyant{
	private String[] dogemesDivinite={"Chaos","Mistique"};

	
	public Travailleurs2() {
	
		this.nom="Travailleurs";
		this.origine=Croyant.JOUR;
		dogmes = new String[] {Croyant.HUMAIN,Croyant.NATURE,Croyant.SYMBOLES};
		this.description="Emp¨ºche une Divinit¨¦ poss¨¦dant le Dogme "
				+ "Chaos ou Mystique de sacrifier une de ses cartes de Guides Spirituels durant ce tour.";
		this.nbPierre=2;
	}
	
	public void sacrifier(Joueur joueur){
//		joueur.setPeutSacrifierGuideSP(false);
	}

//================================================================================
	public String[] getDogemesDivinite() {
		return dogemesDivinite;
	}

	public void setDogemesDivinite(String[] dogemesDivinite) {
		this.dogemesDivinite = dogemesDivinite;
	}
}
