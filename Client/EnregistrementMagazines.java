import java.awt.*;
import java.sql.*;
import javax.swing.*;


public class EnregistrementMagazines
{

	private int numClient;
	private int [] a ; 
	private String vogue ; 
	private String oops; 
	private String figaro ; 
	private String liberation; 
	private String equipe; 
	private String moto; 
	
		
	public EnregistrementMagazines(int numClient0,int[] magazines0)
	{	
		numClient = numClient0;
		a = magazines0;
		String vogue ="non" ; 
		String oops ="non"; 
		String figaro ="non"; 
		String liberation="non"; 
		String equipe="non"; 
		String moto="non"; 
		
		if(a[0] == 1)
		{
			vogue = "oui";
		}
		if(a[1] == 1)
		{
			oops = "oui";
		}
		if(a[2] == 1)
		{
			figaro = "oui";
		}
		if(a[3] == 1)
		{
			liberation = "oui";
		}
		if(a[4] == 1)
		{
			equipe = "oui";
		}
		if(a[5] == 1)
		{
			moto = "oui";
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
					state.executeUpdate("INSERT INTO `klotz`.`Magazines` (`NumClient`, `Vogue`, `Oops`, `Figaro`, `Liberation`, `Lequipe`, `MotoJournal`) VALUES ('"+numClient+"', '"+vogue+"', '"+oops+"', '"+figaro+"', '"+liberation+"', '"+equipe+"', '"+moto+"');");				
					System.out.println("save sucess");
					state.close();
				}
				catch (SQLException e) 
				{
					
					Statement state2 = con.createStatement();
					state2.executeUpdate("DELETE FROM `klotz`.`Magazines` WHERE `Magazines`.`NumClient` = "+numClient+";");
					state2.close();
					Statement state3 = con.createStatement();
					state3.executeUpdate("INSERT INTO `klotz`.`Magazines` (`NumClient`, `Vogue`, `Oops`, `Figaro`, `Liberation`, `Lequipe`, `MotoJournal`) VALUES ('"+numClient+"', '"+vogue+"', '"+oops+"', '"+figaro+"', '"+liberation+"', '"+equipe+"', '"+moto+"');");					
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
	
