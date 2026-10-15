// Malak Alhamoud
// BC264629
// 10

import java.util.Scanner;

public class MilesToKilometers {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
	System.out.print("Input the miles distance: ");
	double miles = input.nextDouble();
	double kilometers = miles * 1600;
	System.out.print(+miles+" miles is equal to "+kilometers+" kilometers.");
	}
	

}
