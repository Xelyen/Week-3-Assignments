
public class ArrayNotes {
	
	public static void main(String [] args) {
		
		String studentName1 = "Tom Sawyer";
		String studentName2 = "Jack Smith";
		String studentName3 = "Bill Turner";
		
		System.out.println(studentName1);
		System.out.println(studentName2);
		System.out.println(studentName3);
		
		// Number in string depending the amount of elements in the string
		String[] students = new String[3]; // [] <- these brackets indicate it is an array, can be used with other data types.
		// [3] ranges are 0,1,2. Not 1,2,3
		students[0] = "Tom Sawyer";
		students[1] = "Jack Smith";
		students[2] = "Bill Turner";
		
		System.out.println(students[0]);
		System.out.println(students[1]);
		System.out.println(students[2]);
		
		for (int i = 0; i < students.length; i++) { //students.length = length of student array.
			System.out.println(students[i]);
		}
		
		System.out.println("Enhanced for loop: ");
		
		// Enhanced for loop.
		// String student : students = For each student in students.
		for (String student : students) { //String student can be any character.
			System.out.println(student);
		}
		
	}

}
