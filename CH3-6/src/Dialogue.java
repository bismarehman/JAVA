

	import javax.swing.JOptionPane;
	
	 public class Dialogue
 {
	 public static void main( String[] args )
	 {
	
	 
	  // end main
	 // end class NameDialog
		String name =
	JOptionPane.showInputDialog( "What is your name?" );
	String message =
	String.format( "Welcome, %s, to Java Programming!", name );
	JOptionPane.showMessageDialog( null, message );}
}
