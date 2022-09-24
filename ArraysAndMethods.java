package week3Labs;

public class ArraysAndMethods {

	public static void main(String[] args) {
		
		//Create an array with the following values 1, 5, 2, 8, 13, 6
		int[] array = new int[6]; //instead of typing out the long array,
								  //we can replace new int[6] -> {1, 5, 2, 8, 13, 6};
		array[0] = 1;
		array[1] = 5;
		array[2] = 2;
		array[3] = 8;
		array[4] = 13;
		array[5] = 6;
		
		//print out he first element in the array
		System.out.println(array[0]);
		
		//print out the last element in the array without using the number 5
		System.out.println(array[array.length - 1]); //array.length gives us the length of the array.
		
		//print out the array at position 6. What happens?
		//System.out.println(array[6]); Error, out of bounds of the array.
		
		//print out the array at position -1. What happens?
		//System.out.println(array[-1]); Error, out of bounds of the array.
		
		//Write a traditional for loop that prints out each element in the array
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		//Write an enhanced for loop that prints out each element in the array
		for (int i : array) {
			System.out.println(i);
		}
		
		//create a new variable called sum, write a loop that adds each element in the array to the sum
		double sum = 0;
		for (int i : array) {
			sum += i;
		}
		System.out.println(sum);
		
		//create a new variable called average and assign the average value of the array to it
		double average = sum / array.length;
		System.out.println(average);
		
		//write an enhanced for loop that prints out each number in the array only if the number is odd
		for (int i : array) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
		
		//create an array that contains the values "Sam", "Sally", "Thomas", and "Robert"
		String[] myArray = new String [4];
		myArray[0] = "Sam";
		myArray[1] = "Sally";
		myArray[2] = "Thomas";
		myArray[3] = "Robert";
		
		//calculate the sum of all letters in the new array
		int sumOfLetters = 0;
		for (String name : myArray) {
			sumOfLetters += name.length();
		}
		System.out.println(sumOfLetters);
		
		//write and test a method that takes a String name and prints out a greeting, this method returns nothing
		greet("Tom");
		greet("Sally");
		
		//write and test a method that takes a String name and returns a greeting, do not print in the method.
		System.out.println(greet2("Nick"));
		
		//analyze the difference between the two methods - what do you find? how are they different
		//One can't store anything because of void and the other you can access the value outside of the method.
		
		//write and test a method that takes a String and an int and returns true if the number of letters in the String is greater than int
		System.out.println(isStringLongerThanNumber("Hello", 6));
		
		//write and test a method that takes an array of string and a string and returns true if the string passed in exists in the array
		System.out.println(doesArrayContainString(myArray, "Sam"));
		
		//write and test a method that takes an array of int and returns the smallest number in the array
		System.out.println(smallestNumber(array));
		
		//write and test a method that takes an array of double and returns the average
		double[] doubles = {45.7, 30.2, 67.3};
		System.out.println(calculateAverage(doubles));
		
		//write and test a method that takes an array of Strings and returns an array of int where each element matches the length of the string at that position
		int[] nameLengths = extractStringLengths(myArray);
		for (int i : nameLengths) {
			System.out.println(i);
		}
		
		//write and test a method that takes an array of strings and returns true if the sum of letters for all strings with an
		//even amount of letters is greater than the sum of those with an odd amount of letters.
		System.out.println(hasMoreEvenWordCharacters(myArray));
		
		//Write and test a method that takes a string and returns true if the string is a palindrome
		System.out.println(isPalindrome("racecar"));
		

	}
	
		//write and test a method that takes a String name and prints out a greeting, this method returns nothing
	public static void greet(String name) { //Needs to be called static bc we are calling from out main method
		System.out.println("Hello, " + name + "!");
	}
	
		//write and test a method that takes a String name and returns a greeting, do not print in the method.
	public static String greet2(String name) {
		return "Hi, " + name + "!";
	}
	
		//write and test a method that takes a String and an int and returns true if the number of letters in the String is greater than int
	public static boolean isStringLongerThanNumber(String string, int number) {
		if (string.length() > number) { //instead of using if else we can just write out - return string.length() > number;
			return true;
		} else {
			return false;
		}
	}
	
		//write and test a method that takes an array of string and a string and returns true if the string passed in exists in the array
	public static boolean doesArrayContainString(String[] array, String string) {
		for (String str : array) {
			if (str.equals(string)) { //.equals when comparing objects.
				return true;
			}
		}
		return false;
	}
	
		//write and test a method that takes an array of int and returns the smallest number in the array
	public static int smallestNumber(int[] numbers) {
		int smallest = numbers[0];
		for (int i : numbers) {
			if (i < smallest) {
				smallest = i;
			}
		}
		return smallest;
	}
	
		//write and test a method that takes an array of double and returns the average
	public static double calculateAverage(double[] array) {
		double sum = 0;
		for (double number : array) {
			sum += number;
		}
		return sum / array.length;
	}
	
		//write and test a method that takes an array of Strings and returns an array of int where each element matches the length of the string at that position
	public static int[] extractStringLengths(String[] strings) {
		int[] results = new int[strings.length];
		for (int i = 0; i < strings.length; i++) {
			results[i] = strings[i].length();
		}
		return results;
	}
	
		//write and test a method that takes an array of strings and returns true if the sum of letters for all strings with an
		//even amount of letters is greater than the sum of those with an odd amount of letters.
	public static boolean hasMoreEvenWordCharacters(String[] array) {
		int evenLetters = 0;
		int oddLetters = 0;
		
		for (String string : array) {
			if (string.length() % 2 == 0) {
				evenLetters += string.length();
			} else {
				oddLetters += string.length();
			}
		}
		return evenLetters > oddLetters;
	}
	
		//Write and test a method that takes a string and returns true if the string is a palindrome
	public static boolean isPalindrome(String string) { //Palindrome are things that spelled backwards are the same
		for (int i = 0; i < string.length() / 2; i++) {
			if (string.charAt(i) != string.charAt(string.length() - i - 1)) {
				return false;
			}
		}
		return true;
	}

}
