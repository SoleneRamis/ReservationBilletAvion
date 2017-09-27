import java.awt.event.*;
import java.text.*;
import javax.swing.*;

class ControlePlat implements ActionListener{
 
	private JFrame fenetre ; 
	private JRadioButton choix ; 
	private int numClient;
	private int recap ;
	
	public ControlePlat(JFrame fenetre0,int numClient0,int recap0)
	{
		recap = recap0 ; 
		numClient=numClient0;
		fenetre = fenetre0;
		
	}
	public void actionPerformed(ActionEvent e) {
				
		
		new VerificationPlat_Choisie(numClient,fenetre,recap);
		
	}
}