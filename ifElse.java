import java.util.Scanner;
public class ifElse {
	public static void main(String[] args) {
	
	Scanner keyboard= new Scanner(System.in);
	
	double commission;
	double sales;
	
	System.out.print("What are the sales?");
	sales=keyboard.nextDouble();
	System.out.println();
	
	if(!(sales>=50000.0)) {
		System.out.println(commission=0.10);
	}else 
		System.out.println(commission=0.2);
	}
}