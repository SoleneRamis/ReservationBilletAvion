import java.awt.*;
import java.sql.*;
import javax.swing.*;


public class EnregistrementTablette
{

	private int numClient;
	private String choix ; 
	private String sup ; 
		
	public EnregistrementTablette(int numClient0,String choix0,String sup0)
	{	
		numClient = numClient0;
		choix = choix0 ; 
		sup = sup0 ; 
		
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
					state.executeUpdate("INSERT INTO `klotz`.`Tablette` (`Numclient`, `ChoixTablette`,`Sup`) VALUES ('"+numClient+"', '"+choix+"','"+sup+"');");				
					System.out.println("save sucess");
					state.close();
				}
				catch (SQLException e) 
				{
					
					Statement state2 = con.createStatement();
					state2.executeUpdate("DELETE FROM `klotz`.`Tablette` WHERE `Tablette`.`NumClient` = "+numClient+";");
					state2.close();
					Statement state3 = con.createStatement();
					state3.executeUpdate("INSERT INTO `klotz`.`Tablette` (`Numclient`, `ChoixTablette`,`Sup`) VALUES ('"+numClient+"', '"+choix+"','"+sup+"');");					
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
	
