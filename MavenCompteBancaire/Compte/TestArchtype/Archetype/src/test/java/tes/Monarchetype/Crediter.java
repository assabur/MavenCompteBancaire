package tes.Monarchetype;

import static org.junit.Assert.*;

import org.junit.Test;

public class Crediter {
	

	@Test
	public void testCrediter()
	{
		double solde=30.0;
		double montant=10.2;
				 
		if (montant<=0) 
		{
			
			assertEquals("montant inf � 0",10.0, 02, 0);
		}
		else
		{	
		solde=solde +montant;

		assertEquals("montant sup � 0", 40.2, solde, 0);	
		}

	}
	
	
}
