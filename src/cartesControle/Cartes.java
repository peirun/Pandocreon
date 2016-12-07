package cartesControle;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

import cartesCroyantJour.*;
import cartesCroyantNeant.*;
import cartesCroyantNuit.*;
import cartesDeusEx.*;
import cartesGuideSpirituel.*;
import modele.CarteAction;

public class Cartes {
	private LinkedList<CarteAction> cartes;
	private static Cartes cartesPioche=null;

	private Cartes() {
		cartes = new LinkedList<CarteAction>();
		//ajouter cartes specifier [Pas finir]
		cartes.add(new Ermite1());
		cartes.add(new Ermite2());
		cartes.add(new Moines1());
		cartes.add(new Moines2());
		cartes.add(new Moines3());
		cartes.add(new Moines4());
		cartes.add(new Moines5());
		cartes.add(new Travailleurs1());
		cartes.add(new Travailleurs2());
		cartes.add(new Travailleurs3());
		
		cartes.add(new Esprits1());
		cartes.add(new Esprits2());
		cartes.add(new Esprits3());
		cartes.add(new Esprits4());
		cartes.add(new Esprits5());
		cartes.add(new Revolutionnaires());
		
		cartes.add(new Alienes1());
		cartes.add(new Alienes2());
		cartes.add(new Alienes3());
		
		cartes.add(new Vampire1());
		cartes.add(new Vampire2());
		
		cartes.add(new Demons1());
		cartes.add(new Demons2());
		cartes.add(new Demons3());
		cartes.add(new Demons4());
		cartes.add(new Demons5());
		
		cartes.add(new Integristes());
		cartes.add(new GuerriersSaints());
		cartes.add(new Lycanthropes());
		cartes.add(new Diplomates());
		cartes.add(new Revenant());
		cartes.add(new Pillards());
		cartes.add(new Illusionnistes());
		cartes.add(new Nihillistes());
		
		cartes.add(new Alchimistes1());
		cartes.add(new Alchimistes2());
		cartes.add(new Alchimistes3());
		
		//GuideSpirituel
		cartes.add(new Anarchiste());
		cartes.add(new Ascete());
		cartes.add(new Clerc1());
		cartes.add(new Clerc2());
		cartes.add(new Clerc3());
		cartes.add(new Clerc4());
		cartes.add(new Clerc5());
		cartes.add(new Clerc6());
		cartes.add(new Clerc7());
		cartes.add(new Clerc8());
		cartes.add(new Devin());
		cartes.add(new Exorciste());
		cartes.add(new Martyr1());
		cartes.add(new Martyr2());
		cartes.add(new Martyr3());
		cartes.add(new Messie());
		cartes.add(new Shaman());
		cartes.add(new Socier());
		cartes.add(new Tyran());
		
		//DeusEx
		cartes.add(new Bouleversement());
		cartes.add(new ColereDivine1());
		cartes.add(new ColereDivine2());
		cartes.add(new Concentration());
		cartes.add(new Diversion());
		cartes.add(new Fourberie());
		cartes.add(new InfluenceJour());
		cartes.add(new InfluenceNuit());
		cartes.add(new InfluenceNeant());
		cartes.add(new InfluenceNulle1());
		cartes.add(new InfluenceNulle2());
		cartes.add(new Inquisition());
		cartes.add(new OrdreCeleste());
		cartes.add(new Phoenix());
		cartes.add(new Stase());
		cartes.add(new Transe());
		cartes.add(new TrouNoir());
		melanger();
	}
	
	//sigleton
	public static Cartes getInstance() {
		if(cartesPioche==null) {
			cartesPioche=new Cartes();
		}
		return cartesPioche;
	}  
	public Collection<CarteAction> getCartes() {
		return cartes;
	}
	//melanger des cartes
	public void melanger() {
		Collections.shuffle(cartes);
	}

	//nombre de cartes
	public int getNbCartes() {
		return this.cartes.size();
	}
	
	//retirer carte [comment evider des cartes ne sont pas doublon]
	public CarteAction retirerCarte() {
		return cartes.removeFirst();
	}

}
