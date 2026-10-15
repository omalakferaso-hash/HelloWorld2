// Malak Alhamoud
// BC264629
// 10

import java.util.Scanner;

public class AvgVariables {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
    System.out.print("Enter three numbers: ");
    double x = input.nextDouble();
    double y = input.nextDouble();
    double z = input.nextDouble();
    
    double Average = (x+y+z)/3 ;
    
    System.out.print("The average of "+x+" ,"+y+" and "+z+"  is "+Average);
    
	}

}
