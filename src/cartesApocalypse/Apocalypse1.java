package cartesApocalypse;

import controle.Partie;
import joueursControle.Joueur;
import modele.Apocalypse;

public class Apocalypse1 extends Apocalypse {
	public Apocalypse1() {
		super();
		this.origine=null;
	}
	
	public void sacrifier(Joueur j) {
		Partie.getInstance().ApocalypseProcess(j);
	}

	@Override
	public void sacrifier() {
		// TODO Auto-generated method stub
		
	}
}
