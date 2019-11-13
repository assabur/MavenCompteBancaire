package fr.uvsq.OnlySoft.Compte;
import fr.uvsq.OnlySoft.CompteException.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class Crediter {
	

	@Test
	public void testCrediter () throws CrediterExceptions
	{
		
		double solde=-30.0;
		
		Compte v = null;
		try {                   
		    v = new Compte(solde);         
		} catch (CrediterExceptions e) {   }   
		finally{
		    if(v == null)
		    	v = new Compte(0.0);
		}
		
	}
	
	
}
