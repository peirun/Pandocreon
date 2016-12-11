package cartesGuideSpirituel;

import modele.Carte;
import modele.GuideSpirituel;

public class Paladin extends GuideSpirituel {
	public Paladin() {
		super();
		this.nom="Paladin";
		this.dogmes=new String[] {Carte.HUMAIN,Carte.MYSTIQUE};
		this.origine=Carte.JOUR;
		this.nbCroyantMax=3;
	}

	@Override
	public void sacrifier() {
		// TODO Auto-generated method stub
		
	}
}
