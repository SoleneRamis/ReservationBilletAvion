import javax.swing.*;
import java.awt.*;

class Plat extends JFrame {
	private int numClient ;
	private int recap ; 
	public Plat(int numClient0,int recap0) {
		recap = recap0;
		numClient = numClient0 ; 
		
		//paramètre pour la fenêtre 
		
		this.setTitle("Choix du plat");
		this.setSize(520, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		//écriture
		JPanel haut = new JPanel();
		this.add(haut,BorderLayout.NORTH);
		haut.setBackground(Color.darkGray);
		JLabel choix = new JLabel("Choix du Plat lors du Vol");
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
		image.setLayout(new GridLayout(1,3));
			
		//image normal
		JPanel imagegauche = new JPanel();
		image.add(imagegauche);
		JLabel imagenormal = new JLabel(new ImageIcon("RessourcePack/normal.png"));
		imagegauche.add(imagenormal,BorderLayout.CENTER);
				
		//image vegetarien
		JPanel imagemilieu = new JPanel();
		image.add(imagemilieu);
		JLabel imagevegetarien = new JLabel(new ImageIcon("RessourcePack/vegetarien.png"));
		imagemilieu.add(imagevegetarien,BorderLayout.CENTER);
		
		//image sans gluten
		JPanel imagedroit = new JPanel();
		image.add(imagedroit);
		JLabel imagesgluten = new JLabel(new ImageIcon("RessourcePack/sgluten.png"));
		imagedroit.add(imagesgluten,BorderLayout.CENTER);

		
		//boutton 
		JPanel bas = new JPanel();
		container.add(bas,BorderLayout.SOUTH);
		
		bas.setLayout(new GridLayout(1,3));
		
		
		//plat normal
		JPanel basgauche = new JPanel();
		bas.add(basgauche,BorderLayout.EAST);
		JRadioButton normal = new JRadioButton("");
		basgauche.add(normal,BorderLayout.SOUTH);
		
		//plat vegetarien
		JPanel basmilieu = new JPanel();
		bas.add(basmilieu,BorderLayout.CENTER);
		JRadioButton vegi = new JRadioButton("");
		
		basmilieu.add(vegi,BorderLayout.SOUTH);
		
		//plat sans gluten
		JPanel basdroit = new JPanel();
		bas.add(basdroit,BorderLayout.WEST);
		JRadioButton sgluten = new JRadioButton("");
		
		basdroit.add(sgluten,BorderLayout.SOUTH);
		
		//groupe
		ButtonGroup group = new ButtonGroup();
		
		group.add(normal);
		normal.addItemListener(new ControleChoix(normal,vegi,sgluten,numClient));
		group.add(vegi);
		vegi.addItemListener(new ControleChoix(normal,vegi,sgluten,numClient));
		group.add(sgluten);
		sgluten.addItemListener(new ControleChoix(normal,vegi,sgluten,numClient));
		normal.setSelected(true);
				
		//validation
		JPanel valider = new JPanel();
		this.add(valider,BorderLayout.SOUTH);
		valider.setBackground(Color.darkGray);
		JButton validation = new JButton("Valider");
		validation.addActionListener(new ControlePlat(this,numClient,recap));
		valider.add(validation,BorderLayout.CENTER);
		

	}
}