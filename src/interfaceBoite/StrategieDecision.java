package interfaceBoite;

import joueursControle.Joueur;

public interface StrategieDecision {
	public void choisirDefausse();
	public void utiliser();
	public void choisirUneOperation();
	public void setJoueur(Joueur joueur);
}
