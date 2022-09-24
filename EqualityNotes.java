
public class EqualityNotes {

	public static void main(String[] args) {
		
		String a = new String("Hello");
		String b = new String("Hello");
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(a == b); //prints out False
		//use method to compare two of the same objects.
		System.out.println("equals() method: " + a.equals(b)); //prints out True now.
		
		int x = 5;
		int y = 5;
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(x == y); //prints out True
		
		String c = new String("Hello");
		String d = c;
		
		System.out.println(c);
		System.out.println(d);
		System.out.println(c == d); //prints out True
		

	}

}
