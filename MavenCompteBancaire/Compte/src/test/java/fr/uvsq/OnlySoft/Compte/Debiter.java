package fr.uvsq.OnlySoft.Compte;

import static org.junit.Assert.*;

import org.junit.Test;

import fr.uvsq.OnlySoft.CompteException.CrediterExceptions;
import fr.uvsq.OnlySoft.CompteException.DebiterExceptions;

public class Debiter {
	
		@Test
		public void debiter() throws DebiterExceptions, CrediterExceptions
		{
			double solde=0.0;
			double montant=30;
			Compte comptea= new Compte();
			comptea.crediter(50);
			try {                   
				solde=comptea.debiter(montant);         
			} catch (DebiterExceptions e) {   } 
			
			assertEquals(20,solde,0);
			try {                   
				solde=comptea.debiter(montant);         
			} catch (DebiterExceptions e) {   } 
			
			assertEquals(20,solde,0);
			

		}
	
}
