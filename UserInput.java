/*
Topics covered in this example
✅ What is User Input?
✅ What is Scanner?
✅ Import java.util.Scanner
✅ Create a Scanner object
✅ nextInt()
✅ nextLong()
✅ nextFloat()
✅ nextDouble()
✅ nextBoolean()
✅ Character input using next().charAt(0)
✅ next() (one word)
✅ nextLine() (full line)
✅ Difference between next() and nextLine()
✅ Why input.nextLine() is needed after numeric input
✅ Closing the Scanner with input.close()

*/

import java.util.Scanner;

public class UserInput {

    /*
     * ==========================================================
     * JAVA USER INPUT
     * ==========================================================
     *
     * What is User Input?
     *
     * User Input is the data entered by the user while the
     * program is running.
     *
     * Instead of writing values directly in the program,
     * the user provides values at runtime.
     *
     * Examples:
     * - Name
     * - Age
     * - CGPA
     * - Salary
     * - Mobile Number
     * - Grade
     * - Student Status
     *
     * ==========================================================
     * WHAT IS SCANNER?
     * ==========================================================
     *
     * Scanner is a predefined Java class used to read
     * input from the keyboard.
     *
     * Scanner belongs to the java.util package.
     *
     * Therefore, before using Scanner,
     * we must import it.
     *
     * import java.util.Scanner;
     *
     * ==========================================================
     * STEP 1 : Import Scanner
     * ==========================================================
     *
     * import java.util.Scanner;
     *
     * Why?
     *
     * Without importing Scanner,
     * Java doesn't know what Scanner is.
     *
     * ==========================================================
     * STEP 2 : Create a Scanner Object
     * ==========================================================
     *
     * Syntax:
     *
     * Scanner input = new Scanner(System.in);
     *
     * Explanation:
     *
     * Scanner -> Class Name
     * input -> Object Name
     * = -> Assignment Operator
     * new -> Creates a new object
     * Scanner(...) -> Calls Scanner Constructor
     * System.in -> Reads input from keyboard
     *
     * Flow:
     *
     * Keyboard
     * │
     * ▼
     * System.in
     * │
     * ▼
     * Scanner Object
     * │
     * ▼
     * Java Program
     *
     * ==========================================================
     * COMMON SCANNER METHODS
     * ==========================================================
     *
     * nextByte() -> Reads byte
     * nextShort() -> Reads short
     * nextInt() -> Reads int
     * nextLong() -> Reads long
     * nextFloat() -> Reads float
     * nextDouble() -> Reads double
     * nextBoolean() -> Reads boolean
     * next() -> Reads one word
     * nextLine() -> Reads an entire line
     *
     * There is NO nextChar() method.
     *
     * To read a character:
     *
     * input.next().charAt(0);
     *
     * ==========================================================
     */

    public static void main(String[] args) {

        // ======================================================
        // Create Scanner Object
        // ======================================================

        Scanner input = new Scanner(System.in);

        // ======================================================
        // Read Integer
        // ======================================================

        System.out.print("Enter Your Age: ");
        int age = input.nextInt();

        // ======================================================
        // Read Long
        // ======================================================

        System.out.print("Enter Mobile Number: ");
        long mobile = input.nextLong();

        // ======================================================
        // Read Float
        // ======================================================

        System.out.print("Enter Salary: ");
        float salary = input.nextFloat();

        // ======================================================
        // Read Double
        // ======================================================

        System.out.print("Enter CGPA: ");
        double cgpa = input.nextDouble();

        // ======================================================
        // Read Boolean
        // ======================================================

        System.out.print("Are You a Student (true/false): ");
        boolean isStudent = input.nextBoolean();

        // ======================================================
        // Read Character
        // ======================================================

        System.out.print("Enter Grade: ");
        char grade = input.next().charAt(0);

        // ======================================================
        // Read One Word String
        // ======================================================

        System.out.print("Enter First Name: ");
        String firstName = input.next();

        /*
         * nextLine() Problem
         *
         * After using next(), nextInt(), nextDouble(), etc.,
         * a newline character (\n) remains in the input buffer.
         *
         * So, we use an extra nextLine()
         * to clear the buffer.
         */

        input.nextLine();

        // ======================================================
        // Read Full Line String
        // ======================================================

        System.out.print("Enter Full Name: ");
        String fullName = input.nextLine();

        // ======================================================
        // Print User Input
        // ======================================================

        System.out.println("\n========== USER INFORMATION ==========");

        System.out.println("Age           : " + age);
        System.out.println("Mobile Number : " + mobile);
        System.out.println("Salary        : " + salary);
        System.out.println("CGPA          : " + cgpa);
        System.out.println("Student       : " + isStudent);
        System.out.println("Grade         : " + grade);
        System.out.println("First Name    : " + firstName);
        System.out.println("Full Name     : " + fullName);

        // ======================================================
        // Close Scanner
        // ======================================================

        input.close();
    }
}