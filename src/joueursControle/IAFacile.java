package joueursControle;

import java.util.Random;

import controle.Partie;
import controle.Tour;
import joueursControle.Joueur;
import interfaceBoite.StrategieDecision;

public class IAFacile implements StrategieDecision {

	private Joueur joueur;
	public void sacrifier() {
		System.out.println("sacrifier");
	}

	@Override
	public void choisirDefausse() {
		// TODO Auto-generated method stub
		System.out.println("JoeurVirtuel a deja deffausse");
	}

	@Override
	public void utiliser() {
		// TODO Auto-generated method stub
		System.out.println("JoeurVirtuel a deja utilise");
	}
	
	public void mettreAFinTonPhase() {
		System.out.println("mettreAFinTonPhase");
		Tour t = Partie.getInstance().getTour();
		t.terminerPhase(joueur);
	}

	public Joueur getJoueur() {
		return joueur;
	}

	public void setJoueur(Joueur joueur) {
		this.joueur = joueur;
	}

	@Override
	public void choisirUneOperation() {
		// TODO Auto-generated method stub
		while (true) {
			System.out.println("chose un chiox: 0:utiliser, 1:sacrifier, 2:mettreAFinTonPhase");
			Random random = new Random();
			int n=random.nextInt(2);

			switch (n) {
			
			case 1:
				utiliser();
				break;
			case 2:
				sacrifier();
				break;
			
			default:
				//
				break;
			}
			mettreAFinTonPhase();
			System.out.println("JoeurVirtuel a deja choisirUneOperation");
		}
	
		
		
	}
	
	
}
