import java.awt.event.*;
import java.text.*;
import javax.swing.*;

class ControleMagazines implements ActionListener{
 
	private JFrame fenetre ; 
	private JRadioButton choix ;
	private int numClient ;  

	
	public ControleMagazines(JFrame fenetre0,int numClient0)
	{
		
		fenetre = fenetre0;
		numClient = numClient0;
		
	}
	public void actionPerformed(ActionEvent e) {
		fenetre.dispose();
		
		new VerificationMagazines_Choisie(numClient,fenetre);	
	}
}