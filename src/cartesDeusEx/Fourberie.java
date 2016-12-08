package cartesDeusEx;

import modele.Carte;
import modele.DeusEx;

public class Fourberie extends DeusEx {
	public Fourberie() {
		super();
		this.nom="Fourberie";
		this.origine=Carte.NUIT;
		this.description = "Sacrifiez 2 cartes";
	}
	
	public void sacrifier() {
	
	}
}
