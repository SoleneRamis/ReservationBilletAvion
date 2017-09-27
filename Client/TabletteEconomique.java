import javax.swing.*;
import java.awt.*;

class TabletteEconomique extends JFrame {
	private int numClient;
	private int recap ; 
	
	public TabletteEconomique(int numClient0,int recap0) {
		numClient=numClient0;
		recap = recap0 ; 
		//paramètre pour la fenêtre 
		
		this.setTitle("Tablette");
		this.setSize(520, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		//écriture
		JPanel haut = new JPanel();
		this.add(haut,BorderLayout.NORTH);
		haut.setBackground(Color.darkGray);
		JLabel choix = new JLabel("Besoin d'une Tablette numérique?");
		choix.setForeground(Color.white);	
		haut.add(choix,BorderLayout.CENTER);
		
		//panneaux principale
		JPanel container = new JPanel();
		container.setLayout(new BorderLayout());
		this.add(container,BorderLayout.CENTER);
		container.setLayout(new GridLayout(2,1));	
		
		//image
		JPanel image = new JPanel();
		container.add(image,BorderLayout.NORTH);
		
			
		//image Tablette
		JPanel imagegauche = new JPanel();
		image.add(imagegauche);
		JLabel imagenormal = new JLabel(new ImageIcon("RessourcePack/tablette.png"));
		imagegauche.add(imagenormal,BorderLayout.CENTER);
				
		

		
		//boutton 
		JPanel bas = new JPanel();
		container.add(bas,BorderLayout.SOUTH);
		
		bas.setLayout(new GridLayout(1,2));
		
		
		//Choix négatif
		JPanel basgauche = new JPanel();
		bas.add(basgauche,BorderLayout.EAST);
		JRadioButton negatif = new JRadioButton("Non");
		basgauche.add(negatif,BorderLayout.SOUTH);
		
		//Choix Positif
		JPanel basmilieu = new JPanel();
		bas.add(basmilieu,BorderLayout.CENTER);
		JRadioButton positif = new JRadioButton("Oui(Service facturé 15e)");
		
		basmilieu.add(positif,BorderLayout.SOUTH);
		
	
		
		//groupe
		ButtonGroup group = new ButtonGroup();
		group.add(negatif);
		negatif.addItemListener(new ControleChoixTablette(negatif,positif,numClient,"oui"));
		group.add(positif);
		positif.addItemListener(new ControleChoixTablette(negatif,positif,numClient,"oui"));
		negatif.setSelected(true);
				
				
		//validation
		JPanel valider = new JPanel();
		this.add(valider,BorderLayout.SOUTH);
		valider.setBackground(Color.darkGray);
		JButton validation = new JButton("Valider");
		validation.addActionListener(new ControleTablette(this,numClient,recap));
		valider.add(validation,BorderLayout.CENTER);
		

	}
	
}