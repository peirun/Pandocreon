package cartesCroyantJour;
import modele.Croyant;

public class Integristes extends Croyant {
	public Integristes() {
	
		this.nom="Integristes";
		this.origine=Croyant.JOUR;
		this.description="Impose le sacrifice d'un Guide Spirituel d'un "
				+ "autre joueur,qui choisit la carte La capacit¨¦ sp¨¦ciale du sacrifice est jou¨¦e.";
		this.nbPierre=1;
	}

	@Override
	public void sacrifier() {
		// TODO Auto-generated method stub
		
	}
		
}

