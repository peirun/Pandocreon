package cartesDiviniteModele;

import modele.Carte;
import modele.Divinite;

public class Llewella extends Divinite {
	public Llewella() {
		this.origine = Carte.NUIT;
		this.nom = "Llewella";
		this.description = "";
		this.dogmes = new String[]{Carte.NATURE,Carte.MYSTIQUE,Carte.CHAOS};
	}
	
	public void capacite() {
	
	}
}
