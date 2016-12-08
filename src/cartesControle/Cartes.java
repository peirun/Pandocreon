package cartesControle;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

import cartesCroyantJour.Diplomates;
import cartesCroyantJour.Ermite1;
import cartesCroyantJour.Ermite2;
import cartesCroyantJour.GuerriersSaints;
import cartesCroyantJour.Integristes;
import cartesCroyantJour.Moines1;
import cartesCroyantJour.Moines2;
import cartesCroyantJour.Moines3;
import cartesCroyantJour.Moines4;
import cartesCroyantJour.Moines5;
import cartesCroyantJour.Travailleurs1;
import cartesCroyantJour.Travailleurs2;
import cartesCroyantJour.Travailleurs3;
import cartesCroyantNeant.Alienes1;
import cartesCroyantNeant.Alienes2;
import cartesCroyantNeant.Alienes3;
import cartesCroyantNeant.Esprits1;
import cartesCroyantNeant.Esprits2;
import cartesCroyantNeant.Esprits3;
import cartesCroyantNeant.Esprits4;
import cartesCroyantNeant.Esprits5;
import cartesCroyantNeant.Nihillistes;
import cartesCroyantNeant.Revenant;
import cartesCroyantNeant.Revolutionnaires;
import cartesCroyantNuit.Alchimistes1;
import cartesCroyantNuit.Alchimistes2;
import cartesCroyantNuit.Alchimistes3;
import cartesCroyantNuit.Demons1;
import cartesCroyantNuit.Demons2;
import cartesCroyantNuit.Demons3;
import cartesCroyantNuit.Demons4;
import cartesCroyantNuit.Demons5;
import cartesCroyantNuit.Illusionnistes;
import cartesCroyantNuit.Lycanthropes;
import cartesCroyantNuit.Pillards;
import cartesCroyantNuit.Vampire1;
import cartesCroyantNuit.Vampire2;
import cartesDeusEx.Bouleversement;
import cartesDeusEx.ColereDivine1;
import cartesDeusEx.ColereDivine2;
import cartesDeusEx.Concentration;
import cartesDeusEx.Diversion;
import cartesDeusEx.Fourberie;
import cartesDeusEx.InfluenceJour;
import cartesDeusEx.InfluenceNeant;
import cartesDeusEx.InfluenceNuit;
import cartesDeusEx.InfluenceNulle1;
import cartesDeusEx.InfluenceNulle2;
import cartesDeusEx.Inquisition;
import cartesDeusEx.OrdreCeleste;
import cartesDeusEx.Phoenix;
import cartesDeusEx.Stase;
import cartesDeusEx.Transe;
import cartesDeusEx.TrouNoir;
import cartesGuideSpirituel.Anarchiste;
import cartesGuideSpirituel.Ascete;
import cartesGuideSpirituel.Clerc1;
import cartesGuideSpirituel.Clerc2;
import cartesGuideSpirituel.Clerc3;
import cartesGuideSpirituel.Clerc4;
import cartesGuideSpirituel.Clerc5;
import cartesGuideSpirituel.Clerc6;
import cartesGuideSpirituel.Clerc7;
import cartesGuideSpirituel.Clerc8;
import cartesGuideSpirituel.Devin;
import cartesGuideSpirituel.Exorciste;
import cartesGuideSpirituel.Martyr1;
import cartesGuideSpirituel.Martyr2;
import cartesGuideSpirituel.Martyr3;
import cartesGuideSpirituel.Messie;
import cartesGuideSpirituel.Shaman;
import cartesGuideSpirituel.Socier;
import cartesGuideSpirituel.Tyran;
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
