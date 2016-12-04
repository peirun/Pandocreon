package cartesControle;

import java.util.ArrayList;

import javax.print.attribute.standard.RequestingUserName;

import modele.*;

public class CartesSurTable {
	private static CartesSurTable cartesSurTable;
	private ArrayList<CarteAction> croyantDeposes;
	private ArrayList<CarteAction> guidesUtilises;
	private ArrayList<CarteAction> croyantRattaches;
	private ArrayList<Divinite> divinites;
	
	
	public CartesSurTable() {
		setCroyantDeposes(new ArrayList<CarteAction>());
		setGuidesUtilises(new ArrayList<CarteAction>());
		setCroyantRattaches(new ArrayList<CarteAction>());
		setDivinites(new ArrayList<Divinite>());
		
	}
	public static CartesSurTable getCartesSurTable() {
		return cartesSurTable;
	}
	public static void setCartesSurTable(CartesSurTable cartesSurTable) {
		CartesSurTable.cartesSurTable = cartesSurTable;
	}
	public ArrayList<CarteAction> getCroyantDeposes() {
		return croyantDeposes;
	}
	public void setCroyantDeposes(ArrayList<CarteAction> croyantDeposes) {
		this.croyantDeposes = croyantDeposes;
	}
	public ArrayList<CarteAction> getGuidesUtilises() {
		return guidesUtilises;
	}
	public void setGuidesUtilises(ArrayList<CarteAction> guidesUtilises) {
		this.guidesUtilises = guidesUtilises;
	}
	public ArrayList<CarteAction> getCroyantRattaches() {
		return croyantRattaches;
	}
	public void setCroyantRattaches(ArrayList<CarteAction> croyantRataches) {
		this.croyantRattaches = croyantRataches;
	}
	public ArrayList<Divinite> getDivinites() {
		return divinites;
	}
	public void setDivinites(ArrayList<Divinite> divinites) {
		this.divinites = divinites;
	}
	
	
	
	
	
}
