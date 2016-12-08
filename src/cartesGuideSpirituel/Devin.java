package cartesGuideSpirituel;

import modele.Carte;
import modele.GuideSpirituel;

public class Devin extends GuideSpirituel {
	public Devin() {
		super();
		this.nom="Devin";
		this.dogmes=new String[] {Carte.MYSTIQUE,Carte.NATURE};
		this.origine=Carte.NEANT;
		this.nbCroyantMax=1;
	}
}
