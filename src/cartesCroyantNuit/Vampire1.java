package cartesCroyantNuit;
import java.util.LinkedList;

import joueursControle.Joueur;
import modele.Croyant;

public class Vampire1 extends Croyant {
	private String[] dogemes={"Humain","Nature","Symboles"};
	
	public Vampire1() {
	
		this.nom="Vampire";
		this.origine=Croyant.NUIT;
		String[] dogmes= {Croyant.HUMAIN,Croyant.NATURE,Croyant.SYMBOLES};
		this.description="Impose le sacrifice d'un Croyant d'un autre joueur,"
				+ " qui choisit la carte. La capacit�� sp��ciale du sacrifice est jou��e.";
		this.nbPierre=1;
		
	}
	
	public void sacrifier(Joueur joueur,LinkedList<Joueur> joueurs){
//		joueur.sacrifierCroyant(joueurs);
	}
		
}

