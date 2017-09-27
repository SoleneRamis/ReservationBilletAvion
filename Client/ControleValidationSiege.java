import java.awt.event.*;
import java.text.*;
import javax.swing.*;

class ControleValidationSiege implements ActionListener{
 
	private JFrame fenetre ;
	private int numClient ;  
	private int recap ; 
	
	public ControleValidationSiege(JFrame fenetre0,int numClient0,int recap0)
	{
		recap = recap0 ; 
		fenetre = fenetre0;
		numClient=numClient0; 
	}
	public void actionPerformed(ActionEvent e) {
		
			new VerificationSiege_Choisie(numClient,fenetre,recap);
	}
	
}