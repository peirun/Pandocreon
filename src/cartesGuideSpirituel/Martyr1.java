package cartesGuideSpirituel;

import modele.Carte;
import modele.GuideSpirituel;

public class Martyr1 extends GuideSpirituel {
	public Martyr1() {
		super();
		this.nom="Martyr1";
		this.dogmes=new String[] {Carte.NATURE,Carte.HUMAIN};
		this.origine=Carte.JOUR;
		this.nbCroyantMax=2;
	}

	@Override
	public void sacrifier() {
		// TODO Auto-generated method stub
		
	}
}
