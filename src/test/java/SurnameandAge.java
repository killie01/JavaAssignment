
	import java.util.Scanner;

	public class SurnameandAge {
	    public static void main(String[] args) {
	        // Create a Scanner object to read user input
	        Scanner scanner = new Scanner(System.in);

	        // Ask the user to enter their surname
	        System.out.print("Enter your surname: ");
	        String surname = scanner.nextLine();

	        // Ask the user to enter their current age
	        System.out.print("Enter your current age: ");
	        int age = scanner.nextInt();

	        // Close the Scanner object to free resources
	        scanner.close();

	        // Calculate the number of characters in the surname
	        int surnameLength = surname.length();

	        // Print the number of characters in the surname
	        System.out.println("The number of characters in your surname is: " + surnameLength);

	        // Check if the age is even or odd and print the result
	        if (age % 2 == 0) {
	            System.out.println("Your current age is an even number.");
	        } else {
	            System.out.println("Your current age is an odd number.");
	        }
	    }
	}
