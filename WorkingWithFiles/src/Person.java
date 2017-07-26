
import java.io.Serializable;


public class Person implements Serializable {
//	private static final long serialVersionUID = 1L; // dunno what this is for. ASK!

	
	String name;
	String occu;
	int age;
	public Person(String name1, String occu1, int age1) {
		name = name1;
		occu = occu1;
		age = age1;
	}

	public void toPrint() {
		System.out.println(name + " " +occu + " " +age);
	}


}
