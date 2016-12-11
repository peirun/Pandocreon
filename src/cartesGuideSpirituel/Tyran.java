package cartesGuideSpirituel;

import modele.Carte;
import modele.GuideSpirituel;

public class Tyran extends GuideSpirituel {
	public Tyran() {
		super();
		this.nom="Tyran";
		this.dogmes=new String[] {Carte.SYMBOLES,Carte.CHAOS};
		this.origine=Carte.NEANT;
		this.nbCroyantMax=3;
	}

	@Override
	public void sacrifier() {
		// TODO Auto-generated method stub
		
	}
}
