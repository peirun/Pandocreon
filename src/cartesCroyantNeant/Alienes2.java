package cartesCroyantNeant;
import joueursControle.Joueur;
import modele.Croyant;

public class Alienes2 extends Croyant{
	private String[] dogemesDivinite={"Chaos","Mistique"};
	public Alienes2() {
		this.nom="Alienes";
		this.origine=Croyant.NEANT;
		dogmes = new String[] {Croyant.HUMAIN,Croyant.NATURE,Croyant.SYMBOLES};
		this.description="Emp¨ºche une Divinit¨¦ poss¨¦dant le Dogme Chaos ou Mystique "
				+ "de sacrifier une de ses cartes de Guides Spirituels durant ce tour. ";
		this.nbPierre=2;
		
	}
	
	public void sacrifier(Joueur joueur){
//		joueur.setPeutSacrifierGuideSP(false);
	}

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
