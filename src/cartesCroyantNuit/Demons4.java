package cartesCroyantNuit;
import joueursControle.Joueur;
import modele.CarteAction;
import modele.Croyant;

public class Demons4 extends Croyant {

	public Demons4() {
		this.nom="Demon";
		this.origine=CarteAction.NUIT;
		dogmes = new String[] {CarteAction.MYSTIQUE,CarteAction.NATURE,CarteAction.SYMBOLES};
		this.description="Donne un point d'Action d'Origine Nuit. ";
		this.nbPierre=2;
		
	}
	
	public void sacrifier(){
//		this.joueur.setPointActionNuit(this.joueur.getPointActionNuit()+1);
	}
	
	public void sacrifier(Joueur joueur){
		joueur.setPointActionNuit(joueur.getPointActionNuit()+1);
	}
		
}

