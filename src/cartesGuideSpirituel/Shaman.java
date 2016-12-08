package cartesGuideSpirituel;

import modele.Carte;
import modele.GuideSpirituel;

public class Shaman extends GuideSpirituel {
	public Shaman() {
		super();
		this.nom="Shaman";
		this.dogmes=new String[] {Carte.SYMBOLES,Carte.NATURE};
		this.origine=Carte.NUIT;
		this.nbCroyantMax=3;
	}
}
