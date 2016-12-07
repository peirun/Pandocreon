package Model.croyantNeant;
import Model.*;
import modele.Croyant;

import java.util.LinkedList;

import Controller.*;

public class Revolutionnaires extends Croyant {
	private String[] dogemes={"Symboles","Humain","Chaos"};
	
	public Revolutionnaires() {
	
		this.nom="Revolutionnaires";
		this.origine=Croyant.NEANT;
		String[] dogmes= {Croyant.SYMBOLES,Croyant.HUMAIN,Croyant.CHAOS};
		this.description="Impose le sacrifice d'un Croyant d'un autre joueur, "
				+ "qui choisit la carte La capacit¨¦ sp¨¦ciale du sacrifice est jou¨¦e.";
		this.nbPierre=2;
	}
	
	public void sacrifier(Joueur joueur,LinkedList<Joueur> joueurs){
//		joueur.sacrifierCroyant(joueurs);
	}
		
}

