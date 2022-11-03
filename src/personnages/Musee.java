package personnages;

public class Musee {
	private Trophee[] trophees = new Trophee[200];
	private int nbTrophee = 0;

	public void donnerTrophees(Gaulois gaulois, Equipement equipement) {
		Trophee trophe = new Trophee(gaulois, equipement);
		trophees[nbTrophee] = trophe;
		nbTrophee++;
	}

	public String extraireInstructionsCaml() {
		String variableCaml = "let musee = [ \n";
		int i = 0;
		while (i != nbTrophee && trophees[i] != null) {
			variableCaml += "\t" + "\"" + trophees[i].donnerNom(trophees[i]) + "\"" + ", " + "\""
					+ trophees[i].getEquipement().toString() + "\"" + "\n";
			i++;

		}
		variableCaml += "]";
		return variableCaml;

	}

	public static void main(String[] args) {
		Musee musee = new Musee();
		Gaulois asterix = new Gaulois("Astérix", 8);
		Trophee trophe = new Trophee(asterix, Equipement.BOUCLIER);
		System.out.println(trophe.donnerNom(trophe));
		System.out.println(trophe.getEquipement().toString());
		String texte = musee.extraireInstructionsCaml();
		System.out.println(texte);
	}

}
