package cartesCroyantNeant;
import modele.Croyant;

public class Esprits5 extends Croyant {
	private String[] dogemes={"Nature","Mystique","Chaos"};
	
	public Esprits5() {
	
		this.nom="Esprits";
		this.origine=Croyant.NEANT;
		String[] dogmes= {Croyant.NATURE,Croyant.MYSTIQUE,Croyant.CHAOS};
		this.description="Donne un point d'Action d'Origine N¨¦ant. ";
		this.nbPierre=2;
	}
	
	public void sacrifier(){
//		this.joueur.setPointActionNeant(this.joueur.getPointActionNeant()+1);
	}
		
}

