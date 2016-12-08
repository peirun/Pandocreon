package cartesGuideSpirituel;

import modele.Carte;
import modele.GuideSpirituel;

public class Ascete extends GuideSpirituel {
	public Ascete() {
		super();
		this.nom="Ascete";
		this.dogmes=new String[] {Carte.HUMAIN,Carte.SYMBOLES};
		this.origine=Carte.NUIT;
		this.nbCroyantMax=1;
	}
}
