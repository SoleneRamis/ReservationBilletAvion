import java.awt.*;
import java.sql.*;
import javax.swing.*;


	public class VerificationSiege_Choisie
	{
		private int numClient;
		private JFrame fenetre ; 
		private int recap ;  
		public VerificationSiege_Choisie(int numClient0,JFrame fenetre0,int recap0)		
		{
			recap = recap0 ; 
			numClient = numClient0;
			fenetre = fenetre0;
			Connection con=null;
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
								
						ResultSet result = state.executeQuery("SELECT * FROM Place WHERE NumClient ='"+numClient+"';");
				
						result.first();
						String i2 = result.getString(3);
						System.out.println("Place trouvé!");
						result.close();
						state.close();
						fenetre.dispose();
						if(recap == 1)
						{
							(new Plat(numClient,1)).setVisible(true);
						}
						if(recap == 2)
						{
							(new Recapitulatif(numClient)).setVisible(true);
						}
								
					} 
					catch (SQLException e) 
					{
						System.out.println("Erreur sql : numreservation!");
						
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
