package personnages;

public class Romain {
	private String nom;
	private int force;

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
		return romain.force>=0;
		
	}
	

	
	public static void main(String[] args) {
		Romain Minus = new Romain("Minus",6);
		int varForce = Minus.force;
/* Precondition */		assert forceToujoursPositive(Minus);
		Minus.recevoirCoup(1);
/* Postcondition */		assert varForce < Minus.force;
//		System.out.println(Equipement.BOUCLIER);
//		System.out.println(Equipement.CASQUE);
	
	}

}
