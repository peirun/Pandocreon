package cartesCroyantNeant;
import java.util.LinkedList;

import joueursControle.Joueur;
import modele.Croyant;

public class Revenant extends Croyant{
	private String[] dogemes={"Humain","Nature","Mystique"};
	
	public Revenant() {
	
		this.nom="Revenant";
		this.origine=Croyant.NEANT;
		String[] dogmes= {Croyant.HUMAIN,Croyant.NATURE,Croyant.MYSTIQUE};
		this.description="Relancez le d�� de Cosmogonie. "
				+ "Le tour se finit normalement sous la nouvelle influence.";
		this.nbPierre=1;
		
	}
	
	public void sacrifier(LinkedList<Joueur> joueurs){
//		for (int i = 0; i < joueurs.size(); i++) {
//			joueurs.get(i).setAjoue(true);
//		}
	}

}
