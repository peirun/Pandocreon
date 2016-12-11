package cartesCroyantJour;
import modele.Croyant;

public class Diplomates extends Croyant{
	
	
	public Diplomates() {
		
		this.nom="Diplomates";
		this.origine="jour";
		this.description="Relancez le d¨¦ de Cosmogonie. "
				+ "Le tour se finit normalement sous la nouvelle influence.";
		this.nbPierre=4;
	}


	@Override
	public void sacrifier() {
		// TODO Auto-generated method stub
		
	}


}
