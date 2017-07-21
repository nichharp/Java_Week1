public class Motorcycle extends Vehicle {

		String make;
		boolean isCool;
		
		public Motorcycle(String colour, int numOfWheels, boolean isDamaged, String make, boolean isCool) {
			super(colour, numOfWheels, isDamaged, make);
			this.isCool = isCool;
		}

		public void goesVroomVroom() {
			System.out.println(false);
		}
		
		public void milePerLitre() {
			System.out.println(25);
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
