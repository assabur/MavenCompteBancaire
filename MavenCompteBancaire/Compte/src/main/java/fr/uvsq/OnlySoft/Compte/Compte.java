package fr.uvsq.OnlySoft.Compte;
import fr.uvsq.OnlySoft.CompteException.*;


public class Compte 
{
private Double  solde=0.0 ;


public Compte() 
{    
}

public Compte(double solde) throws  CrediterExceptions 
{  
		    if(solde < 0)
		      throw new CrediterExceptions(solde);
		    else
		    {
		    	this.solde=solde;
		    }
		  
}

//afficher ma position

public Double getSolde()
{
	return solde;
}

//crediter mon compte


public double crediter(double montant) throws  CrediterExceptions
{
	
    if(montant<=0)
	      throw new CrediterExceptions(montant);
	    else
	    {
	    	return this.solde=this.solde +montant;
	    }
}

//debiter

public double debiter(double montant)  throws  DebiterExceptions
{
	
	if(solde-montant<0)
	      throw new DebiterExceptions(solde);
	    else
	    {
	    	return this.solde=this.solde-montant;
	    }
	
}

//transfert vers un autre compte

public void virement(Compte b,double montant) throws CrediterExceptions,DebiterExceptions,VirementExceptions
{
	if(montant<0)
	      throw new VirementExceptions(montant);
	    else
	    {
	    	try{
	    		this.debiter(montant);
	    	}catch (DebiterExceptions e) {
			}
	    	b.crediter(montant);
	    }
					
}


}