/* Name: Aaron
 * Date: September 28th 2022
 * Version: 1.0
 * Description: Converts Fahrenheit to Kelvin
 */



import java.util.Scanner; //import scanner to get user input on temperature 

public class TemperatureCal {
	
	public static void main(String[] args) {
	
	System.out.println ("hello I will convert your temperature from Fahrenheit to Kelvin");
	try (Scanner sc = new Scanner(System.in)) { // create scanner
		System.out.println("please give me a temperature in Ferinheight");
		double temp = sc.nextInt(); // take the next int the user puts in
		System.out.println("your number is "+ temp);
		double kelvin = (temp -32) / 1.8 + 273.15; // math on converting F to K
		System.out.printf("in kelvin your temperature is: %,.2f  ", kelvin); // output to 2 decimal points
	
	
		}
	}
}
