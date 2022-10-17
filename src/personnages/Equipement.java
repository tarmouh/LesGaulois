package personnages;

public enum Equipement {
	CASQUE("casque"), BOUCLIER("bouclier");

	private String nom;
	private Equipement[] Equipements = new Equipement[2];
	private int nbEquipement = 0;

	private Equipement(String nom) {
		this.nom = nom;
	}
	
	public String toString() {
		return nom;
	}

}
