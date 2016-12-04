package cartesDiviniteModele;



public class Drinded extends Divinite {
	public Drinded() {
		this.type = "divinite";
		this.origine = Carte.JOUR;
		this.nom = "Drinded";
		this.description = "";
		this.dogmes = new String[]{Carte.HUMAIN,Carte.NATURE,Carte.SYMBOLES};
	}
	
	public void capacite() {

	}
}
