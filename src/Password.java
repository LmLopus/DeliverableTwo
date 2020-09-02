import java.util.Scanner;

public class Password {

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);

		System.out.println("Please enter a password. Your password must contain:");
		System.out.println("One lowercase letter;");
		System.out.println("One uppercase letter;");
		System.out.println("At least 7 characters;");
		System.out.println("At most 12 characters;");
		System.out.println("One eclamation point. (!)");
		System.out.print("Password: ");

		String password = scnr.nextLine();
		scnr.close();

		String s = password; // you can have any String here

		
		  if(!s.matches(".*[A-Z].*")) { 
			 System.out.println("There are no capital letters. Please try again.");  
		  	}
		  else if (!s.matches((".*[a-z].*"))) {  
			 System.out.println("There are no lowercase letters. Please try again.");}
		 
		  else if (!password.contains("!")) {
				System.out.println("There is no exclamation point (!)");
			} 
		  else if (password.length()< 7)
			System.out.println("There are less than 7 characters. Please try again.");
		  
		  else if (password.length()> 12)
			System.out.println("There are more than 12. Please try again.");
		  
		else {
			System.out.println("Thank You!");
			
			
		}

	}

}