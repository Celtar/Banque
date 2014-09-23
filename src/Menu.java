import java.awt.Container;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JFrame implements ActionListener{
	
	private JButton ajout,suppression,voir,rechercher,solde;
	private JLabel titre;
	private Parametres p = new Parametres();
	private JMenuBar menu = new JMenuBar();
 
	public Menu (Parametres p){
		
		this.p = p;
  
		setTitle("Menu");   
		setSize(p.getLargeur(),p.getHauteur());
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setResizable(false); 
  
		Container contentPane = getContentPane();
        contentPane.setLayout(null);
        
        menu.setBounds( 70, 200, 500, 100);
        
        titre = new JLabel("Banque");
        titre.setBounds( 310, 100, 200, 100);
        titre.setFont(new Font("Impact", Font.PLAIN, 60));
        
        /* gestion menu compte*/
        
        JMenu comptes = new JMenu("Comptes");
        JMenuItem ajouter = new JMenuItem("Ajouter un compte");
        JMenuItem supprimer = new JMenuItem("Supprimer un compte");
        JMenuItem voir = new JMenuItem("Voir les comptes");
        JMenuItem rechercher = new JMenuItem("Rechercher un compte");
        JMenuItem solde = new JMenuItem("Voir le solde des comptes");
        
        comptes.add(titre);
        comptes.add(ajouter);
        comptes.add(supprimer);
        comptes.add(voir);
        comptes.add(rechercher);
        comptes.add(solde);
        
        /* gestion menu compte*/
        
        JMenu clients = new JMenu("Clients");
        JMenuItem ajouterCli = new JMenuItem("Ajouter un client");
        JMenuItem supprimerCli = new JMenuItem("Supprimer un client");
        JMenuItem voirCli = new JMenuItem("Voir les clients");
        JMenuItem rechercherCli = new JMenuItem("Rechercher un client");
        
        clients.add(titre);
        clients.add(ajouterCli);
        clients.add(supprimerCli);
        clients.add(voirCli);
        clients.add(rechercherCli);
        
        menu.add(comptes);
        menu.add(clients);
        
        contentPane.add(titre);
        contentPane.add(menu);
        
        /*ajout = new JButton("Ajouter un compte");
        ajout.setBounds( 300, 240, 200, 50);
        
        suppression = new JButton("Supprimer un compte");
        suppression.setBounds( 300, 300, 200, 50);
 
        voir = new JButton("Voir les comptes");
        voir.setBounds( 300, 360, 200, 50);
     
        rechercher = new JButton("Rechercher un compte");
        rechercher.setBounds( 300, 420, 200, 50);
        
        solde = new JButton("Voir le solde des comptes");
        solde.setBounds( 300, 480, 200, 50);
        
        contentPane.add(titre);
        contentPane.add(ajout);
        contentPane.add(suppression);
        contentPane.add(voir);
        contentPane.add(rechercher);
        contentPane.add(solde);
        
        ajout.addActionListener(this);
        suppression.addActionListener(this);
        voir.addActionListener(this);
        rechercher.addActionListener(this);
        solde.addActionListener(this);*/
	
	}
 
	public void actionPerformed(ActionEvent e){
		
		/*if(e.getSource() == ajout){
			
			Jouer jouer = new Jouer(this.p);
			this.dispose();
		
		}
		
		if(e.getSource() == suppression){
			
			Regles regles = new Regles(this.p);
			this.dispose();
		
		}
		
		if(e.getSource() == voir){
			
			Classement classement = new Classement(this.p);
			this.dispose();
		
		}

		if(e.getSource() == rechercher){
			
			this.dispose();
		
		}
		
		if(e.getSource() == solde){
			
			Classement classement = new Classement(this.p);
			this.dispose();
		
		}*/
	
	}

}