import java.util.Scanner;
public class Base {
  public static void main (String args[]) {
  Scanner keyboard = new Scanner(System.in);
  
     
     
  System.out.print("How many checks did you write this month");
  int checks=keyboard.nextInt();
  System.out.println();
  
  if(checks<20){
  	double firstGroup = checks * .10 + .10;
  	System.out.println("Your service fee is" + firstGroup);
  }else if (checks>=20 && checks<40){
  	double secondGroup = checks * .08 + 10;
  	System.out.println("Your service fee is" + secondGroup);
  	
  }else if (checks>=40 && checks<60){
  	double thirdGroup =  checks * .06 + 10;
  	System.out.println("Your service fee" + thirdGroup);
  
  }else if (checks>=60) {
  	double fourthGroup = checks * .04 +10;
  	System.out.println("Your service fee is" + fourthGroup);
  	}
  	
  }
}
  