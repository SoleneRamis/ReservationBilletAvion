import java.awt.*;
import java.sql.*;
import javax.swing.*;


	public class EnregistrementNumVol_et_Reservation
	{
		private String reservation ;
		private int numVol ; 
		private int numClient;
		private int idClasse; 
		private JFrame fenetre ; 
		public EnregistrementNumVol_et_Reservation(String str0,int num0,int num1,int num2,JFrame fenetre0)
		{
				fenetre = fenetre0 ; 
				reservation = str0 ; 
				numVol = num0 ; 
				idClasse = num1 ; 
				numClient = num2 ; 
				
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
								
								state.executeUpdate("INSERT INTO `klotz`.`InfoClient` (`NumRes`, `NumVol`, `NumClasse`,`NumClient`) VALUES ('"+reservation+"', '"+numVol+"', '"+idClasse+"','"+numClient+"');");					
								
								System.out.println("save sucess");
				
								
								state.close();
								if(idClasse ==1)
								{
									
									fenetre.dispose();
									(new Superieur(numVol,numClient,1)).setVisible(true);
									
									
								}
								else if(idClasse == 2)
								{
									fenetre.dispose();
									(new Economique(numVol,numClient,1)).setVisible(true);
								}
								
								
							} 
							catch (SQLException e) 
							{
								
								fenetre.dispose();
								(new Recapitulatif(numClient)).setVisible(true);
							}  
					}
					catch(SQLException e)
					{
						
						System.out.println("erreur charge recap");
										 
					}
				}
				catch(ClassNotFoundException o)
				{
					System.out.println("erreur chargement du pilote"); 
				}
				
											 
			}  
	}
