public class Bill {
  public static void main (String[]args) {
  float total = 40f;
  float tax = .065f;
  float newtotal= total* tax;
  float newtotal1= newtotal + total; 
  float tipamount= newtotal1 * .2f;
  float newtotal2= newtotal1 + tipamount; 
  System.out.println(newtotal2);
  System.out.println("Everyone should pay" +newtotal2/3);
  
  }
}
  
  
	