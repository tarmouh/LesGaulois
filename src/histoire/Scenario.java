package histoire;

import personnages.Druide;
import personnages.Gaulois;
import personnages.Romain;

public class Scenario {

	public static void main(String[] args) {
		Druide Panoramix = new Druide("Panoramix",5,10);
		Gaulois Obelix = new Gaulois("Ob�lix",200);
		Gaulois Asterix = new Gaulois("Asterix", 8);
		Romain Minus = new Romain("Minus", 6);
		Panoramix.parler("Je vais aller pr�parer une petite potion...");
		int forcePotion = Panoramix.preparePotion();
		Panoramix.booster(Obelix);
		Obelix.parler("Par B�l�nos, ce n'est pas juste !");
		Asterix.boirePotion(forcePotion);
		
		Asterix.parler("Bonjour");
		Minus.parler("UN GAU... UN GAUGAU...");
		Asterix.frapper(Minus);
		Asterix.frapper(Minus);
		Asterix.frapper(Minus);
		
	}

}
