import java.util.Scanner;
public class Speed {
	public static void main(String[] args) {
	
	Scanner keyboard= new Scanner(System.in);
	
	int speed,time, hour;
	double distance;
	
	
	System.out.println("Enter a speed of a vehicle in miles per hour");
	speed= keyboard.nextInt();
	
	System.out.println("Enter the number of hours it has traveled.");
	hour=keyboard.nextInt();
	
	int i;
	for(i=1; i<=hour; i+=1) {
	System.out.println(speed * i);
	}
	}
}

	
		
		
		
	