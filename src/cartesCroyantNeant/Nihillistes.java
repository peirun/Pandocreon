package cartesCroyantNeant;
import java.util.LinkedList;

import joueursControle.Joueur;
import modele.Croyant;

public class Nihillistes extends Croyant{
	public Nihillistes() {
		
		this.nom="Nihillistes";
		this.origine=Croyant.NEANT;
		dogmes = new String[] {Croyant.SYMBOLES,Croyant.MYSTIQUE,Croyant.CHAOS};
		this.description="Jusqu'a la fin du tour, plus aucune Divinite ne recoit ";
		this.nbPierre=4;
		
	}
	
	public void sacrifier(LinkedList<Joueur> joueurs){
//		for (int i = 0; i < joueurs.size(); i++) {
//			joueurs.get(i).setPeutRecoirPA(false);
//		}
	}

}
