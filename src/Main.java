public class Main {
	
	public static void main(String[] args){
		
		//Initialisation de la fenètre principale avec ses paramètres
		Parametres p = new Parametres();
		p.setLargeur(800);
		p.setHauteur(600);
  
		Menu menu = new Menu(p);
	}

}