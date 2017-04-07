package service;

import java.util.Scanner;

import metier.Compte;

public class CompteService {

	
	
	public void ajouterMontant (Compte c, long x)
	{
		
		if (x<=0){
			System.out.println("le montantde " + x + " euros ne peut pas être retiré");
			System.out.println("votre solde est de ");
			}
		
		else{
		c.setSolde(c.getSolde() + x);
		System.out.println(x + " euros ont été ajouté à votre compte");
		System.out.println("le nouveau solde est de ");
		}

		
	}
	
	/*
	 * Autre méthode :
	 * public long ajouter(Compte c, long montant)
	 * {
	 * if(montant>=0){
	 * c.setSolde(c.getSolde() + montant);
	 * }
	 * return c.getSolde();
	 */
	
	public void retirerMontant (Compte c, long x)
	{
		
		if (x>=0){
			if (x<=c.getSolde())
		{
			CompteService cs = new CompteService();
			c.setSolde(c.getSolde() - x);
			System.out.println(x + " euros ont été ajouté à votre compte");
			System.out.println("le nouveau solde est de ");
			}
			else{
				System.out.println("le montantde " + x + " euros ne peut pas être retiré car il est supérieur à votre solde");
				System.out.println("votre solde est de ");
				}
				
		}
	
		else {
			System.out.println("le montantde " + x + " euros ne peut pas être retiré car il est inférieur à zéro");
			System.out.println("votre solde est de ");
			}

	}
	/*
	 * Autre méthode : 
	 * public long retirer(Compte c, long montant)
	 * {
	 * if (montant>=0){
	 * 	if (montant<=c.getSolde()){
	 * 			c.setSolde(c.getSolde() - montant);
	 * }
	 * }
	 * return c.getSolde();
	 * }
	 */
	
	public void afficherSolde (Compte c)
	{
		System.out.println(c.getSolde());
		
	}
}
