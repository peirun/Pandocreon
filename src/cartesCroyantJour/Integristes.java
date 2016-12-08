package cartesCroyantJour;
import java.util.LinkedList;

import joueursControle.Joueur;
import modele.Croyant;

public class Integristes extends Croyant {
	public Integristes() {
	
		this.nom="Integristes";
		this.origine=Croyant.JOUR;
		this.description="Impose le sacrifice d'un Guide Spirituel d'un "
				+ "autre joueur,qui choisit la carte La capacit¨¦ sp¨¦ciale du sacrifice est jou¨¦e.";
		this.nbPierre=1;
	}
	
	public void sacrifier(Joueur joueur,LinkedList<Joueur> joueurs){
//		joueur.sacrifierGuideSpirituel();
	}
		
}

