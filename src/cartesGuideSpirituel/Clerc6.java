package cartesGuideSpirituel;

import modele.Carte;
import modele.GuideSpirituel;

public class Clerc6 extends GuideSpirituel {
	public Clerc6() {
		super();
		this.nom="Clerc6";
		this.dogmes=new String[] {Carte.SYMBOLES,Carte.CHAOS};
		this.origine=Carte.NEANT;
		this.nbCroyantMax=2;
	}
}
