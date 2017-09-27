import java.awt.event.*;
import java.text.*;
import javax.swing.*;

class ControleMenu implements ActionListener{
	
	private JTextField texte ; 
	private JTextField texte2 ;
	private String str; 
	private String str2;  
	private JFrame fenetre ; 


	
	public ControleMenu(JTextField texte0,JTextField texte20,JFrame fenetre0)
	{
		texte = texte0;
		texte2 = texte20; 
		fenetre = fenetre0;
	
		
	}

	public void actionPerformed(ActionEvent e) 
	{
		str = texte.getText();
		str2 = texte2.getText();
		System.out.println("-----------------------");
		System.out.println("Nom : " + str );
		System.out.println("-----------------------");
		System.out.println("Numéros de réservation :" + str2);
		new Validation(str2,fenetre,str); 
		
	}
}