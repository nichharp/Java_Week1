public class Truck extends Vehicle {

	String make;
	boolean isLoud;

	public Truck(String colour, int numOfWheels, boolean isDamaged, String make, boolean isLoud) {
		super(colour, numOfWheels, isDamaged, make);
		this.isLoud = isLoud;
	}

	public void goesVroomVroom() {
		System.out.println(false);
	}

	public void milePerLitre() {
		System.out.println(5);
	}

	public double fix() {
		double cash = 0.0;
		if (make == "Vauxhall") {
			cash = cash + 75;
		} if (numOfWheels > 2) {
			cash = cash + 25.50*numOfWheels;
		} if (isDamaged = true) {
			cash = cash + 200;
		} if (colour == "White") {
			cash = cash + 100000;
		} if (cash > 75) {
			System.out.println("WE'RE NOT SORRY :')");
		}
		return cash;
		
	}
}