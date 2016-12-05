package cartesDiviniteModele;

import modele.Divinite;
import modele.Carte;

public class Gorpa extends Divinite {
	public Gorpa() {
		this.type = "divinite";
		this.origine = Carte.CREPUSCULE;
		this.nom = "Gorpa";
		this.description = "";
		this.dogmes = new String[]{Carte.HUMAIN,Carte.CHAOS,Carte.SYMBOLES};
	}
	
	public void capacite() {
	
	}
}
