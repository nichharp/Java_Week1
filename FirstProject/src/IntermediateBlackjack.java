
public class IntermediateBlackjack {

	public static void main(String[] args) {
		System.out.println(taskBlackjack(22,22));
		System.out.println(taskUniqueSum(1,1,2));
		System.out.println(taskTooHot(120, false));
	}

	
	public static int taskBlackjack(int a, int b) {
		if(a>b){
			if(a<22) {
				return a;
			} else {
				return 0;
			}
		} else {
			if(b<22) {
				return b;
			} else {
				return 0;
			}
		}
	}
	
	public static int taskUniqueSum(int a, int b, int c) {
		if(a==b & b==c) {
			return 0;
		} else if (a==b) {
			return c;
		} else if (b==c) {
			return a;
		} else {
			return a+b+c;
		} 
	}

	public static boolean taskTooHot(int temp, Boolean isSummer) {
		if (temp > 59 & temp < 91 & isSummer == false) {
			return true;
		} else if (temp > 59 & temp < 101 & isSummer == true) {
			return true;
		} else {
			return false;
		}
	}






}
