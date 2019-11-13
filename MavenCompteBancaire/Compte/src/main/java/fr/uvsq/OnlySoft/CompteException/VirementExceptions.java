package fr.uvsq.OnlySoft.CompteException;

public class VirementExceptions extends Exception {
	
	public VirementExceptions(double nbre)
	{
	  System.out.println("Impossible de faire un Virement avec un montant negatif: "+nbre);
	}

}
