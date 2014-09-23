import java.util.ArrayList;


public class Banque {

	private String nomBanque;
	private ArrayList<Compte>listeCompte;
	
	public Banque(){
		
	}

	public Banque (String unNom, ArrayList uneListe){	
		this.nomBanque = unNom;
		this.listeCompte = uneListe;
	}

	public String getNomBanque() {
		return nomBanque;
	}

	public void setNomBanque(String unNom) {
		this.nomBanque = unNom;
	}

	//Affiche les informations de la Banque
	public String toString(){
		String chain = null;
		
		if(this.nomBanque!=null){
			chain = "\nNom : " + this.getNomBanque() ;				
		}
		
		if(this.listeCompte!=null){
			chain = chain + "\nComptes :";
			for (int i=0; i < listeCompte.size(); i++){
				chain = chain + "\n" + listeCompte.get(i).toString() ;
			}
		}
		return(chain);
	}
}