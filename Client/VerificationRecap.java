import java.awt.*;
import java.sql.*;
import javax.swing.*;


	public class  VerificationRecap
	{
		private int numClient ;
		JFrame fenetre ;  
		private int i ; 

		public VerificationRecap(int i0 , int numClient0,JFrame fenetre0)	
		{
			i = i0 ; 
			numClient = numClient0;
			fenetre = fenetre0;
			
		
			Connection con=null;
			Connection conn=null;
			
			try
			{
				Class.forName("org.mariadb.jdbc.Driver");
				
					
						if(i==1)
						{
							try
							{
								conn = DriverManager.getConnection("jdbc:mariadb://dwarves.iut-fbleau.fr/projetihm","projetihm","mhitejorp");		
								//Création d'un objet Statement
								Statement state = conn.createStatement();

								ResultSet result = state.executeQuery("SELECT * FROM Reservation WHERE idClient ='"+numClient+"';");
								
								result.first();
								
								int numVol = result.getInt(3);
								int idClasse = result.getInt(4);
								result.close();
								state.close();
								if(idClasse==1)
								{
									fenetre.dispose();
									(new Superieur(numVol, numClient, 2)).setVisible(true);
								}
								if(idClasse==2)
								{
									fenetre.dispose();
									(new Economique(numVol, numClient,2)).setVisible(true);
								}
								
							}
							catch (SQLException e) 
							{
								fenetre.dispose();
								(new Recapitulatif(numClient)).setVisible(true);
							} 
						}
						else if(i==2)
						{
							fenetre.dispose();
							(new Plat(numClient, 2)).setVisible(true);

						}
						if(i==3)
						{
							try
							{
								conn = DriverManager.getConnection("jdbc:mariadb://dwarves.iut-fbleau.fr/projetihm","projetihm","mhitejorp");		
								//Création d'un objet Statement
								Statement state2 = conn.createStatement();

								ResultSet result2 = state2.executeQuery("SELECT * FROM Reservation WHERE idClient ='"+numClient+"';");		
								result2.first();

								int idClasse2 = result2.getInt(4);
								result2.close();
								state2.close();
								if(idClasse2==1)
								{
									fenetre.dispose();
									(new Tablette(numClient, 2)).setVisible(true);
								}
								if(idClasse2==2)
								{
									fenetre.dispose();
									(new TabletteEconomique(numClient,2)).setVisible(true);
								}
							}
							catch (SQLException e) 
							{
								fenetre.dispose();
								(new Recapitulatif(numClient)).setVisible(true);
								
							} 
						}
						if(i==4)
						{
							try
							{
							conn = DriverManager.getConnection("jdbc:mariadb://dwarves.iut-fbleau.fr/projetihm","projetihm","mhitejorp");		
							//Création d'un objet Statement
							Statement state3 = conn.createStatement();

							ResultSet result3 = state3.executeQuery("SELECT * FROM Reservation WHERE idClient ='"+numClient+"';");		
							result3.first();

							int idClasse3 = result3.getInt(4);
							result3.close();
							state3.close();
							if(idClasse3==1)
							{
								fenetre.dispose();
								(new Magazines(numClient)).setVisible(true);
							}
							if(idClasse3==2)
							{
								fenetre.dispose();
								(new RecapitulatifEconomique(numClient)).setVisible(true);
							}
							
							}
							catch (SQLException e) 
							{
								fenetre.dispose();
								(new Recapitulatif(numClient)).setVisible(true);
							} 
						}
						
						
					
			}
			
			
			catch(ClassNotFoundException o)
			{
				System.out.println("erreur chargement du pilote"); 
			}
		}  
	}
