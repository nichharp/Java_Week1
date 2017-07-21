////	String colour, int numOfWheels, boolean isDamaged, String carMake, int numOfSeats
//
//public class RunnerClass {
//
//static Garage[] g = new Garage[10];
//int ID = 0;
//
//	public static void main(String[] args) {
//		Car a = new Car("Black", 4, false, "Vauxhall", 5); //add a Black Vauxhall to the car Class
//		System.out.println(a.carMake);
//		System.out.println(a.colour);
//		Motorcycle b = new Motorcycle("Yellow", 2 ,false, "Kawasaki" , 1);
//		System.out.println(b.colour);
//		System.out.println(b.numOfWheels);
////		a.fix();
//		
//	}
//
//	public void addToGarage(int Ident) { // take this vehicle using ID and add it to the Garage[] array
//		Garage[Ident] = new Garage(this) ; 
//	}
//	
//	public void remove(int Ident) { // find this ID of this vehicle in Garage[] and remove the vehicle
//		for (i=0; i<ID; i++) {
//			if (Garage[i] = this.ID) {
//				Garage[i] = null
//			}
//		}
//	}
//	
//	public void empty() { //empty every item in the Garage Array
//		Garage[] = null;
//	}
//	
//	public double fix() {
//		double cash = 0.0;
//		if ( this.carMake = "Vauxhall") {
//			cash = cash + 75;
//		} else if (this.numOfWheels > 2) {
//			cash = cash + 25.50*this.numOfWheels;
//		} else if (this.isDamaged = true) {
//			cash = cash + 200;
//		} else if (numOfSeats > 2) {
//			cash = cash + 50*this.numOfSeats;
//		} else if (this.colour = "White") {
//			cash = cash + 100000;
//		} else if (cash > 500) {
//			System.out.println("WE'RE NOT SORRY :)");
//		}
//		return cash;
//		
//	}
//
//	
//
//}
