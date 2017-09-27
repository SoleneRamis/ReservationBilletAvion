import java.awt.*;
import java.sql.*;
import javax.swing.*;


	public class VerificationSiege
	{
		private String str ;
		private int numVol;
		private int i ;   
		private JButton [] button ; 
		private Color beauvert = new Color(0,129,19);
		private int numClient ; 
		private int[] a = new int [100];
		private int sup ; 
		private int nombreb ; 

		public VerificationSiege(int numVol0,JButton [] button0,int i0,int numClient0,int sup0,int nombreb0,int [] a0)
		{
				nombreb = nombreb0 ; 
				numVol = numVol0 ; 
				button = button0 ; 
				sup = sup0 ; 
				numClient = numClient0 ; 
				i = i0 ;
				a=a0;
				Connection con=null;
				
				try
				{
					Class.forName("org.mariadb.jdbc.Driver");
					try
					{
						con = DriverManager.getConnection("jdbc:mariadb://dwarves.iut-fbleau.fr/klotz","klotz","toto");
						

						//Création d'un objet Statement
						Statement state = con.createStatement();
						//L'objet ResultSet contient le résultat de la requête SQL
						ResultSet result = state.executeQuery("SELECT * FROM Place WHERE NumVol ='"+numVol+"' And NumPlace='"+i+"'And NomClasse='"+sup+"';");
						
						result.first();
						
						int i2 = result.getInt(3);
						
						state.close();
						result.close();
						if(i2 == i)
						{
							a[i] = 1;
							button[i].setForeground(Color.RED);
							
						}
						else if(i2 != i)
						{
							a[i]=0;
							button[i].setForeground(beauvert);
							button[i].addActionListener(new ControleSelectionSiege(button,i,nombreb,numVol,numClient,a,sup));
						}
					}
					catch (SQLException e) 
					{
						button[i].setForeground(beauvert);
						button[i].addActionListener(new ControleSelectionSiege(button,i,nombreb,numVol,numClient,a,sup));
					} 
				}
				catch(ClassNotFoundException o)
				{
					//generer Supérieur ou économique avec modification 
				}
				
											 
		 }
	}
