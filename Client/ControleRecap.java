import java.awt.event.*;
import java.text.*;
import javax.swing.*;
import javax.xml.transform.*;
import java.awt.*;

class ControleRecap implements ActionListener
{
 
	private int i ; 
	private int numClient ;
	private JFrame fenetre ;  
		
	public ControleRecap(int i0,int numClient0,JFrame fenetre0 )
	{
		fenetre = fenetre0 ; 
		numClient = numClient0 ; 
		i = i0 ; 
	}
	public void actionPerformed(ActionEvent e) 
	{
		
		System.out.println("-----------------------");
		
		new VerificationRecap(i,numClient,fenetre);
				
	}
}
