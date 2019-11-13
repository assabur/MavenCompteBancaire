package tes.Monarchetype;

import static org.junit.Assert.*;

import org.junit.Test;

public class Debiter {
	
		@Test
		public void debiter()
		{
			double solde=30.0;
			double montant=31;
					 
			if (montant<=0||montant>solde) 
			{
				
				assertEquals("montant inf � 0",-1,solde-montant,0);
			}
			else
			{	
				solde=solde-montant;

				assertEquals("montant sup � 0",19.8, solde, 0);	
			}

		}
	
}
