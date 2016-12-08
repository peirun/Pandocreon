package cartesCroyantJour;
import modele.Croyant;

public class Moines5 extends Croyant {
	public Moines5() {
	
		this.nom="Moines";
		this.origine=Croyant.JOUR;
		this.description="Donne un point d'Action d'Origine Jour. ";
		this.nbPierre=2;
	}
	
	public void sacrifier(){
//		this.joueur.setPointActionJour(this.joueur.getPointActionJour()+1);
	}
		
}

