import java.util.Scanner;

public class AverageMarks {
	    public static void main(String[] args) {
	        // Create a Scanner object to read user input
	        Scanner scanner = new Scanner(System.in);

	        // Ask the student to enter the marks for five units
	        System.out.println("Enter the marks for five units:");

	        // Initialize a variable to store the total marks
	        int totalMarks = 0;

	        // Loop to read and sum the marks for five units
	        for (int i = 1; i <= 5; i++) {
	            System.out.print("Unit " + i + " marks: ");
	            int marks = scanner.nextInt();

	            // Add the marks to the total
	            totalMarks += marks;
	        }

	        // Close the Scanner object to free resources
	        scanner.close();

	        // Calculate the average by dividing the total marks by 5 (since there are five units)
	        double average = (double) totalMarks / 5;

	        // Display the average with two decimal places
	        System.out.printf("The average marks is: %.2f%n", average);
	    }
	}


