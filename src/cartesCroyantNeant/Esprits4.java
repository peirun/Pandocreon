package cartesCroyantNeant;
import modele.Croyant;

public class Esprits4 extends Croyant {

	public Esprits4() {
	
		this.nom="Esprits";
		this.origine=Croyant.NEANT;
		dogmes = new String[] {Croyant.MYSTIQUE,Croyant.NATURE,Croyant.SYMBOLES};
		this.description="Donne un point d'Action d'Origine N¨¦ant. ";
		this.nbPierre=2;
	}
	
	public void sacrifier(){
//		this.joueur.setPointActionNeant(this.joueur.getPointActionNeant()+1);
	}
		
}

