package cartesCroyantJour;
import joueursControle.Joueur;
import modele.Croyant;

public class Travailleurs3 extends Croyant{
	public Travailleurs3() {
	
		this.nom="Travailleur";
		this.origine=Croyant.JOUR;
		dogmes = new String[] {Croyant.MYSTIQUE,Croyant.HUMAIN,Croyant.CHAOS};
		this.description="Vous piochez deux cartes au hasard dans la main d'une autre Divinit¨¦.";
		this.nbPierre=2;
		
	}
	
	public void sacrifier(Joueur joueur){
//		this.joueur.mainDuJoueur.add(joueur.mainDuJoueur.get(0));
//		this.joueur.mainDuJoueur.add(joueur.mainDuJoueur.get(1));
//		joueur.mainDuJoueur.remove(0);
//		joueur.mainDuJoueur.remove(1);
		
	}

	@Override
	public void sacrifier() {
		// TODO Auto-generated method stub
		
	}

}
