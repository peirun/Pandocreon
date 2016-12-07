package cartesCroyantJour;
import java.util.LinkedList;

import joueursControle.Joueur;
import modele.Croyant;

public class Ermite1 extends Croyant {
	private String[] dogemes={"Nature","Mystique","Chaos"};
	
	public Ermite1() {
	
		this.nom="Ermite";
		this.origine=Croyant.JOUR;
		String[] dogmes= {Croyant.NATURE,Croyant.MYSTIQUE,Croyant.CHAOS};
		this.description="Impose le sacrifice d'un Croyant d'un autre joueur,"
				+ "qui choisit la carte. La capacit¨¦ sp¨¦ciale du sacrifice est jou¨¦e.";
		this.nbPierre=1;
		
	}
	
	public void sacrifier(Joueur joueur,LinkedList<Joueur> joueurs){
//		joueur.sacrifierCroyant(joueurs);
	}
		
}

