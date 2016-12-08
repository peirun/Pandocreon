package cartesCroyantNuit;
import modele.CarteAction;
import modele.Croyant;

public class Demons3 extends Croyant {
	public Demons3() {
		this.nom="Demon";
		this.origine=CarteAction.NUIT;
		dogmes = new String[] {CarteAction.SYMBOLES,CarteAction.MYSTIQUE,CarteAction.CHAOS};
		this.description="Donne un point d'Action d'Origine Nuit. ";
		this.nbPierre=2;
		
	}
	
	public void sacrifier(){
//		this.joueur.setPointActionNuit(this.joueur.getPointActionNuit()+1);
	}
		
}

