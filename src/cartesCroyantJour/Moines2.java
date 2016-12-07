package cartesCroyantJour;
import modele.Croyant;

public class Moines2 extends Croyant {
	private String[] dogemes={"Mystique","Humain","Chaos"};
	
	public Moines2() {
	
		this.nom="Moines";
		this.origine=Croyant.JOUR;
		String[] dogmes= {Croyant.MYSTIQUE,Croyant.HUMAIN,Croyant.CHAOS};
		this.description="Donne un point d'Action d'Origine Jour. ";
		this.nbPierre=2;
	}
	
	public void sacrifier(){
//		this.joueur.setPointActionJour(this.joueur.getPointActionJour()+1);
	}
		
}

