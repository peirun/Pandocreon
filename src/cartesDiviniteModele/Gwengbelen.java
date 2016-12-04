package cartesDiviniteModele;

import modele.*;

public class Gwengbelen extends Divinite {
	public Gwengbelen() {
		this.type = "divinite";
		this.origine = Carte.AUBE;
		this.nom = "Gwenghelen";
		this.description = "";
		this.dogmes = new String[]{Carte.HUMAIN,Carte.MYSTIQUE,Carte.SYMBOLES};
	}
	
	public void capacite() {
	
	}
}
