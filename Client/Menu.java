import java.awt.*;
import java.text.*;
import javax.swing.*;

 
public class Menu extends JFrame {
		 
	private JLabel label = new JLabel("Nom");
	private JLabel label2 = new JLabel("Numéros de réservation");
	
	public Menu(){
		//paramètre pour la fenêtre 
		
		this.setTitle("Menu");
		this.setSize(500, 250);
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
		JLabel name = new JLabel("Veuillez rentrer les informations indiquées");
		name.setFont(police);
		name.setForeground(Color.WHITE);
		haut.add(name,BorderLayout.CENTER);
		haut.setBackground(Color.darkGray);      
		
		
		//panneau bas pour les champs de texte 
		JPanel bas = new JPanel(new BorderLayout());
		container.add(bas);
		bas.setLayout(new GridLayout(2,1));
		
		JPanel bashaut = new JPanel();
		bas.add(bashaut,BorderLayout.NORTH);
		bashaut.setLayout(new GridLayout(1,2));		
		
		//panneau pour label
		JPanel bashautgauche = new JPanel();
		bashaut.add(bashautgauche,BorderLayout.EAST);
		//panneau pour champs de texte
		JPanel bashautdroit = new JPanel();
		bashaut.add(bashautdroit,BorderLayout.WEST);
				
		JPanel bashaut2 = new JPanel();
		bas.add(bashaut2,BorderLayout.CENTER);
		bashaut2.setLayout(new GridLayout(1,2));
		
		//panneau pour label
		JPanel bashautgauche2 = new JPanel();
		bashaut2.add(bashautgauche2,BorderLayout.EAST);
		//panneau pour champs de texte
		JPanel bashautdroit2 = new JPanel();
		bashaut2.add(bashautdroit2,BorderLayout.WEST);	
		
		//pour le bouton
		JPanel bashaut3 = new JPanel();
		container.add(bashaut3,BorderLayout.SOUTH);
		bashaut3.setBackground(Color.darkGray);   
		JTextField texte = new JTextField();
		JTextField texte2 = new JTextField();
		
		texte.setPreferredSize(new Dimension(150, 30));
		texte.setFont(police1);
		texte2.setPreferredSize(new Dimension(150, 30));
		texte2.setFont(police1);
		JButton button = new JButton ("Validé");
		//On ajoute tous
		bashautgauche.add(label);
		bashautdroit.add(texte);
		bashautgauche2.add(label2);
		bashautdroit2.add(texte2);
		//gérer le bouton de validation
		bashaut3.add(button);
		
		button.addActionListener(new ControleMenu(texte,texte2,this));
		//button.addActionListener(new ControleMenu(0));
		this.setVisible(true); 
		
    
	}
	
	
}
