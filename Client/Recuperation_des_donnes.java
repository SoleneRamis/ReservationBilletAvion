import java.awt.*;
import java.sql.*;
import javax.swing.*;


	public class  Recuperation_des_donnes
	{
		private int numClient ;
		private String label ; 
		private JPanel panel ; 

		public Recuperation_des_donnes(int numClient0, String label0,JPanel panel0)	
		{
			numClient = numClient0;
			panel = panel0 ; 
			label = label0 ; 
			Connection con=null;
			Connection conn=null;
			
			try
			{
				Class.forName("org.mariadb.jdbc.Driver");
				
					
					
										
						
						if(label.equals("Nom"))
						{
							try
							{
								conn = DriverManager.getConnection("jdbc:mariadb://dwarves.iut-fbleau.fr/projetihm","projetihm","mhitejorp");		
								//Création d'un objet Statement
								Statement state = conn.createStatement();

								ResultSet result = state.executeQuery("SELECT * FROM Client WHERE id ='"+numClient+"';");
								
								result.first();
								String ii = result.getString(3);
								
								JLabel i = new JLabel(ii); 
								panel.add(i);
								result.close();
								state.close();
							}
							catch (SQLException e) 
							{
								
								
								JLabel i9 = new JLabel(""); 
								panel.add(i9);
							} 
						}
						else if(label.equals("Prenom"))
						{
							try{
								conn = DriverManager.getConnection("jdbc:mariadb://dwarves.iut-fbleau.fr/projetihm","projetihm","mhitejorp");		
								//Création d'un objet Statement
								Statement state2 = conn.createStatement();

								ResultSet result2 = state2.executeQuery("SELECT * FROM Client WHERE id ='"+numClient+"';");
								
								result2.first();
								String ii2 = result2.getString(2);
								
								JLabel i2 = new JLabel(ii2); 
								panel.add(i2);
								result2.close();
								state2.close();
							}
							catch (SQLException e) 
							{
								
								
								JLabel i9 = new JLabel(""); 
								panel.add(i9);
							} 
						}
						else if(label.equals("NumRes"))
						{
							try
							{
								conn = DriverManager.getConnection("jdbc:mariadb://dwarves.iut-fbleau.fr/projetihm","projetihm","mhitejorp");		
								//Création d'un objet Statement
								Statement state3 = conn.createStatement();

								ResultSet result3 = state3.executeQuery("SELECT * FROM Reservation WHERE idClient ='"+numClient+"';");
								
								result3.first();
								String ii3 = result3.getString(5);
								
								JLabel i3 = new JLabel(ii3); 
								panel.add(i3);
								result3.close();
								state3.close();
							}
							catch (SQLException e) 
							{
								
								
								JLabel i9 = new JLabel(""); 
								panel.add(i9);
							} 
						}
						else if(label.equals("Classe"))
						{
							try
							{
							conn = DriverManager.getConnection("jdbc:mariadb://dwarves.iut-fbleau.fr/projetihm","projetihm","mhitejorp");		
							//Création d'un objet Statement
							Statement state4 = conn.createStatement();

							ResultSet result4 = state4.executeQuery("SELECT * FROM Reservation WHERE idClient ='"+numClient+"';");
							
							result4.first();
							int ii4 = result4.getInt(4);
						    String ii42 = 	Integer.toString(ii4);
							JLabel i4 = new JLabel(ii42); 
							panel.add(i4);
							result4.close();
							state4.close();
							}
							catch (SQLException e) 
							{
								
								
								JLabel i9 = new JLabel(""); 
								panel.add(i9);
							} 
						}
						else if(label.equals("NumSiege"))
						{
							try
							{
								con = DriverManager.getConnection("jdbc:mariadb://dwarves.iut-fbleau.fr/klotz","klotz","toto");
								System.out.println("Connexion effective !");
								
								//Création d'un objet Statement
								Statement state5 = con.createStatement();

								ResultSet result5 = state5.executeQuery("SELECT * FROM Place WHERE NumClient ='"+numClient+"';");
								
								result5.first();
								String ii5 = result5.getString(4);
								JLabel i5 = new JLabel(ii5); 
								panel.add(i5);
								result5.close();
								state5.close();
							}
							catch (SQLException e) 
							{
								
								
								JLabel i9 = new JLabel(""); 
								panel.add(i9);
							} 
						}
						else if(label.equals("Plat"))
						{
							try
							{
								con = DriverManager.getConnection("jdbc:mariadb://dwarves.iut-fbleau.fr/klotz","klotz","toto");
								System.out.println("----------------------");
								System.out.println("Connexion effective !");
								
								
								//Création d'un objet Statement
								Statement state6 = con.createStatement();

								ResultSet result6 = state6.executeQuery("SELECT * FROM Plat WHERE NumClient ='"+numClient+"';");
								
								result6.first();
								String ii6 = result6.getString(2);
								JLabel i6 = new JLabel(ii6); 
								panel.add(i6);
								result6.close();
								state6.close();
							}
							catch (SQLException e) 
							{
								JLabel i9 = new JLabel(""); 
								panel.add(i9);
							} 
						}
						else if(label.equals("Tablette"))
						{
							try 
							{
								con = DriverManager.getConnection("jdbc:mariadb://dwarves.iut-fbleau.fr/klotz","klotz","toto");
								System.out.println("----------------------");
								System.out.println("Connexion effective !");
								
								
								//Création d'un objet Statement
								Statement state7 = con.createStatement();

								ResultSet result7 = state7.executeQuery("SELECT * FROM Tablette WHERE NumClient ='"+numClient+"';");
								
								result7.first();
								String ii7 = result7.getString(2);
								String ii72 = result7.getString(3);
								String ii73 = "" ; 
								if(ii7.equals("Oui"))
								{
									ii73 = ("Tablette:"+ii7+",Suplément:"+ii72);
								}
								else if(ii72.equals("Non"))
								{
									ii73 = ii72 ; 
								}
								
								JLabel i7 = new JLabel(ii73);
								 
								panel.add(i7);
								result7.close();
								state7.close();
							}
							catch (SQLException e) 
							{

								JLabel i9 = new JLabel(""); 
								panel.add(i9);
							} 
						}
						else if(label.equals("Magazine"))
						{
							try
							{
								con = DriverManager.getConnection("jdbc:mariadb://dwarves.iut-fbleau.fr/klotz","klotz","toto");
								System.out.println("----------------------");
								System.out.println("Connexion effective !");
								
								
								//Création d'un objet Statement
								Statement state8 = con.createStatement();

								ResultSet result8 = state8.executeQuery("SELECT * FROM Magazines WHERE NumClient ='"+numClient+"';");
								
								result8.first();
								String ii8 = result8.getString(2);
								String ii82 = result8.getString(3);
								String ii83 = result8.getString(4);
								String ii84 = result8.getString(5);
								String ii85 = result8.getString(6);
								String ii86 = result8.getString(7);
								
								String vogue = "";
								String oops = "";
								String figaro = "";
								String liberation = "";
								String equipe = "";
								String moto = "";
								if(ii8.equals("oui"))
								{
									vogue = "Vogue";
								}
								if(ii82.equals("oui"))
								{
								 	oops = "Oops";
								}
								if(ii83.equals("oui"))
								{
									figaro = "Figaro";
								}
								if(ii84.equals("oui"))
								{
									liberation = "Liberation";
								}
								if(ii85.equals("oui"))
								{
									equipe = "L'équipe";
								}
								if(ii86.equals("oui"))
								{
									moto = "Moto Journal";
								}
								
								String total = " "+vogue+" "+oops+" "+figaro+" "+liberation+" "+equipe+" "+moto;
								
								JLabel i8 = new JLabel(total); 
								panel.add(i8);
								result8.close();
								state8.close();
							}
							catch (SQLException e) 
							{
								
								
								JLabel i9 = new JLabel(""); 
								panel.add(i9);
							} 
						
						}
				}
			
			
			catch(ClassNotFoundException o)
			{
				System.out.println("erreur chargement du pilote"); 
			}
		}  
	}
