package presentation;

import java.util.Scanner;

import metier.Compte;
import service.CompteService;

public class Lanceur {

	/**
	 * Classe principale qui sert à saisir des données
	 * @param args arguments de la classe
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//créer un objet de type service
		CompteService cs = new CompteService();
		
		Scanner clavier = new Scanner(System.in);
		
	
		int lId;
		String leNom;
		long leSolde;
		long leMontant;
		int t;
		int i=0;
		
		while(i<1 || i>4){
					System.out.println("Que voulez-vous faire ?");
					System.out.println("1. Ajouter un compte");
					System.out.println("2. Crediter un compte");
					System.out.println("3. Débiter un compte");
					System.out.println("4. Quitter l'application");
					i=clavier.nextInt();
		}
		
		switch(i)
		{
		case 1:
			System.out.println("Entrez votre ID");
			lId = clavier.nextInt();
			System.out.println("Entrez votre nom de compte");
			leNom = clavier.next();
			System.out.println("Saisir votre Solde");
			leSolde = clavier.nextLong();
			//creation d'un objet de type compte
			Compte c1 = new Compte (lId, leNom, leSolde);
			/*
			 * ou : cs.setIdCompte(lId);
			 * cs.setNomCompte(leNom);
			 * cs.setSoldeCompte(leSolde);
			 */
			
			System.out.println(c1);
			// ou System.out.println(cs);
			break;
			
			
		case 2:
			System.out.println("Entrez votre ID");
			lId = clavier.nextInt();
			System.out.println("Entrez votre nom de compte");
			leNom = clavier.next();
			System.out.println("Saisir votre Solde");
			leSolde = clavier.nextLong();
			//creation d'un objet de type compte
			Compte c2 = new Compte (lId, leNom, leSolde);
			/*
			 * ou : cs.setIdCompte(lId);
			 * cs.setNomCompte(leNom);
			 * cs.setSoldeCompte(leSolde);
			 */
			
			System.out.println(c2);
			// ou System.out.println(cs);
			
			System.out.println("Quel montant voulez vous ajouter ?");
			leMontant = clavier.nextLong();
			t=1;
			
			while (leMontant<0 && t<3)
			{
				System.out.println("Le montant est inférieur à zéro ! Quel montant voulez vous ajouter ?");
				leMontant = clavier.nextLong();
				t++;
			}
			
			cs.ajouterMontant(c2, leMontant);
			cs.afficherSolde(c2);
			
			break ;
			
			
		case 3:
			System.out.println("Entrez votre ID");
			lId = clavier.nextInt();
			System.out.println("Entrez votre nom de compte");
			leNom = clavier.next();
			System.out.println("Saisir votre Solde");
			leSolde = clavier.nextLong();
			//creation d'un objet de type compte
			Compte c3 = new Compte (lId, leNom, leSolde);
			/*
			 * ou : cs.setIdCompte(lId);
			 * cs.setNomCompte(leNom);
			 * cs.setSoldeCompte(leSolde);
			 */
			
			System.out.println(c3);
			// ou System.out.println(cs);
			System.out.println("Quel montant voulez vous retirer ?");
			leMontant = clavier.nextLong();
			t=1;
			
			while ((leMontant<0 && t<3) || (leMontant> c3.getSolde()&& t<3))
			{
				if(leMontant<0){
				System.out.println("Le montant est inférieur à zéro ! Quel montant voulez vous retirer?");
				
				}
				
				else{
					System.out.println("Le montant est supérieur à votre solde ! Quel montant voulez vous retirer?");
					
					
				}
				leMontant = clavier.nextLong();
				System.out.println(t);
				t++;
			}
			
			cs.retirerMontant(c3,leMontant);
			cs.afficherSolde(c3);
			break;
			
			
			
		case 4: 
			System.out.println("Au revoir");
			
			break;
		
	
					}
			
		
		
	}

}
