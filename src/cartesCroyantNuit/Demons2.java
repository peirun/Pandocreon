package cartesCroyantNuit;
import modele.CarteAction;
import modele.Croyant;

public class Demons2 extends Croyant {
	
	
	public Demons2() {
		this.type="croyant";
		this.nom="Demon";
		this.origine=CarteAction.NUIT;
		String[] dogmes= {CarteAction.MYSTIQUE,CarteAction.HUMAIN,CarteAction.CHAOS};
		this.description="Donne un point d'Action d'Origine Nuit.";
		this.nbPierre=2;
		
	}
	
	public void sacrifier(){
//		this.joueur.setPointActionNuit(this.joueur.getPointActionNuit()+1);
	}
		
}

