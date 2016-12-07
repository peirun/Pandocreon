package cartesCroyantJour;
import modele.Croyant;

public class Moines4 extends Croyant {
	
	
	public Moines4() {
	
		this.nom="Moines";
		this.origine=Croyant.JOUR;
		String[] dogmes= {Croyant.MYSTIQUE,Croyant.NATURE,Croyant.SYMBOLES};
		this.description="Donne un point d'Action d'Origine Jour. ";
		this.nbPierre=2;
		
	}
	
	public void sacrifier(){
//		this.joueur.setPointActionJour(this.joueur.getPointActionJour()+1);
	}
		
}

