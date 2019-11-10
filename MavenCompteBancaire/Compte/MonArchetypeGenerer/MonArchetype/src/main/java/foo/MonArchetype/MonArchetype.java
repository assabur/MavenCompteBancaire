package foo.MonArchetype;

public class MonArchetype 
{
private Double  solde ;
public MonArchetype(double solde) 
{
	if (solde<0) solde=0.0;
	this.solde=solde;
}

//afficher ma position

public Double getSolde()
{
	return solde;
}

//crediter mon compte

public double crediter(double montant)
{
	if (montant<=0) return -1;
	return solde=solde +montant;
}

//debiter

public double debiter(double montant)
{
	if (solde<=0||solde <montant) return -1;
	return solde=solde-montant;
}

//transfert vers un autre compte

public void virement(MonArchetype a, MonArchetype b,double montant)

{
	if( montant>0)
	{
		double c1 =a.getSolde();
		b.crediter(montant);
		a.debiter(c1-montant);	
	}
}

}
