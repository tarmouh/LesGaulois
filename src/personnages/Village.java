package personnages;

import java.util.Arrays;

public class Village {
	private String nom;
	private Chef chef;
	private Gaulois[] villageois;
	private int nbVillageois = 0;
	
	
// Constructeur
	public Village(String nom, int NbVillageoisMaximum) {
		this.nom = nom;
		villageois = new Gaulois[NbVillageoisMaximum];
		
	}

	

	
	// Obtenir le nom du chef
	public String getNom() {
		return nom;
	}
	
	
	
	// Fonction pour D�finir le chef du village
	public void setChef(Chef chef) {
		this.chef = chef;

	}

	
	// Fonction pour ajouter des Habitants
	public void ajouterHabitant(Gaulois gaulois) {
		if (nbVillageois<villageois.length) {
			villageois[nbVillageois] = gaulois;
			nbVillageois++;	
		}

	}

	
	// Fonction pour trouver des habitants
	public Gaulois trouverHabitant(int numeroVillageois) {
		Gaulois gaulois = villageois[numeroVillageois];
		return gaulois;
	}

	
	// Fonction pour afficher les villageois
	public void afficherVillageois(Village village) {
		int i = 0;
		System.out.println("Dans le village du chef "+ village.chef.getNom() +" vivent les l�gendaires gaulois : ");
		while ((i<villageois.length) && (villageois[i] != null)) {
			Gaulois gaulois = villageois[i];
			System.out.println("- "+ gaulois.getNom());
			i++;
		}
	}
	

	public static void main(String[] args) {
		Village village = new Village("Village des irr�ductibles", 30);
		
//		Gaulois gaulois = village.trouverHabitant(30);
		  
//		ON OBTIENT UN MESSAGE D'ERREUR CAR LE DERNIER �L�MENT DU TABLEAU EST D'INDICE
//		29, OR ON A ESSAYER D'ACC�DER � L'�L�MENT D'INDICE 30
		 

		Chef Abraracourcix = new Chef("Abraracourcix", 6, village);
		village.setChef(Abraracourcix);
		Gaulois Asterix = new Gaulois("Ast�rix", 8);
		village.ajouterHabitant(Asterix);		
//		Gaulois gaulois = village.trouverHabitant(1);

		  
//		   Le programme me renvoie null, car on pointe sur une case vide. Certes
//		 on a ajouter deux �l�ments dans le tableau mais le chef
//		 "ne fait pas partie" du village, c'est une personne "� part".
		 
		  
		Gaulois Obelix = new Gaulois("Ob�lix",25);
		village.ajouterHabitant(Obelix);
		
		
		village.afficherVillageois(village);


	}

}
