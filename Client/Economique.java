import javax.swing.*;
import java.awt.*;

class Economique extends JFrame {
	
	private Color beauvert = new Color(0,129,19); 
	private JButton button[] = new JButton[100]; 
	
	private int numVol ; 
	private int numClient ; 
	int index = 11 ; 
	private int nombreboutton = 100; 
	private int[] a = new int [100];
	private int recap ;
	public Economique(int numVol0,int numClient0,int recap0) {
		
		recap = recap0; 
		numVol = numVol0; 
		numClient = numClient0 ; 
		//paramètre pour la fenêtre 
		
		this.setTitle("Classe Economique");
		this.setSize(520, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		//panneaux principale
		JPanel container = new JPanel();
		container.setBackground(Color.white);
		container.setLayout(new BorderLayout());
		this.add(container,BorderLayout.CENTER);
		container.setLayout(new GridLayout(1,3));	
		
		//Siège coté gauche
		JPanel gauche = new JPanel();
		container.add(gauche,BorderLayout.WEST);
		gauche.setLayout(new GridLayout(1,2));
		
		JPanel gauchegauche = new JPanel();
		gauche.add(gauchegauche,BorderLayout.WEST);
		gauchegauche.setLayout(new GridLayout(20,1));
		for(int i = 0 ; i < 20 ; i ++)
		{
				if(index == 13)
				{
					index++;
				}
				button[i] = new JButton("A"+index);
				gauchegauche.add(button[i]);
				// initialize the JButton directly
				new VerificationSiege(numVol,button,i,numClient,2,nombreboutton,a);
			
				index++;
		}
			
			
		
		index = 11 ; 
		JPanel gauchedroit = new JPanel();
		gauche.add(gauchedroit,BorderLayout.EAST);
		gauchedroit.setLayout(new GridLayout(20,1));
		for(int i = 20 ; i < 40 ; i ++)
		{
			if(index==13)
			{
				index++;
			}
			button[i] = new JButton("B"+index);
			gauchedroit.add(button[i]);
			// initialize the JButton directly
			new VerificationSiege(numVol,button,i,numClient,2,nombreboutton,a);
		

				
			
			index++;
			
		}
		index = 11 ; 
				
		JPanel milieu = new JPanel();
		container.add(milieu,BorderLayout.CENTER);
		milieu.setLayout(new GridLayout(3,1));
		
		JPanel milieuhaut = new JPanel();
		milieu.add(milieuhaut,BorderLayout.NORTH);
		JLabel texte = new JLabel("Veuillez choisir votre siège");
		milieuhaut.add(texte);
		
		JPanel milieumilieu = new JPanel();
		
		JPanel milieubas = new JPanel();
		milieu.add(milieubas,BorderLayout.SOUTH);
		JButton envoyer = new JButton("Envoyer"); 
		milieubas.add(envoyer);
		envoyer.addActionListener(new ControleValidationSiege(this, numClient, recap));

		
		JPanel droit = new JPanel();
		container.add(droit,BorderLayout.EAST);
		droit.setLayout(new GridLayout(1,3));
		
		JPanel droitgauche = new JPanel();
		droit.add(droitgauche,BorderLayout.WEST);
		droitgauche.setLayout(new GridLayout(20,1));
		for(int i = 40 ; i < 60; i ++)
		{
				if(index==13)
				{
					index++;
				}
				button[i] = new JButton("C"+index);
				droitgauche.add(button[i]);
				// initialize the JButton directly
				new VerificationSiege(numVol,button,i,numClient,2,nombreboutton,a);
				

			
			index ++ ; 
		}
		index = 11; 
		JPanel droitmilieu = new JPanel();
		droit.add(droitmilieu,BorderLayout.CENTER );
		droitmilieu.setLayout(new GridLayout(20,1));
		for(int i = 60 ; i < 80; i ++)
		{	
			if(index==13)
			{
				index++;
			}
			button[i] = new JButton("D"+index);
			droitmilieu.add(button[i]);
			// initialize the JButton directly
			new VerificationSiege(numVol,button,i,numClient,2,nombreboutton,a);
			

			
			index ++ ; 
		}
		index=11; 
		
		JPanel droitdroit = new JPanel();
		droit.add(droitdroit,BorderLayout.EAST);
		droitdroit.setLayout(new GridLayout(20,1));
		for(int i = 80; i < 100 ; i ++)
		{
			if(index==13)
			{
				index++;
			}
			button[i] = new JButton("E"+index);
			droitdroit.add(button[i]);
			// initialize the JButton directly
			new VerificationSiege(numVol,button,i,numClient,2,nombreboutton,a);			

			
			index ++ ; 
		}
		
	}
}