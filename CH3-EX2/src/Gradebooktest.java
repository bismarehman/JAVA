
    
	 import java.util.Scanner; // program uses Scanner
	  
	 public class Gradebooktest {// main method begins program execution
	  public static void main( String args[] )
	  {
	  // create Scanner to obtain input from command window
	  Scanner input = new Scanner( System.in );
	 
	 // create a GradeBook object and assign it to myGradeBook
	  GradeBook myGradeBook = new GradeBook();
	 
	  // prompt for and input course name
	  System.out.println( "Please enter the course name:" );
	   System.out.println(); // outputs a blank line
	  String nameOfCourse = input.nextLine(); // read a line of text
	  myGradeBook.displayMessage( nameOfCourse );
	  
	  }
	  }
