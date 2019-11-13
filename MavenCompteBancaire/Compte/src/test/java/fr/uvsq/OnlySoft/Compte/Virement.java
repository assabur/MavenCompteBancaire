package fr.uvsq.OnlySoft.Compte;

import static org.junit.Assert.*;

import org.junit.Test;

import fr.uvsq.OnlySoft.CompteException.CrediterExceptions;
import fr.uvsq.OnlySoft.CompteException.DebiterExceptions;
import fr.uvsq.OnlySoft.CompteException.VirementExceptions;

public class Virement {

	@Test
	public void test() throws CrediterExceptions, VirementExceptions, DebiterExceptions {

		double montant=30;
		Compte comptea= new Compte();
		Compte compteb= new Compte();
		comptea.crediter(50);

		try {                   
			comptea.virement(compteb, montant);         
		} catch (VirementExceptions e) {   } 
		catch(DebiterExceptions e2){}
		
		assertEquals(30,compteb.getSolde(),0);
		assertEquals(20,comptea.getSolde(),0);
		
		try {                   
			comptea.virement(compteb, montant);         
		} catch (VirementExceptions e) {   }
		catch(DebiterExceptions e2){}

	}

}
