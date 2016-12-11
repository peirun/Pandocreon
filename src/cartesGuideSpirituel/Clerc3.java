package cartesGuideSpirituel;

import modele.Carte;
import modele.GuideSpirituel;

public class Clerc3 extends GuideSpirituel {
	public Clerc3() {
		super();
		this.nom="Clerc3";
		this.dogmes=new String[] {Carte.CHAOS,Carte.HUMAIN};
		this.origine=Carte.JOUR;
		this.nbCroyantMax=2;
	}

	@Override
	public void sacrifier() {
		// TODO Auto-generated method stub
		
	}
}
