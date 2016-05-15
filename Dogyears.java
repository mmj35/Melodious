import java.util.Scanner;
public class DogYears{
  public static void main(String args[]) {
  
  Scanner keyboard = new Scanner(System.in);
  
  int ageHuman;
  int ageDog;
  

  System.out.print("How old is the dog?: ");
  ageHuman= keyboard.nextInt();
  System.out.println();
  ageDog= ageHuman * 7;
  System.out.println("Your dog is" + ageDog + "years old."); 
  
  }
}