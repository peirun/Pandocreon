package cartesApocalypse;

import controle.Partie;
import joueursControle.Joueur;
import modele.Apocalypse;
import modele.Carte;

public class Apocalypse3 extends Apocalypse {
	public Apocalypse3() {
		super();
		this.origine=Carte.NEANT;
	}
	
	public void sacrifier() {}
	
	public void sacrifier(Joueur j) {
		Partie.getInstance().ApocalypseProcess(j);
	}
}
