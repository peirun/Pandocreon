package cartesCroyantNuit;
import java.util.ArrayList;
import java.util.Iterator;

import Input.Input;
import cartesControle.CartesSurTable;
import controle.Partie;
import joueursControle.Joueur;
import modele.CarteAction;
import modele.Croyant;
import modele.GuideSpirituel;

public class Lycanthropes extends Croyant {

	public Lycanthropes() {
		this.nom="Lycanthropes";
		this.origine=CarteAction.NUIT;
		dogmes = new String[] {CarteAction.HUMAIN,CarteAction.NATURE,CarteAction.CHAOS};
		this.description="Retirez... ";
		this.nbPierre=4;
		
	}
	
	public void sacrifier(){
		
	}
	
	public void sacrifier(Joueur joueur) {
		ArrayList<Joueur> js = Partie.getInstance().getJoueurs();
		Iterator<Joueur> it = js.iterator();
		System.out.print("choisir un joueur: ");
		while(it.hasNext()) {
			Joueur j = it.next();
			if(j.getGuideSpirituels().size() != 0) {
				System.out.println("Joueur" + j.getNumJoueur());
			}
		
		}
		int i = Input.getInt();
		ArrayList<GuideSpirituel> gs = (ArrayList<GuideSpirituel> )js.get(i).getGuideSpirituels();
		Iterator<GuideSpirituel> ig = gs.iterator();
		while(ig.hasNext()) {
			System.out.println(ig.next().toString());
		}
		System.out.println("Choisi une guide£º");
		int n = Input.getInt();
		ArrayList<Croyant> cs = (ArrayList<Croyant>)gs.get(n).getCroyants();
		int index = 0;
		while(index < cs.size()) {
			CartesSurTable.getInstance().getCroyantDeposes().add(cs.remove(index));
			index++;
		}
		gs.remove(n);
		
		
	}

		
}

