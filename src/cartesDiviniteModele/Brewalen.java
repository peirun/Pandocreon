package cartesDiviniteModele;


public class Brewalen extends Divinite {
	public Brewalen() {
		this.type = "divinite";
		this.origine = Carte.JOUR;
		this.nom = "Brewalen";
		this.description = "";
		this.dogmes = new String[]{Carte.NATURE,Carte.HUMAIN,Carte.MYSTIQUE};
	}
	
	public void capacite() {
	
	}
}
