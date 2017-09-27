import java.awt.*;
import java.sql.*;
import javax.swing.*;



public class EnregistrementSiege 
{
	private int numVol ; 
	private int numClient;
	private int numPlace ; 
	private int nombrePlace ;
	private String choixPlace ;
	private int nomClasse ; 
	
		
	public EnregistrementSiege(int numClient0,int numVol0,int numPlace0,int nombrePlace0,int nomClasse0)
	{	
		numClient = numClient0;
		nomClasse=nomClasse0;
		numVol = numVol0;
		numPlace = numPlace0;
		nombrePlace=nombrePlace0;
		int numPlace2 = numPlace;
		numPlace++; 
		if(nombrePlace==30)
		{
			if(numPlace<=10 && numPlace >= 1)
			{
				choixPlace = "A"+numPlace; 
			}
			if(numPlace<=20 && numPlace >= 11)
			{
				choixPlace = "E"+numPlace; 
			}
			if(numPlace<=30 && numPlace >= 21)
			{
				choixPlace = "C"+numPlace; 
			}
			
		}
		if(nombrePlace==100)
		{
			if(numPlace<=20 && numPlace >= 1)
			{
				choixPlace = "A"+numPlace; 
			}
			if(numPlace<=40 && numPlace >= 21)
			{
				choixPlace = "B"+numPlace; 
			}
			if(numPlace<=60 && numPlace >= 41)
			{
				choixPlace = "C"+numPlace; 
			}
			if(numPlace<=80 && numPlace >= 61)
			{
				choixPlace = "D"+numPlace; 
			}
			if(numPlace<=100 && numPlace >= 81)
			{
				choixPlace = "E"+numPlace; 
			}
			
		}
		
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
					state.executeUpdate("INSERT INTO `klotz`.`Place` (`NumClient`, `NumVol`, `NumPlace`, `NomPlace`, `NomClasse`) VALUES ('"+numClient+"', '"+numVol+"', '"+numPlace2+"', '"+choixPlace+"', '"+nomClasse+"');");				
					System.out.println("save sucess");
					state.close();
				}
				catch (SQLException e) 
				{
					
					Statement state2 = con.createStatement();
					state2.executeUpdate("DELETE FROM `klotz`.`Place` WHERE `Place`.`NumClient` = "+numClient+";");
					state2.close();
					Statement state3 = con.createStatement();

					state3.executeUpdate("INSERT INTO `klotz`.`Place` (`NumClient`, `NumVol`, `NumPlace`, `NomPlace`, `NomClasse`) VALUES ('"+numClient+"', '"+numVol+"', '"+numPlace2+"', '"+choixPlace+"', '"+nomClasse+"');");					
					state3.close();
					System.out.println("save sucess");
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
	
