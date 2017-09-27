import java.awt.*;
import java.sql.*;
import javax.swing.*;


public class ValidationCommentaire
{

	private int numClient;
	 
	private String com ; 
	private JFrame fenetre ; 
		
	public ValidationCommentaire(String com0,int numClient0,JFrame fenetre0)
	{	
		numClient = numClient0;
		fenetre=fenetre0; 
		com=com0; 
		
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
					state.executeUpdate("INSERT INTO `klotz`.`Commentaire` (`NumClient`, `Commentaire`) VALUES ('"+numClient+"', '"+com+"');");				
					System.out.println("save sucess");
					state.close();
					fenetre.dispose();
				}
				catch (SQLException e) 
				{
					
					Statement state2 = con.createStatement();
					state2.executeUpdate("DELETE FROM `klotz`.`Commentaire` WHERE `Commentaire`.`NumClient` = "+numClient+";");
					state2.close();
					Statement state3 = con.createStatement();
					state3.executeUpdate("INSERT INTO `klotz`.`Commentaire` (`NumClient`, `Commentaire`) VALUES ('"+numClient+"', '"+com+"');");					
					state3.close();
					System.out.println("save sucess");
					fenetre.dispose();
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
	
