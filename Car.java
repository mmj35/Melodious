public class Car {
	private int year
	private String make;
	private int speed;
		
	public Car(int year, String make, int speed) {
		this.year=year;
		this.make=make;
		this.speed=speed;
		
	}
	
	public int getYear() {
		return year;
	}
	public String getMake() {
		return make;
	}
	public int getSpeed() {
		return speed;
	}
	public void accelerate() {
		speed+=5;
	}
	public void brake() {
		speed-+=5;
	}