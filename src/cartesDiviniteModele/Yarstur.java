package cartesDiviniteModele;

import modele.Carte;
import modele.Divinite;

public class Yarstur extends Divinite {

	public Yarstur() {
		this.type = "divinite";
		this.origine = Carte.JOUR;
		this.nom = "Yarstur";
		this.description = "";
		this.dogmes = new String[]{Carte.CHAOS,Carte.SYMBOLES,Carte.MYSTIQUE};
	}
	
	public void capacite() {

	}

}
