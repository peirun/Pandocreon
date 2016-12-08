package cartesCroyantNuit;
import java.util.LinkedList;

import joueursControle.Joueur;
import modele.Croyant;

public class Vampire2 extends Croyant {
	public Vampire2() {
	
		this.nom="Vampire";
		this.origine=Croyant.NUIT;
		dogmes = new String[] {Croyant.MYSTIQUE,Croyant.HUMAIN,Croyant.CHAOS};
		this.description="Impose le sacrifice d'un Croyant d'un autre joueur, qui choisit la carte "
				+ "La capacit¨¦ sp¨¦ciale du sacrifice est jou¨¦e.";
		this.nbPierre=1;
	}
	
	public void sacrifier(Joueur joueur,LinkedList<Joueur> joueurs){
//		joueur.sacrifierCroyant(joueurs);
	}
		
}

