package cartesControle;

import java.util.ArrayList;
import java.util.Random;

import modele.CarteAction;

public class Cartes {

	private ArrayList<CarteAction> cartes;
	private int nbCartes;
	private static Cartes cartesPioche;
	
	private Cartes() {
		cartes=new ArrayList<CarteAction>();
		//ajouter cartes specifier [Pas finir]
		
		
		nbCartes = cartes.size();
		
	}
	//melanger des cartes
	public void melanger() {
		
	}
	
	//nombre de cartes
	public int getNbCartes() {
		return this.nbCartes;
	}
	
	//retirer carte [comment evider des cartes ne sont pas doublon]
	public CarteAction retirerCarte() {
		Random ca= new Random();
		return cartes.get(ca.nextInt(cartes.size()));
	}	
	
	public ArrayList<CarteAction> getCartes(){
		return this.cartes;
	}
	
	//sigleton
	public static Cartes getInstance() {
		if(cartesPioche==null) {
			cartesPioche=new Cartes();
		}
		return cartesPioche;
	}
	
	public ArrayList<CarteAction> getCartes() {
		return this.cartes;
	}
	
	

}
