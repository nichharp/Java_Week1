
import java.util.ArrayList;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class PersonFiles {
	ArrayList<Person> p = new ArrayList<Person>(); // create array list for Person(s)

	// private Object path;
	// private boolean append_to_file = false;

	public static void main(String[] args) { // main

		try {

			PersonFiles x = new PersonFiles(); // constructor

			Person a = new Person("Larry", "Teacher", 22);
			Person b = new Person("Nigel", "Sweeper", 44);
			Person c = new Person("Gary", "Gamer", 29);
			Person d = new Person("Faker", "god", 19);
			Person e = new Person("James", "Teacher", 26); // add these 5 people to the class of Person

			x.p.add(a);
			x.p.add(b);
			x.p.add(c);
			x.p.add(d);
			x.p.add(e); // send these 5 people to the class of Person

			x.AddArrayToFile(x.p); //add all the elements in the array to the file WITH THE METHOD
			x.AddFileToArray(); //Take all the elements in the file and add them to a new array WITH THIS METHOD
			
			// System.out.println("Name: " + p.name + ", Age: " + p.age + ", Occupation: " +
			// p.occu);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {  				// all the error handling

		}

	}

	public void AddArrayToFile(ArrayList<Person> j) {
		try {
			FileOutputStream fos = new FileOutputStream("C:\\Users\\Administrator\\Documents\\PEOPLE.txt"); 	// assign the FileOutputStream to be in this location
			ObjectOutputStream oos = new ObjectOutputStream(fos);												// take the FileOutputStream and prepare it in the ObjectOutputStream
			oos.writeObject(j);																					// write the FileOutputStream into this file
			oos.close();																						// close the OOS
		} catch (FileNotFoundException e) { //error handling
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
			// } catch (ClassNotFoundException e) {
			// e.printStackTrace();
		}

	}

	public void AddFileToArray() {
		try {
			ArrayList<Person> q = new ArrayList<Person>(); // make the new array and transfer
			FileInputStream fis = new FileInputStream("C:\\Users\\Administrator\\Documents\\PEOPLE.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			q = (ArrayList<Person>) ois.readObject();
			ois.close();
			for (Person l : q) {
				l.toPrint();
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		// q.toString(list.toArray());
	}

}

// public void writeFile(Person z){
// path = z;
// }
//
// public void writeFile(Person z, boolean append_value){
// path = z;
// append_to_file = append_value;
// }
//
// public void writeToFile(Object y) throws IOException{
//
// FileWriter write = new FileWriter(path, append_to_file);
//
// PrintWriter print_line = new PrintWriter(write);
//
// print_line.printf("%s" + "%n", textLine);
//
// print_line.close();
//
// }
