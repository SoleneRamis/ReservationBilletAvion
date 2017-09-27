import java.awt.*;
import java.sql.*;
import javax.swing.*;


	public class Validation
	{
		private String str ;
		private String name ;
		private JFrame fenetre ;  
		
		public Validation(String str0,JFrame fenetre0,String name0)
		{
				str = str0; 
				fenetre = fenetre0 ; 
				name = name0 ; 
			Connection con=null;
			
				try
				{
					Class.forName("org.mariadb.jdbc.Driver");
					try
					{
						con = DriverManager.getConnection("jdbc:mariadb://dwarves.iut-fbleau.fr/projetihm","projetihm","mhitejorp");
						System.out.println("Connexion effective !");
							try
							{
								//Création d'un objet Statement
								Statement state = con.createStatement();
								//L'objet ResultSet contient le résultat de la requête SQL
								
								ResultSet result = state.executeQuery("SELECT * FROM Reservation WHERE reference ='"+str+"';");					
								result.first();
								int idclass = result.getInt(4);
								int idvol = result.getInt(3);
								int idClient = result.getInt(2);
								System.out.println(idClient);
								System.out.println(idclass);
								System.out.println("idtrouvé !");
								//new ControleMenu(idVol);
								result.close();
								state.close();
								
								try
								{
									//Création d'un objet Statement
									Statement state2 = con.createStatement();
									//L'objet ResultSet contient le résultat de la requête SQL
									ResultSet result2 = state2.executeQuery("SELECT * FROM Client WHERE id ='"+idClient+"';");
									result2.first();
									System.out.println("Nom trouvé !");
									String namedatabase = result2.getString(3);
									result2.close();
									state2.close();
									Statement state3 = con.createStatement();
									//L'objet ResultSet contient le résultat de la requête SQL
									ResultSet result3 = state3.executeQuery("SELECT * FROM Client WHERE nom ='"+namedatabase+"';");
									result3.first();
									
									int idClient2 = result3.getInt(1);
									
									result3.close();
									state3.close();
									if(namedatabase.equals(name))
									{
										
										if(idclass ==1)
										{
											System.out.println("bon nom superieur !");
											fenetre.dispose();
											new EnregistrementNumVol_et_Reservation(str, idvol, idclass,idClient,fenetre);
											
											
										}
										else if(idclass == 2)
										{
											System.out.println(" bon nom economique:) !");
											fenetre.dispose();
											new EnregistrementNumVol_et_Reservation(str, idvol, idclass,idClient,fenetre);
										}
									}
									else
									{
										
										System.out.println("Client entré :"+idClient+",Client trouvé :"+idClient2);
										System.out.println("Client not corresponding");
										
										fenetre.dispose();
										(new MenuErreur()).setVisible(true);
									}
									
									
									
								}
								catch (SQLException e) 
								{
									System.out.println("Erreur sql : name!");
									
									fenetre.dispose();
									(new MenuErreur()).setVisible(true);
								}
								
								
							} 
							catch (SQLException e) 
							{
								System.out.println("Erreur sql : numreservation!");
								fenetre.dispose();
								(new MenuErreur()).setVisible(true);
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
