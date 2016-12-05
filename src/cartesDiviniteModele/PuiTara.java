package cartesDiviniteModele;

import modele.Carte;
import modele.Divinite;

public class PuiTara extends Divinite {
	public PuiTara() {
		this.type = "divinite";
		this.origine = Carte.NUIT;
		this.nom = "PuiTara";
		this.description = "";
		this.dogmes = new String[]{Carte.NATURE,Carte.MYSTIQUE,Carte.SYMBOLES};
	}
	
	public void capacite() {
	
	}
}
