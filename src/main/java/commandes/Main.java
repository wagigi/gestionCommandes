package commandes;

import commandes.services.GestionCommande;


public class Main {

	public static void main(String[] args) {

		GestionCommande gestionCommande = new GestionCommande();
		int typeProduit = 1;
		int nombreProduits = 5;
		gestionCommande.creerCommande(typeProduit, nombreProduits);
		
	}

}
