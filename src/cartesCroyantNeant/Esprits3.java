package cartesCroyantNeant;
import modele.Croyant;

public class Esprits3 extends Croyant {
	
	public Esprits3() {
	
		this.nom="Esprits";
		this.origine=Croyant.NEANT;
		String[] dogmes= {Croyant.SYMBOLES,Croyant.MYSTIQUE,Croyant.CHAOS};
		this.description="Donne un point d'Action d'Origine N¨¦ant. ";
		this.nbPierre=2;
		
	}
	
	public void sacrifier(){
//		this.joueur.setPointActionNeant(this.joueur.getPointActionNeant()+1);
	}
		
}

