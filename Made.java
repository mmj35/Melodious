import java.util.Scanner;

public class Made
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Please enter the midterm grade: ");
		double midtermGrade = keyboard.nextDouble();
		
		System.out.print("Please enter the final grade: ");
		double finalGrade = keyboard.nextDouble();
		
		double average = (midtermGrade + finalGrade) / 2;
	
		char letterGrade;
		if (average < 60.0)
		{
			letterGrade = 'F';
		}
		else if (average < 70.0)
		{	
			letterGrade = 'D';
		}
		else if (average < 80.0)
		{
			letterGrade = 'C';
		}
		else if (average < 90.0)
		{
			letterGrade = 'B';
		}
		else
		{
			letterGrade = 'A';
		}
		
		System.out.println("Your letter grade is: " + letterGrade);
	}
}
