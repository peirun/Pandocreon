package cartesDiviniteModele;

import modele.Carte;
import modele.Divinite;

public class Killinstred extends Divinite {
	public Killinstred() {
		this.origine = Carte.NUIT;
		this.nom = "Killinstred";
		this.description = "";
		this.dogmes = new String[]{Carte.NATURE,Carte.MYSTIQUE,Carte.CHAOS};
	}
	
	public void capacite() {

	}
}
