import java.awt.event.*;
import java.text.*;
import javax.swing.*;
import javax.xml.transform.*;
import java.awt.*;

class ControleSelectionSiege implements ActionListener
{
 
	private String str ; 
	private JButton b ; 
	private Color beaujaune = new Color(255,249,50);
	private Color beauvert = new Color(0,129,19); 
	private JButton [] button ; 
	private int colorB ;
	private int colorV ;
	private int numClient ; 
	private int numVol; 
	private int [] a ;
	private int nomClasse ; 
		
	public ControleSelectionSiege(JButton [] button0,int colorB0 , int colorV0,int numVol0,int numClient0,int [] a0,int nomClasse0)
	{
		colorB = colorB0 ; 
		colorV = colorV0 ; 
		nomClasse = nomClasse0;
		button = button0 ; 
		numVol = numVol0;
		numClient = numClient0;
		a = a0 ; 
		
	}
	public void actionPerformed(ActionEvent e) 
	{
		
		System.out.println("-----------------------");
		
		for(int i = 0 ; i < colorV ; i++)
		{
			if(a[i]==1)
			{
				button[i].setForeground(Color.red);
			}
			if(a[i]==0)
			{
				button[i].setForeground(beauvert);
			}
			if(i == colorB)
			{
				button[i].setForeground(beaujaune);
			}
			
		}
		
		new EnregistrementSiege(numClient, numVol, colorB,colorV,nomClasse);
		
		 str = e.getActionCommand();
		 System.out.println("Choix du siege :"+str);
	}
}
