import java.awt.*;

public class Starter {
	public static void main(String[] args) {
		
		int magazines =120300 ;
		int buf ; 
		if((magazines-(magazines%100000))/100000 > 0)
		{
			buf = (magazines-(magazines%100000))/100000 ;
			System.out.println(buf);
			magazines = magazines - 100000 ; 
		}
		if((magazines-(magazines%10000))/10000 > 0)
		{
			buf = (magazines-(magazines%10000))/1000 ;
			System.out.println(buf);
			magazines = magazines - 10000 ; 
		}
		if((magazines-(magazines%1000))/1000 > 0)
		{
			buf = (magazines-(magazines%1000))/1000 ;
			System.out.println(buf);
			magazines = magazines - 1000 ; 
		}
		if((magazines-(magazines%100))/100 > 0)
		{
			buf = (magazines-(magazines%100))/100 ;
			System.out.println(buf);
			magazines = magazines - 100 ; 
		}
		if((magazines-(magazines%10))/10 > 0)
		{
			buf = (magazines-(magazines%10))/10 ;
			System.out.println(buf);
			magazines = magazines - 10 ; 
		}
		if((magazines-(magazines%1))/1 > 0)
		{
			buf =( magazines-(magazines%1))/1;
			System.out.println(buf);
			magazines = magazines - 1 ; 
		}



	}
}