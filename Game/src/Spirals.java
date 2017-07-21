import java.util.Scanner;

public class Spirals {
		
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements : ");
        int size = sc.nextInt();
       
        int A[][] = new int [size][size];
        int count = 1;
        int col1 = 0, col2 = size-1, row1 = 0, row2 = size-1;
        
        while (count<=size*size) {
        	for (int x=col1; x<=col2; x++) {
        		A[x][row1] = count;
        		count = count + 1;
        	}
        	for (int y=row1+1; y<=row2; y++) {
        		A[col2][y] = count;
        		count = count + 1;
        	}
        	for (int x=col2-1; x>=col1; x--) {
        		A[x][row2] = count;
        		count = count + 1;
        	}
        	for (int y=row2-1; y>=row1+1; y--) {
        		A[col1][y] = count;
        		count = count + 1;
        	}
        	col1++;
        	row1++;
        	col2--;
        	row2--;
        }
        
        for(int i=0; i<size; i++) {
        	String s = " ";
        	for (int j=0; j<size; j++) {
        		if (A[i][j]<10) {
        			s = s + " " + A[i][j] + " ";
        		} else {
        			s = s + A[i][j] + " ";
        		}
        	}
        	System.out.println(s);
        }
	}

}
