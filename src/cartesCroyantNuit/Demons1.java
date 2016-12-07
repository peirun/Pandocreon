package cartesCroyantNuit;
import modele.CarteAction;
import modele.Croyant;

public class Demons1 extends Croyant {
	
	public Demons1() {
		this.type="croyant";
		this.nom="Demon";
		this.origine=CarteAction.NUIT;
		String[] dogmes= {CarteAction.HUMAIN,CarteAction.NATURE,CarteAction.MYSTIQUE};
		this.description="Donne un point d'Action d'Origine Nuit. ";
		this.nbPierre=2;
		
	}
	
	public void sacrifier(){
//		this.joueur.setPointActionNuit(this.joueur.getPointActionNuit()+1);
	}
		
}

