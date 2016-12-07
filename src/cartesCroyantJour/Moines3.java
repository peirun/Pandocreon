package cartesCroyantJour;
import modele.Croyant;

public class Moines3 extends Croyant {
	private String[] dogemes={"Symboles","Mystique","Chaos"};
	
	public Moines3() {
	
		this.nom="Moines";
		this.origine=Croyant.JOUR;
		String[] dogmes= {Croyant.SYMBOLES,Croyant.MYSTIQUE,Croyant.CHAOS};
		this.description="Donne un point d'Action d'Origine Jour. ";
		this.nbPierre=2;
	}
	
	public void sacrifier(){
//		this.joueur.setPointActionJour(this.joueur.getPointActionJour()+1);
	}
		
}

