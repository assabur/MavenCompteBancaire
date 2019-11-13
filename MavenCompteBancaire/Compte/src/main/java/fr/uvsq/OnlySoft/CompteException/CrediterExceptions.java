package fr.uvsq.OnlySoft.CompteException;

public class CrediterExceptions extends Exception {
	
	public CrediterExceptions(double nbre)
	{
	  System.out.println("Impossible de crediter votre Compte avec un nombre négatif.");
	  System.out.println("\t => " + nbre);
	}

}
