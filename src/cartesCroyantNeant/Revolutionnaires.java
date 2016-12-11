package cartesCroyantNeant;
import java.util.LinkedList;

import joueursControle.Joueur;
import modele.Croyant;

public class Revolutionnaires extends Croyant {
	public Revolutionnaires() {
	
		this.nom="Revolutionnaires";
		this.origine=Croyant.NEANT;
		dogmes = new String[] {Croyant.SYMBOLES,Croyant.HUMAIN,Croyant.CHAOS};
		this.description="Impose le sacrifice d'un Croyant d'un autre joueur, "
				+ "qui choisit la carte La capacit¨¦ sp¨¦ciale du sacrifice est jou¨¦e.";
		this.nbPierre=2;
	}
	
	public void sacrifier(Joueur joueur,LinkedList<Joueur> joueurs){
//		joueur.sacrifierCroyant(joueurs);
	}

	@Override
	public void sacrifier() {
		// TODO Auto-generated method stub
		
	}
		
}

