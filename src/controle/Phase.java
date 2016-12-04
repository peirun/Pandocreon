package controle;
import joueursControle.*;
import cartesControle.*;
import cartesCroyantModele.*;
import cartesDiviniteModele.*;
import modele.*;

import java.util.Scanner;


public class Phase {
	private Joueur joueur;
	
	public Phase(Joueur j) {
		this.joueur=j;
	}
	
	public void start() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Joeurs"+this.joueur.getNumJoueur());
		System.out.println("chose un chiox: 0:deffausser, 1:completerMain, 2:utiliser, "
				+ "3:sacrifier, 4:capaciter, 5:mettreAFinTonPhase");
		joueur.choisirUneOperation(sc.nextInt());
	}
}
