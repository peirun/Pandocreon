package cartesCroyantNuit;
import modele.CarteAction;
import modele.Croyant;

public class Illusionnistes extends Croyant {
	public Illusionnistes() {
		this.nom="Illusionnistes";
		this.origine=CarteAction.NUIT;
		dogmes = new String[] {CarteAction.SYMBOLES,CarteAction.HUMAIN,CarteAction.CHAOS};
		this.description="Vous b¨¦n¨¦ficiez de la capacit¨¦ sp¨¦ciale de sacrifice "
				+ "d'une carte de Croyants "
				+ "appartenant ¨¤ une autre Divinit¨¦.La carte en question reste en jeu. ";
		this.nbPierre=4;
	}
	
	public void sacrifier(){
		
		
}
}

