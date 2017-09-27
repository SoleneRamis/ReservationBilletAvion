import java.awt.event.*;
import java.text.*;
import javax.swing.*;

class ControleTablette implements ActionListener{
 
	private JFrame fenetre ; 
	private JRadioButton choix ;
	private int recap ;  
	private int numClient ; 
	
	public ControleTablette(JFrame fenetre0,int numClient0,int recap0)
	{
		recap = recap0 ; 
		numClient=numClient0;
		fenetre = fenetre0;
		
	}
	public void actionPerformed(ActionEvent e) {
		
		new VerificationTablette_Choisie(numClient,fenetre,recap);		
		
	}
}