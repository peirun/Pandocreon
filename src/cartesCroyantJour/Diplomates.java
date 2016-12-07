package cartesCroyantJour;
import java.util.LinkedList;

import joueursControle.Joueur;
import modele.Carte;
import modele.CarteAction;
import modele.Croyant;

public class Diplomates extends Croyant{
	
	
	public Diplomates() {
		
		this.nom="Diplomates";
		this.origine="jour";
		String[] dogmes= {CarteAction.SYMBOLES,CarteAction.HUMAIN,CarteAction.CHAOS};//problem
		this.description="Relancez le d¨¦ de Cosmogonie. "
				+ "Le tour se finit normalement sous la nouvelle influence.";
		this.nbPierre=4;
	}
	
	public void sacrifier(LinkedList<Joueur> joueur){
		for (int i = 0; i < joueur.size(); i++) {
			joueur.get(i).isaJouee();
		}
	}


}
