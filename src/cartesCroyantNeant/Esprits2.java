package cartesCroyantNeant;
import modele.Croyant;

public class Esprits2 extends Croyant {

	public Esprits2() {
		this.nom="Esprits";
		this.origine=Croyant.NEANT;
		dogmes = new String[] {Croyant.MYSTIQUE,Croyant.HUMAIN,Croyant.CHAOS};
		this.description="Donne un point d'Action d'Origine N¨¦ant. ";
		this.nbPierre=2;
	}
	
	public void sacrifier(){
//		this.joueur.setPointActionNeant(this.joueur.getPointActionNeant()+1);
	}
		
}

