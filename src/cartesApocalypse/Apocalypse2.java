package cartesApocalypse;

import controle.Partie;
import joueursControle.Joueur;
import modele.Apocalypse;
import modele.Carte;

public class Apocalypse2 extends Apocalypse {
	public Apocalypse2() {
		super();
		this.origine=Carte.NUIT;
	}
	
	public void sacrifier() {}
	
	public void sacrifier(Joueur j) {
		Partie.getInstance().ApocalypseProcess(j);
	}
}
