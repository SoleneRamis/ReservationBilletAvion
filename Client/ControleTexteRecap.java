
import java.awt.event.*;
import java.text.*;
import javax.swing.*;

class ControleTexteRecap implements ActionListener{
	
	private JTextField texte ; 
	private String str; 
  	private int numClient ; 
	private JFrame fenetre ; 


	
	public ControleTexteRecap(JTextField texte0,JFrame fenetre0,int numClient0)
	{
		numClient = numClient0;
		texte = texte0;
		fenetre = fenetre0;
	}

	public void actionPerformed(ActionEvent e) 
	{
		str = texte.getText();
	
		System.out.println("-----------------------");
		System.out.println("texte : " + str );
		System.out.println("-----------------------");
	
		new ValidationCommentaire(str,numClient,fenetre); 
		
	}
}