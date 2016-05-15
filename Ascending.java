import java.util.Scanner;
public class Ascending {
  public static void main (String args[]) {
  Scanner keyboard= new Scanner(System.in);  
     
  String firstName;
  String secondName;
  String thirdName;
  String largest;
  String middle = null;
  String smallest;   
  System.out.print("Please enter first name");
  firstName=keyboard.nextLine();
  System.out.println();
  
  System.out.print("Please enter second name");
  secondName=keyboard.nextLine();
  System.out.println();
  
  System.out.print("Please enter third name");
  thirdName=keyboard.nextLine();
  System.out.println();
  
  largest = firstName;
  
  if (largest.compareTo(secondName) < 0){
    largest = secondName;
  }
 	 

  if (largest.compareTo(secondName) < 0){
	largest = thirdName;
  
  }

  smallest = firstName;  
  
  if (smallest.compareTo(secondName) > 0){
  	smallest = secondName;
  }
  
  if (smallest.compareTo(secondName) > 0){
	smallest = thirdName;
  }
  if (!(firstName.equals(largest)|| firstName.equals(smallest))){
  	middle = firstName;
  }
  
  System.out.println(largest+middle+smallest);
  }
}

  

 	   	
  
  