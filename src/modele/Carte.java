package modele;

public class Carte {
	
	public static final String JOUR="jour";
	public static final String NUIT="nuit";
	public static final String NEANT="neant";
	public static final String AUBE="aube";
	public static final String CREPUSCULE="crepuscule";
	
	public static final String CHAOS = "chaos";
	public static final String HUMAIN = "humain";
	public static final String MYSTIQUE = "mystique";
	public static final String NATURE = "nature";
	public static final String SYMBOLES = "symboles";
	
	
	protected String type;
	protected String nom;
	protected String origine;
	protected String[] dogmes;
	protected String description;
	
	public String getType() {
		return this.type;
	}
	
	public String getOrigine() {
		return this.origine;
	}
	
	
	
	public String[] getDogmes() {
		return dogmes;
	}

	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("----------------------------------------------------------------------\n");
		sb.append("TYPE: " + this.type + '\n');
		sb.append("NOM: "+ this.nom + '\n');
		sb.append("ORIGINE:" + this.origine + '\n');
		sb.append("DESCRIPTION: " + this.description + '\n');
		sb.append("----------------------------------------------------------------------" + '\n');
		return sb.toString();
	
	}
	
	
	
}
