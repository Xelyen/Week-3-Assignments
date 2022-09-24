
public class MethodNotes {

	public static void main(String[] args) {
		
		//Methods are used to re-use a long code so we don't have to type it out again.
		String firstName = "Bob";
		String lastName = "Ross";
		String fullName = createFullName(firstName, lastName);
		String fullName2 = createFullName("Sam", lastName);
		
		System.out.println(fullName);
		System.out.println(fullName2);

	}
	
	// Public static is our Method. String is to return(Not all methods have to return something, so we use void)
	// createFullName is the name of the Method
	public static String createFullName(String x, String y) {
		return x + " " + y;
	}

}
