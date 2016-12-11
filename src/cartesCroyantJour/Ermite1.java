package cartesCroyantJour;
import modele.Croyant;

public class Ermite1 extends Croyant {
	
	
	public Ermite1() {
	
		this.nom="Ermite";
		this.origine=Croyant.JOUR;
		this.description="Impose le sacrifice d'un Croyant d'un autre joueur,"
				+ "qui choisit la carte. La capacit¨¦ sp¨¦ciale du sacrifice est jou¨¦e.";
		this.nbPierre=1;
		
	}

	@Override
	public void sacrifier() {
		// TODO Auto-generated method stub
		
	}
	
		
}

