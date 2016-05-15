//Melody Jolly 
import java.util.Scanner;
public class Football {
  public static void main (String args[]) {	
  
  Scanner keyboard = new Scanner(System.in);
  
  String firstName;
  String secondName;
  int numbtouchdowns1;
  int numbtouchdowns2;
  int fieldgoals1;
  int fieldgoals2;
  int Score1;
  int Score2;
  
  System.out.print("Please enter the first team name: ");
  firstName=keyboard.nextLine();
  System.out.println();
  
  System.out.print("Please enter the second team name: ");
  secondName=keyboard.nextLine();
  System.out.println();

  System.out.print("How many touchdowns did the first team make?: ");
  numbtouchdowns1=keyboard.nextInt();
  System.out.println();
  
  System.out.print("How many touchdowns did the second team make?: ");
  numbtouchdowns2=keyboard.nextInt();
  System.out.println();
  
  System.out.print("How many fieldgoals did the first team make?: ");
  fieldgoals1=keyboard.nextInt();
  System.out.println();
   
  System.out.print("How many fieldgoals did the second team make?: ");
  fieldgoals2=keyboard.nextInt();
  System.out.println();
  
  Score1= numbtouchdowns1 * 7 + fieldgoals1 * 3;
  Score2= numbtouchdowns1 * 7 + fieldgoals2 * 3;
  
  
  if (Score1 > Score2) {
  	System.out.println("then " + firstName + " is the winner.");
  } else{
  	System.out.println("then " + secondName + " is the winner.");
  }
}
}
  		
  
  