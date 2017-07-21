public abstract class Vehicle {

	String colour;
	int numOfWheels;
	boolean isDamaged;
	String make;

	public Vehicle(String colour, int numOfWheels, boolean isDamaged, String make) {
		this.colour = colour;
		this.numOfWheels = numOfWheels;
		this.isDamaged = isDamaged;
		this.make = make;
	}

	public abstract void goesVroomVroom();

	public abstract void milePerLitre();

	public abstract double fix();
	
	public String toString() {
//		for (int i = 0; i<g.size; i++) {
		if (this.isDamaged == true) {
			return "The Vehicle is a " + this.colour + " " + this.make + " with " + this.numOfWheels +" wheels and is damaged";
		} else {
			return "The Vehicle is a " + this.colour + " " + this.make + " with " + this.numOfWheels +" wheels and is not damaged";
		}
//	}
		
	

	}
}
