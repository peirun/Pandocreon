package cartesApocalypse;

import controle.Partie;
import joueursControle.Joueur;
import modele.Apocalypse;
import modele.Carte;

public class Apocalypse4 extends Apocalypse {
	public Apocalypse4() {
		super();
		this.origine=Carte.JOUR;
	}
	
	public void sacrifier() {}
	public void sacrifier(Joueur j) {
		Partie.getInstance().ApocalypseProcess(j);
	}
}
