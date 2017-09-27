import java.awt.event.*;
import java.text.*;
import javax.swing.*;

class ControleChoixTablette implements ItemListener{
 
	private JRadioButton positif ; 
	private JRadioButton negatif; 
	private int numClient ; 
	private String sup ; 
	
	
	public ControleChoixTablette(JRadioButton button0,JRadioButton button1,int numClient0,String sup0)
	{
		sup = sup0 ; 
		numClient = numClient0 ; 
		negatif = button0 ; 
		positif = button1 ; 
	}
	public void itemStateChanged(ItemEvent e) 
	{
		System.out.println("-----------------------");
		if (this.positif.isSelected()) 
		{
			new EnregistrementTablette(numClient,"Oui",sup);

		}
		else if (this.negatif.isSelected()) 
		{
			new EnregistrementTablette(numClient,"Non",sup);		
		}
		
	}
}