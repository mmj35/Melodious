import java.util.Scanner;
public class Array2 {
	public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in); 
	
	
	System.out.println("How many students are in the class?");
	int students=keyboard.nextInt();	
	
	System.out.println("How many exams are in the course?");
	int exams=keyboard.nextInt();
	
	double [][] a = new double[students][exams];
	String[] studentArray = new String[students];
	for(int i=0; i<students;i++) {
		System.out.println("Enter Student #" + (i+1) + "'s name: ");
		
		studentArray[i]= keyboard.next();
		
		for(int j=0; j<exams; j++) { 
			System.out.println("Enter exam #" + (j+1) + " for Student #" + (i+1));
			double scores=keyboard.nextInt();	
			a[i][j]= scores;
		}
	}
	
	System.out.println();
	printMaxMin(a, students, exams);
	System.out.println();
	printAverage(a, students, exams, studentArray); 
	
		
	/*for(int y=0; y<students;y++)
	{
		for(int x=0; x<exams; x++)
		{
			System.out.print(a[y][x]+ " ");
		}
		
		System.out.println();
	}*/
}

public static void printAverage(double [][] scores, int students, int exams, String[] studentArray) {
		double totalAverage=0;
		double sum = 0;
		double average;
		for(int i=0;i<students; i++) {
			sum=0;
			for(int j=0;j<exams;j++) {
				sum += scores[i][j];
			}
			average = (sum/exams);
			totalAverage+= average;		
			System.out.println(studentArray[i] + ": " + average);
		}
		
		totalAverage/=3;
		System.out.println("Class average: " + totalAverage);
	}

public static void printMaxMin(double [][] scores, int students, int exams) {
	double max = 0;
	double min=101;
	
	for(int j=0;j<exams; j++) {
		for (int i=0; i<students; i++) {
		if(scores [i][j]>max)
			max= scores[i][j];
		if(scores [i][j]<min)
			min= scores[i][j];
		}
		
		System.out.println("Exam #" + (j + 1) +": Max" + max + ", Min" + min);
		max = 0;
		min = 101;
	}
}
}
		

			



