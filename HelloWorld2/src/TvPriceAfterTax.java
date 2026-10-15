// Malak Alhamoud
// BC264629
// 10

import java.util.Scanner;

public class TvPriceAfterTax {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
	System.out.print("What's the price of the TV? ");
	double tv_price = input.nextDouble();
	double tv_with_tax = tv_price *0.08 + tv_price ;
	System.out.print("The cost of the TV after Tax is "+tv_with_tax);
	
	
	}

}
