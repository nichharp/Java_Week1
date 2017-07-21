
public class Person {

	static int k = 0; // this keeps track of how many people are in the array
	String name;
	int age;
	String jobTitle;

	static Person[] p = new Person[10]; // make an array with 10 spaces

	public static void main(String[] args) {
		Person man1 = new Person("Nick Harper", 21, "Trainee Consultant"); // assign
																			// man1
																			// to
																			// be
																			// this
																			// person
																			// and
																			// his
																			// deatils
		Person man2 = new Person("Craig Williams", 20, "Rugby Player");
		p[k] = man1;
		k++; // add man1 person to Person Array in kth place (should be 0 if
				// first person). when you have added man1 i add to k to keep
				// track
		p[k] = man2;
		k++;
		// man1.taskPeople();
		printAllPeople();
	}

	public Person(String newName, int newAge, String newJobTitle) { // Constructor
																	// to create
																	// a new
																	// person
		name = newName;
		age = newAge;
		jobTitle = newJobTitle;
	}

	// public void addPerson (String newname, int newage, String newjobTitle) {
	// Person man.k = new Person("Craig Williams",20,"Rugby Player");
	// [k] = (man.k) ; k++ ;
	// }

	public void taskPeople() {
		System.out.println("The subject's name is " + name + " and his/her age is " + age + " and the job he/she is a "
				+ jobTitle);
	}

	public static void printAllPeople() {
		for (int i = 0; i < k; i++) { // instead of p.length i could just use k
			p[i].taskPeople();
		}

	}

}
