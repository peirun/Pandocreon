package cartesGuideSpirituel;

import modele.Carte;
import modele.GuideSpirituel;

public class Socier extends GuideSpirituel {
	public Socier() {
		super();
		this.nom="Socier";
		this.dogmes=new String[] {Carte.MYSTIQUE,Carte.SYMBOLES};
		this.origine=Carte.NUIT;
		this.nbCroyantMax=3;
	}

	@Override
	public void sacrifier() {
		// TODO Auto-generated method stub
		
	}
}
