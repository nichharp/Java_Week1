
import java.util.ArrayList;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class PersonFiles {
	ArrayList<Person> p = new ArrayList<Person>();

	private Object path;
	private boolean append_to_file = false;

	public static void main(String[] args){
	
		try{
			PersonFiles x = new PersonFiles();
			
			
			Person a = new Person("Larry", "Teacher" , 22);
			Person b = new Person("Nigel", "Sweeper", 44);
			Person c = new Person("Gary", "Gamer",29);
			Person d = new Person("Faker", "god" , 19);
			Person e = new Person("James", "Teacher", 26);
			
			x.p.add(a); 
			x.p.add(b);
			x.p.add(c);
			x.p.add(d);
			x.p.add(e);
			
//			System.out.println("Name: " + p.name + ", Age: " + p.age + ", Occupation: " + p.occu);
		}	catch (FileNotFoundException e) {
		e.printStackTrace();
		} 	catch (IOException e) {
		e.printStackTrace();
		} 	catch (ClassNotFoundException e) {
		e.printStackTrace();
		} 	finally {
			AddArrayToFile(x.p);
			AddFileToArray();
		}
		
		
	}
	
	public void AddArrayToFile(ArrayList<Person> j) {
//		for(int i = 0; i< p.size(); i++) {	
			
			FileOutputStream fos = new FileOutputStream("C:\\Users\\Administrator\\Desktop\\Eclipse\\Tests\\PEOPLE.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(j);
			oos.close();
//		}
		
		}
			
	public void AddFileToArray() {
		ArrayList<Person> q = new ArrayList<Person>(); //make the new array and transgfer
		FileInputStream fis = new FileInputStream("C:\\Users\\Administrator\\Desktop\\Eclipse\\Tests\\PEOPLE.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		q  = (ArrayList<Person>) ois.readObject();
		ois.close();
		for (Person l : q) {
			l.toPrint();
		}
	
//		q.toString(list.toArray());
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

}
