package personnages;

public class Trophee {
	private Gaulois gaulois;
	private Equipement equipement;

	public Trophee(Gaulois gaulois, Equipement equipement) {
		this.gaulois = gaulois;
		this.equipement = equipement;
	}

	public Gaulois getGaulois() {
		return gaulois;
	}

	public Equipement getEquipement() {
		return equipement;
	}

	public String donnerNom(Trophee trophee) {
		return gaulois.getNom();

	}

	public static void main(String[] args) {
		// TODO
	}
}
