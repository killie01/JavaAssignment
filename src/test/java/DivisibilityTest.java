import java.util.Scanner;

public class DivisibilityTest {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter an integer
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Close the Scanner object to free resources
        scanner.close();

        // Initialize an array to store the remainders when dividing the number by integers 0-9
        int[] remainders = new int[10];

        // Calculate the remainders for the range of 0-9
        for (int i = 0; i < 10; i++) {
            remainders[i] = number % i;
        }

        // Check for divisibility and print the results
        System.out.println("Results of divisibility test:");
        for (int i = 1; i < 10; i++) {
            if (remainders[i] == 0) {
                System.out.println("The number is divisible by " + i);
            }
        }

        // Special cases for 0 and 10 since we can't divide by 0 and the modulus by 10 is always 0
        if (number % 10 == 0) {
            System.out.println("The number is divisible by 10 because it ends with a 0(zero).");
        }
        if (number == 0) {
            System.out.println("The number is divisible by 0 (but this is undefined).");
        }
    }
}
