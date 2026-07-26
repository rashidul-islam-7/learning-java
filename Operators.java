
public class Operators {

    /*
     * ==========================================================
     * JAVA OPERATORS
     * ==========================================================
     *
     * Java Operators are special symbols used to perform
     * operations on variables and values.
     *
     * Java Operators are of Several Categories:
     *
     * 1. Arithmetic Operators
     * - Used to perform mathematical calculations.
     *
     * Examples:
     * +  Addition
     * -  Subtraction
     * *  Multiplication
     * /  Division
     * %  Modulus (Remainder)
     *
     * ----------------------------------------------------------
     *
     * 2. Assignment Operators
     * - Used to assign values to variables.
     *
     * Examples:
     * =   Assignment
     * +=  Add and Assign
     * -=  Subtract and Assign
     * *=  Multiply and Assign
     * /=  Divide and Assign
     * %=  Modulus and Assign
     *
     * ----------------------------------------------------------
     *
     * 3. Comparison (Relational) Operators
     * - Used to compare two values.
     *
     * Examples:
     * ==  Equal To
     * !=  Not Equal To
     * >   Greater Than
     * <   Less Than
     * >=  Greater Than or Equal To
     * <=  Less Than or Equal To
     *
     * ----------------------------------------------------------
     *
     * 4. Logical Operators
     * - Used to combine two or more conditions.
     *
     * Examples:
     * &&  Logical AND
     * ||  Logical OR
     * !   Logical NOT
     *
     * ----------------------------------------------------------
     *
     * 5. Increment & Decrement Operators
     * - Used to increase or decrease a value by 1.
     *
     * Examples:
     * ++  Increment
     * --  Decrement
     *
     * ----------------------------------------------------------
     *
     * 6. Ternary Operator
     * - A shorthand form of if-else statement.
     *
     * Example:
     * condition ? trueValue : falseValue
     *
     * ==========================================================
     */

    public static void main(String[] args) {

        int a = 20;
        int b = 10;

        // ======================================================
        // Arithmetic Operators
        // ======================================================

        int addition = a + b;
        int subtraction = a - b;
        int multiplication = a * b;
        int division = a / b;
        int modulus = a % b;

        // ======================================================
        // Assignment Operators
        // ======================================================

        int number = 10;

        number += 5;
        number -= 2;
        number *= 2;
        number /= 2;
        number %= 4;

        // ======================================================
        // Comparison Operators
        // ======================================================

        boolean isEqual = (a == b);
        boolean isGreater = (a > b);
        boolean isLess = (a < b);

        // ======================================================
        // Logical Operators
        // ======================================================

        boolean x = true;
        boolean y = false;

        boolean andResult = x && y;
        boolean orResult = x || y;
        boolean notResult = !x;

        // ======================================================
        // Increment & Decrement Operators
        // ======================================================

        int count = 5;

        count++;
        count--;

        // ======================================================
        // Ternary Operator
        // ======================================================

        String result = (a > b) ? "A is Greater" : "B is Greater";

        // ======================================================
        // Print Arithmetic Operators
        // ======================================================

        System.out.println("===== Arithmetic Operators =====");
        System.out.println("Addition       : " + addition);
        System.out.println("Subtraction    : " + subtraction);
        System.out.println("Multiplication : " + multiplication);
        System.out.println("Division       : " + division);
        System.out.println("Modulus        : " + modulus);

        // ======================================================
        // Print Assignment Operators
        // ======================================================

        System.out.println("\n===== Assignment Operators =====");
        System.out.println("Final Number : " + number);

        // ======================================================
        // Print Comparison Operators
        // ======================================================

        System.out.println("\n===== Comparison Operators =====");
        System.out.println("Equal      : " + isEqual);
        System.out.println("Greater    : " + isGreater);
        System.out.println("Less       : " + isLess);

        // ======================================================
        // Print Logical Operators
        // ======================================================

        System.out.println("\n===== Logical Operators =====");
        System.out.println("AND Result : " + andResult);
        System.out.println("OR Result  : " + orResult);
        System.out.println("NOT Result : " + notResult);

        // ======================================================
        // Print Increment & Decrement Operators
        // ======================================================

        System.out.println("\n===== Increment & Decrement Operators =====");
        System.out.println("Count : " + count);

        // ======================================================
        // Print Ternary Operator
        // ======================================================

        System.out.println("\n===== Ternary Operator =====");
        System.out.println("Result : " + result);
    }
}