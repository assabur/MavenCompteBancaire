package foo.MonArchetype;

import static org.junit.Assert.*;

import org.junit.Test;

public class Virement {

	@Test
	public void test() {
		Double montant=10.5;
		Double solde1=30.5;
		Double solde2=0.0;
		if(montant>0){
			solde1=solde1-montant;
			solde2=solde2+montant;
			assertEquals(10.5,solde2,0);
			assertEquals(20,solde1,0);
		}
		
	}

}
