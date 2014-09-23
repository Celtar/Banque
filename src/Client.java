
public class Client {

	private int numClient;
	private String nomClient;
	private String civilite;
	private String adresseClient;
	private String mailClient;
	private int telClient;
	
	public Client(){
		
	}

	public Client (int unNum, String unNom, String uneCivilite, String uneAdresse, String unMail, int unTel){	
		this.numClient = unNum;
		this.nomClient = unNom;
		this.civilite = uneCivilite;
		this.adresseClient = uneAdresse;
		this.mailClient = unMail;
		this.telClient = unTel;		
	}
	
	public String toString(){
		String chain = "\nClient";
		
		if(this.numClient!=0){
			chain = chain + "\nNuméro de client : " + this.numClient;
		}
		
		if(this.nomClient!=null){
			chain = chain + "    Nom de client : " + this.nomClient ;				
		}
		 
		return(chain);
	}

	public int getNumClient() {
		return numClient;
	}

	public void setNumClient(int numClient) {
		this.numClient = numClient;
	}

	public String getNomClient() {
		return nomClient;
	}

	public void setNomClient(String nomClient) {
		this.nomClient = nomClient;
	}

	public String getCivilite() {
		return civilite;
	}

	public void setCivilite(String civilite) {
		this.civilite = civilite;
	}

	public String getAdresseClient() {
		return adresseClient;
	}

	public void setAdresseClient(String adresseClient) {
		this.adresseClient = adresseClient;
	}

	public String getMailClient() {
		return mailClient;
	}

	public void setMailClient(String mailClient) {
		this.mailClient = mailClient;
	}

	public int getTelClient() {
		return telClient;
	}

	public void setTelClient(int telClient) {
		this.telClient = telClient;
	}
	

}
