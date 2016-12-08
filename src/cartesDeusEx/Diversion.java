package cartesDeusEx;

import modele.Carte;
import modele.DeusEx;

public class Diversion extends DeusEx {
	public Diversion() {
		super();
		this.nom="Diversion";
		this.origine=Carte.NUIT;
		this.description = "Prenez 3 cartes ";
	}
	
	public void sacrifier() {
	
	}
}
