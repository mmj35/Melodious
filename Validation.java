import java.util.Scanner;
public class Validation {
	public static void main(String [] args) {
		Scanner keyboard=new Scanner(System.in);
		
		System.out.println("Enter Y,y,N,or n.");
		String character=keyboard.nextLine();

		
		while(!character.equalsIgnoreCase("Y") && !character.equalsIgnoreCase("N")) {
			System.out.println("Invalid input. Enter a different letter.");
			character=keyboard.nextLine();
		}
	}
}
		
			
