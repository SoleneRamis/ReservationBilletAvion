import java.awt.event.*;
import java.text.*;
import javax.swing.*;

class ControleChoixMagazines implements ItemListener{
 
	private JRadioButton vogue ; 
	private JRadioButton oops; 
	private JRadioButton figaro ; 
	private JRadioButton liberation; 
	private JRadioButton equipe; 
	private JRadioButton moto; 
	private int numClient ; 
	private String sup ; 
	
	
	
	public ControleChoixMagazines(JRadioButton button0,JRadioButton button1,JRadioButton button2,JRadioButton button3,JRadioButton button4,JRadioButton button5,int numClient0)
	{
		
		numClient = numClient0 ; 
		vogue=button0;
		oops=button1;
		figaro=button2;
		liberation=button3;
		equipe=button4;
		moto=button5;
	}
	public void itemStateChanged(ItemEvent e) 
	{
		System.out.println("-----------------------");
		
		int a[] = new int[6]; 
		for(int i = 0 ; i < 6 ;i++)
		{
			a[i]=0;
		}
		
		if(this.vogue.isSelected())
		{
			a[0]=1;	
		}
		if(this.oops.isSelected())
		{
			a[1]=1;	
		}
		if(this.figaro.isSelected())
		{
			a[2]=1;	
		}
		if(this.liberation.isSelected())
		{
			a[3]=1;	
		}
		if(this.equipe.isSelected())
		{
			a[4]=1;	
		}
		if(this.moto.isSelected())
		{
			a[5]=1;	
		}
			
		System.out.println(a);
		new EnregistrementMagazines(numClient,a);
		
			
		
	}
}