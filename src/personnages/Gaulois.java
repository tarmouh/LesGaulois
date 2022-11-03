package personnages;

public class Gaulois {
	private String nom;
	private int effetPotion = 1;
	private int force;
	private int nbTrophees;
	private Equipement[] trophees = new Equipement[100];

	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public int getForce() {
		return force;
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "� " + texte + "�");
	}

	/*
	 * private String prendreParole() { return "Le gaulois " + nom + " : "; }
	 */

	/*
	 * public void frapper(Romain romain) { System.out.println(nom +
	 * " envoie un grand coup dans la m�choire de " + romain.getNom());
	 * romain.recevoirCoup((force / 3) * effetPotion); }
	 */

	public void boirePotion(int forcePotion) {
		effetPotion = forcePotion;
		System.out.println(
				prendreParole() + "� Merci Druide, je sens que ma force est " + effetPotion + " fois d�cupl�e. �");

	}

	@Override
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
	}

	public void frapper(Romain romain) {
		String texte = " envoie un grand coup dans la m�choire de ";
		System.out.println(nom + texte + romain.getNom());
		Equipement[] trophee = romain.recevoirCoup((force / 3) * effetPotion);
		for (int i = 0; trophee != null && i < trophee.length; i++, nbTrophees++) {
			this.trophees[nbTrophees] = trophee[i];
		}

	}

	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
	}

	public void faireUneDonnation(Musee musee) {
		if (nbTrophees > 0) {
			parler("Je donne au musee tous mes trophees");
			for (int i = 0; i < nbTrophees; i++) {
				if (trophees[i] != null) {
					musee.donnerTrophees(this, trophees[i]);
					System.out.println("- " + trophees[i]);
				}

			}
		} else {
			System.out.println("Je n'ai pas de trophees");
		}
	}

	public static void main(String[] args) {
		// TODO document why this method is empty
	}

}
