// Fig. 3.7: GradeBook.java
 // GradeBook class that contains a courseName instance variable
 // and methods to set and get its value.

 public class GradeBook
{
 // display a welcome message to the GradeBook user


private String courseName; // course name for this GradeBook
// method to set the course nameCourseName()
public void setCourseName( String name )
{
courseName = name; // store the course name
} // end method setCourseName
// method to retrieve the course name
public String getCourseName()
{
return courseName;
}
   public void displayMessage()
 {
	System.out.printf( "Welcome to the grade book for\n%s!\n",getCourseName());
 }
}
	
	








