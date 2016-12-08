package cartesGuideSpirituel;

import modele.Carte;
import modele.GuideSpirituel;

public class Clerc8 extends GuideSpirituel {
	public Clerc8() {
		super();
		this.nom="Clerc8";
		this.dogmes=new String[] {Carte.HUMAIN,Carte.NATURE};
		this.origine=Carte.NUIT;
		this.nbCroyantMax=2;
	}
}
