package cartesGuideSpirituel;

import controle.Partie;
import joueursControle.Joueur;
import modele.Carte;
import modele.GuideSpirituel;

public class Martyr2 extends GuideSpirituel {
	public Martyr2() {
		super();
		this.nom="Martyr2";
		this.dogmes=new String[] {Carte.SYMBOLES,Carte.HUMAIN};
		this.origine=Carte.NUIT;
		this.nbCroyantMax=2;
	}

	@Override
	public void sacrifier() {
		// TODO Auto-generated method stub
		
	}
	
	public void sacrifier(Joueur j) {
		Partie.getInstance().ApocalypseProcess(j);
	}
}
