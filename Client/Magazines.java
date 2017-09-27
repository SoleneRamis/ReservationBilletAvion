import javax.swing.*;
import java.awt.*;

class Magazines extends JFrame {
	
	private int numClient ; 
	
	public Magazines(int numClient0) {
		
		numClient = numClient0 ; 
		//paramètre pour la fenêtre 
		
		this.setTitle("Magazines");
		this.setSize(520, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		//écriture
		JPanel haut = new JPanel();
		this.add(haut,BorderLayout.NORTH);
		haut.setBackground(Color.darkGray);
		JLabel choix = new JLabel("Besoin d'un Magazines?");
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
		image.setLayout(new GridLayout(1,6));
		
			
		//Magazine Vogue
		JPanel imageVogue = new JPanel();
		image.add(imageVogue);
		JLabel vogue = new JLabel(new ImageIcon("RessourcePack/vogue.png"));
		imageVogue.add(vogue,BorderLayout.CENTER);
		
		//Magazine Oops
		JPanel imageOops = new JPanel();
		image.add(imageOops);
		JLabel oops = new JLabel(new ImageIcon("RessourcePack/Oops.jpg"));
		imageOops.add(oops,BorderLayout.CENTER);
		
		//Magazine Figaro
		JPanel imageFigaro = new JPanel();
		image.add(imageFigaro);
		JLabel figaro = new JLabel(new ImageIcon("RessourcePack/figaro.jpg"));
		imageFigaro.add(figaro,BorderLayout.CENTER);
		
		//Magazines Libération
		JPanel imageLiberation = new JPanel();
		image.add(imageLiberation);
		JLabel liberation = new JLabel(new ImageIcon("RessourcePack/liberation.jpg"));
		imageLiberation.add(liberation,BorderLayout.CENTER);
		
		//Magazine l'équipe
		JPanel imageEquipe = new JPanel();
		image.add(imageEquipe);
		JLabel equipe = new JLabel(new ImageIcon("RessourcePack/equipe.jpg"));
		imageEquipe.add(equipe,BorderLayout.CENTER);
		
		//Magazine Moto journal
		JPanel imageMoto = new JPanel();
		image.add(imageMoto);
		JLabel moto = new JLabel(new ImageIcon("RessourcePack/motojournal.jpg"));
		imageMoto.add(moto,BorderLayout.CENTER);
				
		//Panneaux Bouttons
		JPanel bas = new JPanel();
		container.add(bas,BorderLayout.SOUTH);
		bas.setLayout(new GridLayout(1,6));
		
		
		//Choix Vogue
		JPanel basVogue = new JPanel();
		bas.add(basVogue,BorderLayout.EAST);
		JRadioButton rVogue = new JRadioButton("");
		basVogue.add(rVogue,BorderLayout.SOUTH);
		
		//Choix Oops
		JPanel basOops = new JPanel();
		bas.add(basOops,BorderLayout.EAST);
		JRadioButton rOops = new JRadioButton("");
		
		basOops.add(rOops,BorderLayout.SOUTH);
		
		//Choix Figaro
		JPanel basFigaro = new JPanel();
		bas.add(basFigaro,BorderLayout.EAST);
		JRadioButton rFigaro = new JRadioButton("");
		basFigaro.add(rFigaro,BorderLayout.SOUTH);
		
		//Choix Liberation
		JPanel basLiberation = new JPanel();
		bas.add(basLiberation,BorderLayout.EAST);
		JRadioButton rLiberation = new JRadioButton("");
		basLiberation.add(rLiberation,BorderLayout.SOUTH);
		
		//Choix equipe
		JPanel basEquipe = new JPanel();
		bas.add(basEquipe,BorderLayout.EAST);
		JRadioButton rEquipe = new JRadioButton("");
		basEquipe.add(rEquipe,BorderLayout.SOUTH);
		
		//Choix moto journal
		JPanel basMoto = new JPanel();
		bas.add(basMoto,BorderLayout.EAST);
		JRadioButton rMoto = new JRadioButton("");
		basMoto.add(rMoto,BorderLayout.SOUTH);
		
		//pas de groupe boutton car plusieurs magazines peuvent être selectionés 
		rVogue.addItemListener(new ControleChoixMagazines(rVogue,rOops,rFigaro,rLiberation,rEquipe,rMoto,numClient));
		rOops.addItemListener(new ControleChoixMagazines(rVogue,rOops,rFigaro,rLiberation,rEquipe,rMoto,numClient));
		rFigaro.addItemListener(new ControleChoixMagazines(rVogue,rOops,rFigaro,rLiberation,rEquipe,rMoto,numClient));
		rLiberation.addItemListener(new ControleChoixMagazines(rVogue,rOops,rFigaro,rLiberation,rEquipe,rMoto,numClient));
		rEquipe.addItemListener(new ControleChoixMagazines(rVogue,rOops,rFigaro,rLiberation,rEquipe,rMoto,numClient));
		rMoto.addItemListener(new ControleChoixMagazines(rVogue,rOops,rFigaro,rLiberation,rEquipe,rMoto,numClient));

		//validation
		JPanel valider = new JPanel();
		this.add(valider,BorderLayout.SOUTH);
		valider.setBackground(Color.darkGray);
		JButton validation = new JButton("Valider");
		validation.addActionListener(new ControleMagazines(this,numClient));
		valider.add(validation,BorderLayout.CENTER);
		

	}
	
}