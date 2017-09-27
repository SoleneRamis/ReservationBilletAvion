
import java.awt.*;
import java.sql.*;
import javax.swing.*;


public class EnregistrementPlat
{

	private int numClient;
	private String choix ; 
		
	public EnregistrementPlat(int numClient0,String choix0)
	{	
		numClient = numClient0;
		choix = choix0 ; 
		
		 
				
		
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
					state.executeUpdate("INSERT INTO `klotz`.`Plat` (`Numclient`, `ChoixPlat`) VALUES ('3', 'Normal');");				
					System.out.println("save sucess");
					state.close();
				}
				catch (SQLException e) 
				{
					
					Statement state2 = con.createStatement();
					state2.executeUpdate("DELETE FROM `klotz`.`Plat` WHERE `Plat`.`NumClient` = "+numClient+";");
					state2.close();
					Statement state3 = con.createStatement();
					state3.executeUpdate("INSERT INTO `klotz`.`Plat` (`Numclient`, `ChoixPlat`) VALUES ('"+numClient+"', '"+choix+"');");					
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
	
