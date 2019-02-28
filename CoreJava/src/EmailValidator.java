
import java.util.Scanner;
import java.util.regex.Matcher;


public class EmailValidator {

	public static void main(String[] args) {
	/*Validation Rules
	 * There should be only 1 occurences of "@" and "."
	 * Min 4 letters before @
	 * Min 3 letters between @ and .
	 * Min 2 letters after .
	 */
		/*
	
	 String regex= "^[a-zA-Z0-9_+&*-]+(?:\\."+  "[a-zA-Z0-9_+&*-]+)*@" +  "(?:[a-zA-Z0-9-]+\\.)+[a-z" +  "A-Z]{2,7}$";
	 Boolean b = email.matches(regex);
		if(b==true)
		{
			System.out.println("Valid Email");
		}
		else
		{
			System.out.println("Invalid Email");
		}	*/
		
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the email:");
		 String email=sc.nextLine();
		
		  if(email.contains("@"))
		{
			if( (email.indexOf('@')<4) & (email.lastIndexOf(('@') & ('.'))>1) & (email.lastIndexOf('.')>email.length()) & ((email.indexOf('@')-email.indexOf('.'))<3) )
			{System.out.println("Invalid");}
		    else
		    {System.out.println("valid");}
		}	
		else 
		{System.out.println("Invalid");}
	
	
	}
}









