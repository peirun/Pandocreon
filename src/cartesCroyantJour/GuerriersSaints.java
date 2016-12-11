package cartesCroyantJour;
import modele.Croyant;

public class GuerriersSaints extends Croyant {

	public GuerriersSaints() {
	
		this.nom="GuerriersSaints";
		this.origine=Croyant.JOUR;
		dogmes = new String[] {Croyant.MYSTIQUE,Croyant.NATURE,Croyant.SYMBOLES};
		this.description="Un Guide Spirituel revient dans la main de sa Divinit¨¦. "
				+ "Ses Croyants reviennent au centre de la table.";
		this.nbPierre=4;
	}
	
	@Override
	public void sacrifier() {
		// TODO Auto-generated method stub
		
	}
		
}

