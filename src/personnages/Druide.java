package personnages;

import java.util.Random;

public class Druide {

	private String nom;
	private int effetPotionMin;
	private int effetPotionMax;
	private int forcePotion = 1;

	public Druide(String nom, int effetPotionMin, int effetPotionMax) {
		this.nom = nom;
		this.effetPotionMin = effetPotionMin;
		this.effetPotionMax = effetPotionMax;
		parler("Bonjour,  je  suis  le  druide  " + nom + "  et  ma  potion  peut  aller d'une force " + effetPotionMin
				+ " � " + effetPotionMax + ".");

	}

	public int preparerPotion() {
		Random random = new Random();
		forcePotion = random.nextInt(effetPotionMax - effetPotionMin + 1) + effetPotionMin;

		if (forcePotion > 7) {
			parler("J'ai pr�par� une super potion de force ");

		} else {
			parler("Je n'ai pas trouv� tous les ingr�dients, ma potion est seulement de force " + forcePotion);

		}
		return forcePotion;

	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "� " + texte + "�");
	}

	private String prendreParole() {
		return "Le druide " + nom + " : ";

	}

	public void booster(Gaulois gaulois) {
		if (gaulois.getNom() == "Ob�lix") {
			System.out.println("Non, Ob�lix !... Tu n�auras pas de potion magique ! �");

		} else {
			gaulois.boirePotion(forcePotion);
		}
	}

	public static void main(String[] args) {

	}

}
