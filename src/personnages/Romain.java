package personnages;

public class Romain {
	private String nom;
	private int force;
	private Equipement[] equipements = new Equipement[2];
	private int nbEquipement = 0;

	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;

	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
	}

	private String prendreParole() {
		return "Le romain " + nom + " : ";
	}

	public void recevoirCoup(int forceCoup) {
		force -= forceCoup;
		if (force > 0) {
			parler("Aïe");
		} else {
			parler("J'abandonne...");
		}
	}

	public static boolean forceToujoursPositive(Romain romain) {
		return romain.force >= 0;

	}

	private void ajouterAfficherEquipement(Equipement equipement, int indEquipement) {
		equipements[indEquipement] = equipement;
		nbEquipement += 1;
		System.out.println("Le soldat " + nom + " s'équipe avec " + equipement + " !");
	}

	public void sEquiper(Equipement equipement) {
		switch (nbEquipement) {
		case 2:
			System.out.println("Le soldat " + nom + " est déjà bien protégé !");
			break;

		case 1:
			if (equipement.equals(equipements[0])) {
				System.out.println("Le soldat " + nom + " possède déjà un " + equipement + " !");

			} else {
				ajouterAfficherEquipement(equipement, 1);
			}
			break;

		default:
			ajouterAfficherEquipement(equipement, 0);
			break;
		}
	}

	public static void main(String[] args) {
		Romain Minus = new Romain("Minus", 6);
//		int varForce = Minus.force;
		/* Precondition */ // assert forceToujoursPositive(Minus);
//		Minus.recevoirCoup(1);
		/* Postcondition */ // assert varForce < Minus.force;
//		System.out.println(Equipement.BOUCLIER);
//		System.out.println(Equipement.CASQUE);

		Equipement casque = Equipement.CASQUE;
		Equipement bouclier = Equipement.BOUCLIER;
		Minus.sEquiper(casque);
		Minus.sEquiper(casque);
		Minus.sEquiper(bouclier);
		Minus.sEquiper(bouclier);
	}

}
