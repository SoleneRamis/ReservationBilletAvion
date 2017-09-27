import javax.swing.*;
import java.awt.*;
import java.beans.beancontext.*;

class Superieur extends JFrame {
	private Color beauvert = new Color(0,129,19); 
	
	private JButton button[] = new JButton[30]; 
	private int index = 1 ; 
	private int numVol;
	private int numClient ; 
	private int nombreboutton = 30; 
	private int[] a = new int [30];
	private int recap ; 
	
	
	
	public Superieur(int numVol0,int numClient0,int recap0) {
		recap = recap0 ; 
		numVol = numVol0; 
		numClient = numClient0 ; 
		//paramètre pour la fenêtre 
		
		this.setTitle("Classe Supérieur");
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
		gauche.setLayout(new GridLayout(10,1));
		for(int i = 0 ; i < 10 ; i ++)
		{
			button[i] = new JButton("A"+index);
			gauche.add(button[i]);
			// initialize the JButton directly
		//	button[i].setForeground(beauvert);
			new VerificationSiege(numVol,button,i,numClient,1,nombreboutton,a);			
			index++ ; 
		}
		index = 1 ; 
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
		envoyer.addActionListener(new ControleValidationSiege(this,numClient,recap));

		
		JPanel droit = new JPanel();
		container.add(droit,BorderLayout.EAST);
		droit.setLayout(new GridLayout(1,2));
		
		JPanel droitgauche = new JPanel();
		droit.add(droitgauche,BorderLayout.WEST);
		droitgauche.setLayout(new GridLayout(10,1));
		for(int i = 10 ; i < 20; i ++)
		{
			button[i] =new JButton("E"+index);
			droitgauche.add(button[i]);
			// initialize the JButton directly
		//	button[i].setForeground(beauvert);
			new VerificationSiege(numVol,button,i,numClient,1,nombreboutton,a);
			
			index ++ ; 
		}
		index = 1 ; 
		
		JPanel droitdroit = new JPanel();
		droit.add(droitdroit,BorderLayout.WEST);
		droitdroit.setLayout(new GridLayout(10,1));
		for(int i =20 ; i < 30; i ++)
		{
			button[i] =new JButton("C"+index);
			droitdroit.add(button[i]);
			// initialize the JButton directly
		//	button[i].setForeground(beauvert);
			new VerificationSiege(numVol,button,i,numClient,1,nombreboutton,a);
			
			index ++ ; 
		}
		
		
	}
}