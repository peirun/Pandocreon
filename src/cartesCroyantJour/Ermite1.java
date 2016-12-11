package cartesCroyantJour;
import java.util.ArrayList;
import java.util.Iterator;

import Input.Input;
import controle.Partie;
import joueursControle.Joueur;
import modele.Croyant;

public class Ermite1 extends Croyant {
	
	
	public Ermite1() {
	
		this.nom="Ermite";
		this.origine=Croyant.JOUR;
		this.description="Impose le sacrifice d'un Croyant d'un autre joueur,"
				+ "qui choisit la carte. La capacit¨¦ sp¨¦ciale du sacrifice est jou¨¦e.";
		this.nbPierre=1;
		
	}

	@Override
	public void sacrifier() {
		// TODO Auto-generated method stub
		
	}
	
	public void sacrifier(Joueur joueur) {
		
		ArrayList<Joueur> js = Partie.getInstance().getJoueurs();
		Iterator<Joueur> it = js.iterator();
		System.out.print("choisir un joueur: ");
		while(it.hasNext()) {
			System.out.println("NumJoueur" + it.next().getNumJoueur());
		}
		int i = Input.getInt();
		js.get(i).sacrifier();
	}
	
		
}

