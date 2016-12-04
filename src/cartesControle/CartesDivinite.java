package cartesControle;

import java.util.LinkedList;
import java.util.List;

import modele.Divinite;

public class CartesDivinite {
	private static List<Divinite> divinitesPioche=new LinkedList<Divinite>();
	private static CartesDivinite cartesDivinite = null;
	
	private static CartesDivinite getInstance() {
		if(cartesDivinite==null) {
			cartesDivinite = new CartesDivinite();
		}
		
		return cartesDivinite;
	}
	
	private CartesDivinite() {
		pile.add(new Brewalen());
		pile.add(new Drinded());
		pile.add(new Gorpa());
		pile.add(new Gwengbelen());
		pile.add(new Killinstred());
		pile.add(new Llewella());
		pile.add(new PuiTara());
		pile.add(new Romtec());
		pile.add(new Sbingva());
		pile.add(new Yarstur());
	}
	
	public Divinite returnDivinite() {
		return cartesDivinite.remove(new Random().nextInt(cartesDivinite.size()));
	}

	public List<Divinite> getCartesDivinite() {
		return cartesDivinite;
	}
	
	
}
