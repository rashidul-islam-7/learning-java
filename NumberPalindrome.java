
import java.util.Scanner; // Import Scanner class to take user input

public class NumberPalindrome {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Ask the user to enter a number
        System.out.print("Enter a number: ");

        // Store the user's input
        int number = input.nextInt();

        // Save the original number.
        // Why?
        // Because the 'number' variable will change inside the loop.
        // We need the original value later for comparison.
        int original = number;

        // This variable will store the reversed number.
        // Initially, reverse is 0 because no digits have been added yet.
        int reverse = 0;

        /*
         * -------------------- PALINDROME LOGIC --------------------
         *
         * A palindrome number is a number that remains the same
         * even after reversing it.
         *
         * Example:
         * 121 -> Reverse = 121 (Palindrome)
         * 1001 -> Reverse = 1001 (Palindrome)
         * 123 -> Reverse = 321 (Not Palindrome)
         *
         * Steps:
         * 1. Take the last digit.
         * 2. Add it to the reverse number.
         * 3. Remove the last digit.
         * 4. Repeat until the number becomes 0.
         */

        // Run the loop until all digits are processed
        while (number > 0) {

            // Step 1:
            // Get the last digit using the modulus (%) operator.
            //
            // Example:
            // 123 % 10 = 3
            // 4567 % 10 = 7
            int digit = number % 10;

            // Step 2:
            // Add the digit to the reversed number.
            //
            // Example:
            // reverse = 12
            // digit = 3
            //
            // reverse = (12 * 10) + 3
            // = 123
            reverse = reverse * 10 + digit;

            // Step 3:
            // Remove the last digit from the number.
            //
            // Example:
            // 123 / 10 = 12
            // 12 / 10 = 1
            // 1 / 10 = 0
            number = number / 10;
        }

        /*
         * After the loop:
         *
         * original = Original Number
         * reverse = Reversed Number
         *
         * Compare both numbers.
         */

        if (original == reverse) {

            // If both numbers are equal,
            // then it is a palindrome number.
            System.out.println(original + " is a Palindrome Number.");

        } else {

            // Otherwise, it is not a palindrome number.
            System.out.println(original + " is NOT a Palindrome Number.");
        }

        // Close Scanner
        input.close();
    }
}