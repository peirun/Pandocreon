package cartesCroyantNuit;
import joueursControle.Joueur;
import modele.Croyant;

public class Pillards extends Croyant {
	
	public Pillards() {
	
		this.nom="Pillards";
		this.origine=Croyant.NUIT;
		dogmes = new String[] {Croyant.MYSTIQUE,Croyant.NATURE,Croyant.SYMBOLES};
		this.description="R¨¦cup¨¦rez les points d'Action d'une Divinit¨¦ n'ayant pas "
				+ "encore jou¨¦ durant ce tour. Les points d'Action "
				+ "gardent leur Origine. La Divinit¨¦ perd ses points.";
		this.nbPierre=4;
	}
	
	public void sacrifier(Joueur joueur){
//		this.joueur.setPointActionJour(joueur.getPointActionJour());
//		this.joueur.setPointActionNuit(joueur.getPointActionNuit());
//		this.joueur.setPointActionNeant(joueur.getPointActionNeant());
//		joueur.setPointActionJour(0);
//		joueur.setPointActionNuit(0);
//		joueur.setPointActionNeant(0);
//		
	}
		
}

