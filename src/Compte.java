
public class Compte {

	private int numCompte;
	private String nomCompte;
	private int solde;
	private Client leClient;
	
	public Compte(){
		
	}

	public Compte (int unNum, String unNom, int unSolde, Client unClient){	
		this.numCompte = unNum;
		this.nomCompte = unNom;
		this.solde = unSolde;
		this.leClient = unClient;
	}
	
	public String toString(){
		String chain = null;
		
		if(this.numCompte!=0){
			chain = "\nNuméro de compte : " + this.numCompte ;				
		}
		
		if(this.nomCompte!=null){
			chain = chain + "   Nom de compte : " + this.nomCompte ;				
		}
		
		if(this.solde!=0){
			chain = chain + "\nSolde : " + this.solde + " €";				
		}
		
		if(this.leClient!=null){
			chain = chain + leClient.toString() ;				
		}
		
		return(chain);
	}

	public int getNumCompte() {
		return numCompte;
	}

	public void setNomCompte(int numCompte) {
		this.numCompte = numCompte;
	}

	public String getNomCompte() {
		return nomCompte;
	}

	public void setNomCompte(String nomCompte) {
		this.nomCompte = nomCompte;
	}

	public int getSolde() {
		return solde;
	}

	public void setSolde (int unSolde) {
		this.solde = unSolde;
	}

}