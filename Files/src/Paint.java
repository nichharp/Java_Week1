import java.util.Scanner;

public class Paint {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Floor Area : ");
        int size = sc.nextInt();		
        Paint p = new Paint();
        p.calculate(size);	
	}

	public void calculate(double floorArea) {
		
		double tinsOfCheapo = Math.ceil(floorArea/(10*20)); double moneyForCheapo = tinsOfCheapo*19.99;	double wasteCheapo = (tinsOfCheapo*20*10-floorArea)/10; //work out the number of litres wasted of Cheapo
		double tinsOfAverage = Math.ceil(floorArea/(11*15)); double moneyForAverage = tinsOfAverage*17.99;	double wasteAverage = (tinsOfAverage*15*11-floorArea)/11;		
		double tinsOfDulux = Math.ceil(floorArea/(20*10)); double moneyForDulux = tinsOfDulux*25.00;	double wasteDulux = (tinsOfDulux*10*20-floorArea)/20; 		

		if (wasteCheapo < wasteAverage & wasteCheapo < wasteDulux) {
			System.out.println("CheapoMax wastes the least with " + tinsOfCheapo + " Tins. It wastes " + wasteCheapo + " litres");
		} else if (wasteAverage < wasteCheapo & wasteAverage < wasteDulux) {
			System.out.println("AverageJoes wastes the least with " + tinsOfAverage + " Tins. It wastes " + wasteAverage + " litres");
		} else if (wasteDulux < wasteCheapo & wasteDulux < wasteAverage) {
			System.out.println("DuluxourousPaints wastes the least with " + tinsOfDulux + " Tins. It wastes " + wasteDulux + " litres");
		} else if (wasteCheapo < wasteAverage & wasteCheapo == wasteDulux){
			System.out.println("CheapoMax & DuluxourousPaints wastes the least with " + tinsOfCheapo + " & " + tinsOfDulux + " Tins respectively. It wastes " + wasteCheapo + " & " + wasteDulux + " litres repectively");
		} else if (wasteDulux < wasteCheapo & wasteDulux == wasteAverage) {
			System.out.println("AverageJoes & DuluxourousPaints wastes the least with " + tinsOfAverage + " & " + tinsOfDulux + " Tins respectively. It wastes " + + wasteAverage + " & " + wasteDulux + " litres repectively");
		} else if (wasteAverage < wasteDulux & wasteAverage == wasteCheapo) {
			System.out.println("AverageJoes & CheapoMax wastes the least with " + tinsOfAverage + " & " + tinsOfCheapo + " Tins respectively. It wastes " + + wasteAverage + " & " + wasteCheapo + " litres repectively");
		}
		if (moneyForCheapo < moneyForAverage & moneyForCheapo < moneyForDulux) {
			System.out.println("CheapoMax costs the least with " + Math.round(moneyForCheapo*10000.00)/10000.00 + " Pounds ");
		} else if (moneyForAverage < moneyForCheapo & moneyForAverage < moneyForDulux) {
			System.out.println("AverageJoes costs the least with " + Math.round(moneyForAverage*10000.00)/10000.00 + " Pounds ");
		} else if (moneyForDulux < moneyForCheapo & moneyForDulux < moneyForAverage){
			System.out.println("DuluxourousPaints costs the least with " + Math.round(moneyForDulux*10000.00)/10000.00 + " Pounds ");
		}
	}
}
