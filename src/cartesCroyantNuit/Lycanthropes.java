package cartesCroyantNuit;
import modele.CarteAction;
import modele.Croyant;

public class Lycanthropes extends Croyant {

	public Lycanthropes() {
		this.nom="Lycanthropes";
		this.origine=CarteAction.NUIT;
		dogmes = new String[] {CarteAction.HUMAIN,CarteAction.NATURE,CarteAction.CHAOS};
		this.description="Retirez... ";
		this.nbPierre=4;
		
	}
	
	public void sacrifier(){
		
	}
		
}

