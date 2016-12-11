package cartesApocalypse;

import controle.Partie;
import joueursControle.Joueur;
import modele.Apocalypse;

public class Apocalypse5 extends Apocalypse {
	public Apocalypse5() {
		super();
		this.origine=null;
	}
	
	public void sacrifier() {}
	
	public void sacrifier(Joueur j) {
		Partie.getInstance().ApocalypseProcess(j);
	}
}
