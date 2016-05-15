public class Restaurant {
	public static void main(String [] args) {
		
	double billCost = 12.25;
	double tax= billCost * .065;
	double tip= billCost + tax * .20;
	double totalCost= tax + tip + billCost;
	
	System.out.println("The tax is " + tax);
	System.out.println("The tip is " + tip);
	System.out.println("The total cost is " + totalCost);
	System.out.println("Each person would pay " + (totalCost/3));
	
	}
}