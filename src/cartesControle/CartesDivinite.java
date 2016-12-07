package cartesControle;
import cartesDiviniteModele.*;
import java.util.Random;
import java.util.LinkedList;
import java.util.List;

import modele.CarteAction;
import modele.Divinite;

public class CartesDivinite {
	private static List<Divinite> divinitesPioche=new LinkedList<Divinite>();
	private static CartesDivinite cartesDivinite = null;
	
	public static CartesDivinite getInstance() {
		if(cartesDivinite==null) {
			cartesDivinite = new CartesDivinite();
		}
		
		return cartesDivinite;
	}
	
	private CartesDivinite() {
		divinitesPioche.add(new Brewalen());
		divinitesPioche.add(new Drinded());
		divinitesPioche.add(new Gorpa());
		divinitesPioche.add(new Gwengbelen());
		divinitesPioche.add(new Killinstred());
		divinitesPioche.add(new Llewella());
		divinitesPioche.add(new PuiTara());
		divinitesPioche.add(new Romtec());
		divinitesPioche.add(new Sbingva());
		divinitesPioche.add(new Yarstur());
	}
	
	public Divinite returnDivinite() {
		return divinitesPioche.remove(new Random().nextInt(divinitesPioche.size()));
	}

	public List<Divinite> getCartesDivinite() {
		return CartesDivinite.divinitesPioche;
	}
	
	
	
	
}
