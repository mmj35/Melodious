import java.util.Scanner;
public class Average {
  public static void main (String args[]) {
  
  int scoreMidterm;
  int scoreFinal;
  int averageScore1;

  System.out.print("Please enter score for Midterm ");
  scoreMidterm=Keyboard.nextLine();
  System.out.println();
  
  System.out.print("Please enter score for Final ");
  scoreFinal=Keyboard.nextLine();
  System.out.println();
 
  char lettergrade;
  
  averageScore1 = (scoreMidterm + scoreFinal)/2;
   
  if (grade >= 90)
  lettergrade= 'A';
  	
  } else if{
  
  if (grade >= 80)
  lettergrade= 'B';
  
  
  } else if(grade >= 70){
  lettergrade= 	"C"
  
  } else if(grade >= 60){
  lettergrade= "D"
  
  } else if(grade <60){
  lettergrade= "F" }
  
  System.out.println(averageScore1); 
  System.out.println(lettergrade);
  
  
