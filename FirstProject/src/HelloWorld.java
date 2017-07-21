
public class HelloWorld {
	public static int[] arrayOfInts = {0,1,2,3,4,5,6,7,8,9};
	
	public static void main(String[] args) {
		String task2 = "Hello World";
		System.out.println(task2);
		
		System.out.println(taskReturn());
		
		System.out.println(taskParameter(1,2, true));
		
		taskIteration(1,5,false);
		
		taskArray(1,5,false);
		
		taskIterationArray1();
		
		taskIterationArray2();
	}
	
	
	public static String taskReturn() {
		String m1 = "Hello";
		String m2 = "World";
		String m3 = "!";
		return m1+ " " + m2+ m3;
	}

	public static int taskParameter(int a, int b, boolean c) {
//		a = 5; no need to do "int a = 5" since a and b are already defined as ints in the line above
		if(a == 0) {
			return b;
		} else if(b == 0){
			return a;
		} else if(c == true) {
			return a+b; 
		} else {
			return a*b;
		}
	}

	public static void taskIteration(int a,int b, boolean c) {
		for(int i = 0; i < 10; i++) {
			System.out.println(taskParameter(i, b, c));
		}
	}
	
	public static void taskArray(int a,int b, boolean c) {
		for(int i = 0; i < arrayOfInts.length; i++) {
			int d = arrayOfInts[i];
			System.out.println(taskParameter(d, b, c));
		}
	}
	public static void taskIterationArray1() {
		for(int i = 0; i< arrayOfInts.length; i++) {
			System.out.println(arrayOfInts[i]);
		}
	}

	public static void taskIterationArray2() {
		int[] arrayDos = new int[10]; // made an array of size 10
		for(int i = 0; i<10; i++) { // loop 10 times
			arrayDos[i] = i; //each array value becomes the value of i at the time 0,1,2,3,4
			System.out.println(arrayDos[i]);
		}
		for(int j = 0; j<arrayDos.length; j++) {
			arrayDos[j] = arrayDos[j]*10;
			System.out.println(arrayDos[j]);
		}
	}
}

	

