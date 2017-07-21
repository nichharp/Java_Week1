public class Car extends Vehicle {

		String make;
		int numOfSeats;
		
		public Car(String colour, int numOfWheels, boolean isDamaged, String carMake, int numOfSeats) {
			super(colour, numOfWheels, isDamaged, carMake);
			this.numOfSeats = numOfSeats;
			this.numOfWheels = numOfWheels;
		}

		public void goesVroomVroom() {
			System.out.println(true);
		}
		
		public void milePerLitre() {
			System.out.println(15);
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
