import java.util.Collections; 
import java.util.ArrayList;
import java.util.Scanner;


public class Collection 
{
	public static void main(String[] args) 
	{
		ArrayList<String> movieList = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		String o;
		do 
		{ 	
			System.out.println("Enter your movie : ");
			String x = sc.nextLine();
			movieList.add(x);
			System.out.println("Enter more movies \"y\" or \"n\"");
			o =sc.nextLine();
			
				
		}while(o.equalsIgnoreCase("y"));
		
		Collections.sort(movieList); 
		
		for (String myValue : movieList) {
		    System.out.println(myValue);
		}
	
	}
	

}
