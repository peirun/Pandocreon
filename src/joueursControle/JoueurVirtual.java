package joueursControle;
import interfaceBoite.StrategieDecision;
import modele.CarteAction;

public class JoueurVirtual extends Joueur {
	private StrategieDecision sd;

	private CarteAction c;

	public JoueurVirtual(StrategieDecision sd) {
		super();
		this.sd = sd;
		this.sd.setJoueur(this);
	}
	
	//just for test, remember to delete this after test
	public void showCartes() {
		for (int i = 0; i < cartesALaMain.size(); i++) {
			System.out.println(i + ".");
			System.out.println(cartesALaMain.get(i).toString());
		}
	}

	public void poserGuide(int index1) {
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

	public CarteAction getC() {
		return c;
	}

	public void setC(CarteAction c) {
		this.c = c;
	}
	
}
