import java.util.Scanner;
public class Miles {
  public static void main (String args[]) {
  
   Scanner keyboard= new Scanner(System.in);
  
  int miles;
  int gallons;
  int milesPerGallon;
  
  System.out.print("Please enter the number of miles driven ");
  miles=keyboard.nextInt();
  System.out.println();
    
  System.out.print("Please enter the gallons of gas used ");
  gallons=keyboard.nextInt();
  System.out.println();
  
  milesPerGallon = miles/gallons;
  
  System.out.println(milesPerGallon);
  
  }
}
  
  
  
  
  
  
  
  