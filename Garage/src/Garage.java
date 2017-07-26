//CAR:	String colour, int numOfWheels, boolean isDamaged, String carMake, int numOfSeats
//MOTO:  String colour, int numOfWheels, boolean isDamaged, String cycleMake, boolean isCool
import java.util.ArrayList;


public class Garage {
	
static ArrayList<Vehicle> g = new ArrayList<Vehicle>();	
	
//static Garage[] g = new Garage[10];
int ID = 0;

	public static void main(String[] args) {
		Car a = new Car("Black", 4, false, "Vauxhall", 5); 						addToGarage(a);//add a Black Vauxhall to the car Class
		Car b = new Car("White", 4, true, "Vauxwagon", 5); 						addToGarage(b);
		Car c = new Car("Yellow", 4, false, "Ferrari", 2);						addToGarage(c);
		Car d = new Car("Silver", 4, true, "BMW", 4);							addToGarage(d);
		Motorcycle z = new Motorcycle("Yellow", 1 ,false, "Kawasaki" , true );	addToGarage(z);
		Motorcycle y = new Motorcycle("Red", 1 ,true, "Ferrari" , true );		addToGarage(y);
		Motorcycle x = new Motorcycle("Green", 1 ,false, "Kawasaki" , true );	addToGarage(x);
		Motorcycle w = new Motorcycle("Gold", 1 ,true, "Fancy" , true );		addToGarage(w);
		Truck t1 = new Truck("Yellow", 2 ,true, "Harry" , true );	addToGarage(t1);
		Truck t2 = new Truck("Red", 2 ,true, "Bill" , true );		addToGarage(t2);
		Truck t3 = new Truck("Green", 2 ,true, "James" , true );	addToGarage(t3);
		Truck t4 = new Truck("Gold", 2 ,true, "Bob" , true );		addToGarage(t4);
		remove(2);

		
					
//		for (int i = 0; i < g.size(); i++) {  //show me what's in the garage
//			System.out.println(g.get(i));
//		}
	}

	public static void addToGarage(Vehicle t) { // take this vehicle using ID and add it to the Garage[] array
		g.add(t) ; 
		int i = g.size();
		System.out.println("Your vehicle's ID is " + i);
	}
	
	public static void remove(int i) { // find this ID of this vehicle in Garage[] and remove the vehicle
			g.remove(i);
	}
	
	
//	public void empty() { //empty every item in the Garage Array
//		ArrayList<Vehicle> g = new ArrayList<Vehicle>();	
//	}
	
	

	

}
