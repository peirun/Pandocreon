package cartesGuideSpirituel;

import modele.Carte;
import modele.GuideSpirituel;

public class Martyr3 extends GuideSpirituel {
	public Martyr3() {
		super();
		this.nom="Martyr3";
		this.dogmes=new String[] {Carte.NATURE,Carte.CHAOS};
		this.origine=Carte.NEANT;
		this.nbCroyantMax=2;
	}

	@Override
	public void sacrifier() {
		// TODO Auto-generated method stub
		
	}
}
