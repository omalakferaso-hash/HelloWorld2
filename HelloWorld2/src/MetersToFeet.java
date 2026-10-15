// Malak Alhamoud
// BC264629
// 10

import java.util.Scanner;

public class MetersToFeet {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
	System.out.print("Input meters distance: ");
	double meters = input.nextDouble();
	double feet = meters * 3.2786 ;
	System.out.print(+meters+" meters is equal to "+feet+" feet.");
 
    }

}
