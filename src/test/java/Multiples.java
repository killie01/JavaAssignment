public class Multiples {
    public static void main(String[] args) {
        // Define the range limits
        int lowerBound = 71;
        int upperBound = 150;

        // Display the header
        System.out.println("Multiples of 2, 3, and 7 within the range " + lowerBound + " to " + upperBound + ":");

        // Loop through the range and check for multiples of 2, 3, and 7
        for (int i = lowerBound; i <= upperBound; i++) {
            if (i % 2 == 0) {
                // Check for multiples of 2
                System.out.println(i + " is a multiple of 2.");
            }
            if (i % 3 == 0) {
                // Check for multiples of 3
                System.out.println(i + " is a multiple of 3.");
            }
            if (i % 7 == 0) {
                // Check for multiples of 7
                System.out.println(i + " is a multiple of 7.");
            }
        }
    }
}

