package cartesDiviniteModele;

import modele.Carte;
import modele.Divinite;

public class Sbingva extends Divinite {
	public Sbingva() {
		this.type = "divinite";
		this.origine = Carte.AUBE;
		this.nom = "Sbingva";
		this.description = "";
		this.dogmes = new String[]{Carte.HUMAIN,Carte.MYSTIQUE,Carte.CHAOS};
	}
	
	public void capacite() {
	
	}
}
