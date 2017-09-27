import java.awt.*;
import java.text.*;
import javax.swing.*;

 
public class RecapitulatifEconomique extends JFrame {
		 
	private JLabel label = new JLabel("Prénom");
	private JLabel label2 = new JLabel("Nom : ");
	private JLabel label3 = new JLabel("Numéros de réservation : ");
	private JLabel label4 = new JLabel("Classe : ");
	private JLabel label5 = new JLabel("Numéros du siège : ");
	private JLabel label6 = new JLabel("Plat : ");
	private JLabel label7 = new JLabel("Prêt d'une Tablette");
	private JLabel label8 = new JLabel("Informations importantes pour le personnel?:");

	


	
	private int numClient ; 
	
	public RecapitulatifEconomique(int numClient0){
		numClient=numClient0;
		//paramètre pour la fenêtre 
		
		this.setTitle("Menu");
		this.setSize(600, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		//police d'écriture 
		
		Font police = new Font("Arial", Font.BOLD, 14);
		Font police1 = new Font("Arial", Font.PLAIN, 14);
		
		//gérer les panneaux présent
		
		//panneaux principale
		JPanel container = new JPanel();
		container.setBackground(Color.white);
		container.setLayout(new BorderLayout());
		this.add(container,BorderLayout.CENTER);
				
		//panneau haut pour l'écriture
		JPanel haut = new JPanel();
		container.add(haut,BorderLayout.NORTH);
		JLabel name = new JLabel("Récapitulatif");
		name.setFont(police1);
		name.setForeground(Color.WHITE);
		haut.add(name,BorderLayout.CENTER);
		haut.setBackground(Color.darkGray);   
				
		//
		JPanel autre = new JPanel();
		container.add(autre,BorderLayout.CENTER);
	
				
				
		//panneau bas pour les champs de texte
		JPanel haut3 = new JPanel();
		autre.add(haut3,BorderLayout.CENTER); 
		JPanel bas = new JPanel(new BorderLayout());
		haut3.add(bas);
		bas.setLayout(new GridLayout(8,1));
		
		
		
		//panneau pour libellé/ texte /bouttons
		JPanel bashaut = new JPanel();
		bas.add(bashaut,BorderLayout.NORTH);
		bashaut.setLayout(new GridLayout(1,3));
		//panneau pour label1
		JPanel bashautgauche = new JPanel();
		bashaut.add(bashautgauche,BorderLayout.EAST);
		//panneau pour afficher le texte1
		JPanel bashautmilieu= new JPanel();
		bashaut.add(bashautmilieu,BorderLayout.CENTER);
		//panneau pour le boutons modifier
		JPanel bashautdroit = new JPanel();
		bashaut.add(bashautdroit,BorderLayout.WEST);
		
		
		//panneau pour libellé/ texte /bouttons
		JPanel bashaut2 = new JPanel();
		bas.add(bashaut2,BorderLayout.NORTH);
		bashaut2.setLayout(new GridLayout(1,3));
		//panneau pour label1
		JPanel bashautgauche2 = new JPanel();
		bashaut2.add(bashautgauche2,BorderLayout.EAST);
		//panneau pour afficher le texte1
		JPanel bashautmilieu2= new JPanel();
		bashaut2.add(bashautmilieu2,BorderLayout.CENTER);
		//panneau pour le boutons modifier
		JPanel bashautdroit2 = new JPanel();
		bashaut2.add(bashautdroit2,BorderLayout.WEST);
		
		//panneau pour libellé/ texte /bouttons
		JPanel bashaut3 = new JPanel();
		bas.add(bashaut3,BorderLayout.NORTH);
		bashaut3.setLayout(new GridLayout(1,3));
		//panneau pour label1
		JPanel bashautgauche3 = new JPanel();
		bashaut3.add(bashautgauche3,BorderLayout.EAST);
		//panneau pour afficher le texte1
		JPanel bashautmilieu3= new JPanel();
		bashaut3.add(bashautmilieu3,BorderLayout.CENTER);
		//panneau pour le boutons modifier
		JPanel bashautdroit3 = new JPanel();
		bashaut3.add(bashautdroit3,BorderLayout.WEST);	
		
		//panneau pour libellé/ texte /bouttons
		JPanel bashaut4 = new JPanel();
		bas.add(bashaut4,BorderLayout.NORTH);
		bashaut4.setLayout(new GridLayout(1,3));
		//panneau pour label1
		JPanel bashautgauche4 = new JPanel();
		bashaut4.add(bashautgauche4,BorderLayout.EAST);
		//panneau pour afficher le texte1
		JPanel bashautmilieu4= new JPanel();
		bashaut4.add(bashautmilieu4,BorderLayout.CENTER);
		//panneau pour le boutons modifier
		JPanel bashautdroit4 = new JPanel();
		bashaut4.add(bashautdroit4,BorderLayout.WEST);	
		
		//panneau pour libellé/ texte /bouttons
		JPanel bashaut5 = new JPanel();
		bas.add(bashaut5,BorderLayout.NORTH);
		bashaut5.setLayout(new GridLayout(1,3));
		//panneau pour label1
		JPanel bashautgauche5 = new JPanel();
		bashaut5.add(bashautgauche5,BorderLayout.EAST);
		//panneau pour afficher le texte1
		JPanel bashautmilieu5= new JPanel();
		bashaut5.add(bashautmilieu5,BorderLayout.CENTER);
		//panneau pour le boutons modifier
		JPanel bashautdroit5 = new JPanel();
		bashaut5.add(bashautdroit5,BorderLayout.WEST);	
		
		//panneau pour libellé/ texte /bouttons
		JPanel bashaut6 = new JPanel();
		bas.add(bashaut6,BorderLayout.NORTH);
		bashaut6.setLayout(new GridLayout(1,3));
		//panneau pour label1
		JPanel bashautgauche6 = new JPanel();
		bashaut6.add(bashautgauche6,BorderLayout.EAST);
		//panneau pour afficher le texte1
		JPanel bashautmilieu6= new JPanel();
		bashaut6.add(bashautmilieu6,BorderLayout.CENTER);
		//panneau pour le boutons modifier
		JPanel bashautdroit6 = new JPanel();
		bashaut6.add(bashautdroit6,BorderLayout.WEST);	
		
		//panneau pour libellé/ texte /bouttons
		JPanel bashaut7 = new JPanel();
		bas.add(bashaut7,BorderLayout.NORTH);
		bashaut7.setLayout(new GridLayout(1,3));
		//panneau pour label1
		JPanel bashautgauche7 = new JPanel();
		bashaut7.add(bashautgauche7,BorderLayout.EAST);
		//panneau pour afficher le texte1
		JPanel bashautmilieu7= new JPanel();
		bashaut7.add(bashautmilieu7,BorderLayout.CENTER);
		//panneau pour le boutons modifier
		JPanel bashautdroit7 = new JPanel();
		bashaut7.add(bashautdroit7,BorderLayout.WEST);	
		
		////panneau pour libellé/ texte /bouttons
		JPanel bashaut8 = new JPanel();
		bas.add(bashaut8,BorderLayout.NORTH);
		bashaut8.setLayout(new GridLayout(1,2));
		//panneau pour label1
		JPanel bashautgauche8 = new JPanel();
		bashaut8.add(bashautgauche8,BorderLayout.EAST);
		
	
		//panneau pour le texte
		JPanel bashautdroit8 = new JPanel();
		bashaut8.add(bashautdroit8,BorderLayout.WEST);	
		
		JTextField texte = new JTextField();
		texte.setPreferredSize(new Dimension(150, 50));
		texte.setFont(police1);
		bashautgauche8.add(label8);
		bashautdroit8.add(texte);

		
		

		//Boutons modification
		
		
		JButton button5 = new JButton("modifier");
		button5.addActionListener(new ControleRecap(1,numClient,this));
		JButton button6 = new JButton("modifier");
		button6.addActionListener(new ControleRecap(2,numClient,this));
		JButton button7 = new JButton("modifier");
		button7.addActionListener(new ControleRecap(3,numClient,this));
		
		
		//On incorpore tous 
		//nom
		bashautgauche.add(label);
		//capture des données 
		new Recuperation_des_donnes(numClient,"Nom",bashautmilieu);
		
		//prenom
		bashautgauche2.add(label2);
		new Recuperation_des_donnes(numClient,"Prenom",bashautmilieu2);
		
		//num res
		bashautgauche3.add(label3);
		new Recuperation_des_donnes(numClient,"NumRes",bashautmilieu3);
		
		//classe
		bashautgauche4.add(label4);
		new Recuperation_des_donnes(numClient,"Classe",bashautmilieu4);
		
		//Numéros siège
		bashautgauche5.add(label5);
		new Recuperation_des_donnes(numClient,"NumSiege",bashautmilieu5);
		bashautdroit5.add(button5);
		//Plat
		bashautgauche6.add(label6);
		new Recuperation_des_donnes(numClient,"Plat",bashautmilieu6);
		bashautdroit6.add(button6);
		//tablette
		bashautgauche7.add(label7);
		new Recuperation_des_donnes(numClient,"Tablette",bashautmilieu7);
		bashautdroit7.add(button7);
		//commentaire 
						
		
		
				
		//panneau haut pour l'écriture
		JPanel haut2 = new JPanel();
		container.add(haut2,BorderLayout.SOUTH);
		
		haut2.setBackground(Color.darkGray);  
		JButton buttonE = new JButton ("Enregistrer");
		buttonE.addActionListener(new ControleTexteRecap(texte,this,numClient));
		haut2.add(buttonE);
		
		this.setVisible(true); 
	}
	
	
}
