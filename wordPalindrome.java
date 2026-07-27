import java.util.Scanner; // Import Scanner class for user input

// Create a class
public class WordPalindrome {

    // Main method (Program starts from here)
    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Ask the user to enter a word
        System.out.print("Enter a word: ");

        // Read the word from the keyboard
        String word = input.nextLine();

        // Create an empty string to store the reversed word
        String reverseWord = "";

        // Start loop from the last character
        // Example: "madam"
        // Index:     01234
        // Loop:      43210
        for (int i = word.length() - 1; i >= 0; i--) {

            // Get one character using its index
            // Example:
            // i = 4 → m
            // i = 3 → a
            // i = 2 → d
            char letter = word.charAt(i);

            // Add the character to the reverse string
            // Example:
            // ""
            // "m"
            // "ma"
            // "mad"
            // "mada"
            // "madam"
            reverseWord = reverseWord + letter;
        }

        // Compare the original word and the reversed word
        // equals() is used to compare two String values
        if (word.equals(reverseWord)) {

            // If both are equal
            System.out.println(word + " is a Palindrome Word.");

        } else {

            // If both are not equal
            System.out.println(word + " is Not a Palindrome Word.");

        }

        // Close the Scanner object
        input.close();
    }
}