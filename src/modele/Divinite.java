package modele;

public abstract class Divinite extends Carte {

	public Divinite() {
		super();
		this.type="Divinite";
	}
	
	public String toString() {
	
		StringBuffer sb= new StringBuffer();
		
		sb.append("Divinite:" +this.nom+" ");
		sb.append("Origine:"+this.origine);
		return sb.toString();
	}
	
	public void capacite() {
		
	}
	
	
	
	public String getOrigine() {
		return super.origine;
	}
	
	public String getNom() {
		return this.nom;
	}
}
