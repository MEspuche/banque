package service;

import metier.Compte;

public class CompteSimpleService extends CompteService {

	@Override
	public void retirerMontant (Compte c, long x)
	{
		
		if (x>=0){
			if (x<=c.getSolde())
		{
			CompteSimpleService cs = new CompteSimpleService();
			c.setSolde(c.getSolde() - x);
			System.out.println(x + " euros ont �t� ajout� � votre compte");
			System.out.println("le nouveau solde est de ");
			}
			else{
				System.out.println("le montantde " + x + " euros ne peut pas �tre retir� car il est sup�rieur � votre solde");
				System.out.println("votre solde est de ");
				}
				
		}
	
		else {
			System.out.println("le montantde " + x + " euros ne peut pas �tre retir� car il est inf�rieur � z�ro");
			System.out.println("votre solde est de ");
			}

	}

	
	
}
