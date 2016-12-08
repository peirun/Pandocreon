package cartesGuideSpirituel;

import modele.Carte;
import modele.GuideSpirituel;

public class Clerc7 extends GuideSpirituel {
	public Clerc7() {
		super();
		this.nom="Clerc7";
		this.dogmes=new String[] {Carte.CHAOS,Carte.NATURE};
		this.origine=Carte.JOUR;
		this.nbCroyantMax=2;
	}
}
