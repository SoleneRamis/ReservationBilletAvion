import java.awt.*;
import java.sql.*;
import javax.swing.*;


	public class VerificationMagazines_Choisie
	{
		private int numClient;
		private JFrame fenetre ;  
		public VerificationMagazines_Choisie(int numClient0,JFrame fenetre0)		
		{
			numClient = numClient0;
			fenetre = fenetre0;
			Connection con=null;
			Connection conn=null;
			try
			{
				Class.forName("org.mariadb.jdbc.Driver");
				try
				{
					con = DriverManager.getConnection("jdbc:mariadb://dwarves.iut-fbleau.fr/klotz","klotz","toto");
					System.out.println("Connexion effective !");
					try
					{
						//Création d'un objet Statement
						Statement state = con.createStatement();
						//L'objet ResultSet contient le résultat de la requête SQL
								
						ResultSet result = state.executeQuery("SELECT * FROM Magazines WHERE NumClient ='"+numClient+"';");
				
						result.first();
						String i1 = result.getString(2);
						String i2 = result.getString(3);
						String i3 = result.getString(4);
						String i4 = result.getString(5);
						String i5 = result.getString(6);
						String i6 = result.getString(7);
						System.out.println("Magazines trouvé trouvé!");
						result.close();
						state.close();
						fenetre.dispose();
						(new Recapitulatif(numClient)).setVisible(true);
						
					} 
					catch (SQLException e) 
					{
						System.out.println("Erreur sql : plat!");
						
					}  
				}
				catch(SQLException e)
				{
						System.out.println(e.getMessage());
				}
			}
			catch(ClassNotFoundException o)
			{
				System.out.println("erreur chargement du pilote"); 
			}
		}  
	}
