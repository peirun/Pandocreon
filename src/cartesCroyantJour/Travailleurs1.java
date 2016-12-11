package cartesCroyantJour;
import modele.Croyant;

public class Travailleurs1 extends Croyant{
	private String[] dogemesDivinite={"Nature","Mistique"};
	public Travailleurs1() {
	
		this.nom="Travailleurs";
		this.origine=Croyant.JOUR;
		this.description="Emp¨ºche une Divinit¨¦ poss¨¦dant le Dogme Nature ou "
				+ "Mystique de sacrifier une de ses cartes de Croyants durant ce tour.";
		this.nbPierre=2;
	}
	
	
//=============================================================================
	public String[] getDogemesDivinite() {
		return dogemesDivinite;
	}

	public void setDogemesDivinite(String[] dogemesDivinite) {
		this.dogemesDivinite = dogemesDivinite;
	}

	@Override
	public void sacrifier() {
		// TODO Auto-generated method stub
		
	}

}
