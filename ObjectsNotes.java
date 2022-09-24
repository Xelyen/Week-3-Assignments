import java.util.Scanner;

public class ObjectsNotes {

	public static void main(String[] args) {
		
		//Primitive data type is just a piece of data and nothing more.
		int age = 34;
		
		String name = "Sally Mae";
		System.out.println(name.length()); //name.length() counted the letters and the space, which is 9
		System.out.println(name.charAt(6)); //starts counting from 0, so [5] is 0,1,2,3,4,5
		
		Scanner s = new Scanner(System.in);
		
		int[] numbers = new int[3];
		System.out.println(numbers.length);

	}

}
