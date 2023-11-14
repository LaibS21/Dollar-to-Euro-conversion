
import java.util.*;


public class DollarEuro 
{
	public static void main(String[] args) 
	{
		
		// Scanner einbinden
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter the dollar number: ");
		
		// number eingeben
		double dollar = sc.nextDouble();
		
		double euro = dollar * 0.86;
		System.out.println(dollar+" Dollars are converted "+euro+" Euro!");
		sc.close();
	}

}

