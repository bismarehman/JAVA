import java.util.Scanner;
public class main1 {
	 // Fig. 2.7: Addition.java
	 // Addition program that displays the sum of two numbers.
	
	
	
	 // main method begins execution of Java application
	 public static void main( String[] args )
	 {
	
	// program uses class Scanner
	// create a Scanner to obtain input from the command window
	Scanner input = new Scanner( System.in );
	int number1; // first number to add
	int number2; // second number to add
	int sum; // sum of number1 and number2
	
	System.out.println( "Enter first integer: " ); // prompt
	number1 = input.nextInt();
	System.out.println( "Enter second integer: " );
	
	number2 = input.nextInt(); // read second number from user
	sum = number1 + number2; // add numbers, then store total in sum
	System.out.printf( "Sum is %d\n", sum ); // display sum
}
}