package fr.uvsq.OnlySoft.CompteException;

public class DebiterExceptions extends Exception{
	
	public DebiterExceptions(double nbre)
	{
	  System.out.println("Impossible de Debiter votre Compte.\n Votre solde est de :"+nbre);
	}

}
