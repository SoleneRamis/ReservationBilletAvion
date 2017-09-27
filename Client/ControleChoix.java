import java.awt.event.*;
import java.text.*;
import javax.swing.*;

class ControleChoix implements ItemListener{
 
	private JRadioButton normal ; 
	private JRadioButton vegi; 
	private JRadioButton sgluten ; 
	private int numClient ;

	public ControleChoix(JRadioButton button0,JRadioButton button1,JRadioButton button2,int numClient0) 
	{
		numClient = numClient0 ; 
		normal = button0 ;
		vegi = button1 ; 
		sgluten = button2 ;  
	}
	

	public void itemStateChanged(ItemEvent e) 
	{
		System.out.println("-----------------------");
		if (this.normal.isSelected()) 
		{
			new EnregistrementPlat(numClient,"Normal");
		}
		else if (this.vegi.isSelected()) 
		{
			new EnregistrementPlat(numClient,"Vegetarien");
		}
		else if (this.sgluten.isSelected()) 
		{
			new EnregistrementPlat(numClient,"Sans gluten");
		}		
	}
}
				
		
