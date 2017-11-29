
  
	// Fig. 3.8: GradeBookTest.java
	 // Creating and manipulating a GradeBook object.
	 import java.util.Scanner; // program uses Scanner
	
	 public class GradeBookTest
	 {
	 // main method begins program execution
	 public static void main( String[] args )
	{
	 // create Scanner to obtain input from command window
	 Scanner input = new Scanner( System.in );
	
	 // create a GradeBook object and assign it to myGradeBook
	 GradeBook myGradeBook = new GradeBook();
	 System.out.printf( "Initial course name is: %s\n\n",
			 myGradeBook.getCourseName());
	 System.out.println( "Please enter the course name:" );
	  String theName = input.nextLine(); // read a line of text
	 
	  System.out.println(); // outputs a blank line
	 myGradeBook.getCourseName();
	 myGradeBook.setCourseName( theName ); // set the course name
	 myGradeBook.displayMessage();
	
	
	
	}
	
	
	
	}
