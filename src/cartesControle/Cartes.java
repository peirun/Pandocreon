package cartesControle;

import java.util.ArrayList;
import java.util.Random;

import modele.Carte;
import modele.CarteAction;

public class Cartes {

	private ArrayList<CarteAction> cartes;
	private int nbCartes;
	private static Cartes cartesPioche;
	private int numCarte;
	
	private Cartes() {
		cartes=new ArrayList<CarteAction>();
		//ajouter cartes specifier [Pas finir]
		
		
		nbCartes = cartes.size();
		
	}
	
	//sigleton
	public static Cartes getInstance() {
		if(cartesPioche==null) {
			cartesPioche=new Cartes();
		}
		return cartesPioche;
	}  
	public ArrayList<CarteAction> getCartes() {
		return cartes;
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
//		Random ca= new Random();
//		return cartes.get(ca.nextInt(cartes.size()));
		Random r= new Random();
		int ca = r.nextInt(cartes.size());
		CarteAction carte = cartes.get(ca);
		cartes.remove(ca);
		return carte;
			
	}	
	
	
	
	
	
	
	

}
