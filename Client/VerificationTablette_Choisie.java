import java.awt.*;
import java.sql.*;
import javax.swing.*;


	public class VerificationTablette_Choisie
	{
		private int numClient;
		private JFrame fenetre ;  
		private int recap; 
		public VerificationTablette_Choisie(int numClient0,JFrame fenetre0,int recap0)		
		{
			recap=recap0;
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
								
						ResultSet result = state.executeQuery("SELECT * FROM Tablette WHERE NumClient ='"+numClient+"';");
				
						result.first();
						String i2 = result.getString(2);
						String i3 = result.getString(3);
						System.out.println("tablette trouvé!");
						result.close();
						state.close();
						try
						{
							conn = DriverManager.getConnection("jdbc:mariadb://dwarves.iut-fbleau.fr/projetihm","projetihm","mhitejorp");
							try
							{
								Statement state2 = conn.createStatement();
								//L'objet ResultSet contient le résultat de la requête SQL
									
								ResultSet result2 = state2.executeQuery("SELECT * FROM Reservation WHERE idClient ='"+numClient+"';");
								result2.first();
								int idclass = result2.getInt(4);
								if(recap == 1)
								{
									if(idclass == 2)
									{
										fenetre.dispose();
										(new RecapitulatifEconomique(numClient)).setVisible(true);
										
									}
									else if ( idclass == 1 ) 
									{
										fenetre.dispose();
										(new Magazines(numClient)).setVisible(true);	
									}					
								}
								if(recap == 2)
								{
									fenetre.dispose();
									(new Recapitulatif(numClient)).setVisible(true);
								}
							}
							catch(SQLException e)
							{
								System.out.println("erreur : lors la connaissance de la classe ");

							}
						}
						catch (SQLException e) 
						{
							System.out.println("erreur : lors de connection iut ");
						}
						
					} 
					catch (SQLException e) 
					{
						System.out.println("Erreur sql : tablette!");
						
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
