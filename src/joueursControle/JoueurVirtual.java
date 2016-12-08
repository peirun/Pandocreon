package joueursControle;
import interfaceBoite.StrategieDecision;

public class JoueurVirtual extends Joueur {
	private StrategieDecision sd;

	

	public JoueurVirtual(StrategieDecision sd) {
		super();
		this.sd = sd;
		this.sd.setJoueur(this);
	}

	@Override
	public void choisirDefausse() {
		
		sd.choisirDefausse();
	}

	@Override
	public void choisirUneOperation() {
		
		sd.choisirUneOperation();
	}

	@Override
	public void utiliser() {
		
		sd.utiliser();
	}
	
}
