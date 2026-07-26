public class DataTypes {

    /*
     * ==========================================================
     * JAVA DATA TYPES
     * ==========================================================
     *
     * Java Data Types are of Two Categories:
     *
     * 1. Primitive Data Types
     * - Store a single, simple value directly.
     * - Built into Java.
     *
     * Examples:
     * byte - Stores an 8-bit signed integer.
     * short - Stores a 16-bit signed integer.
     * int - Stores a 32-bit signed integer.
     * long - Stores a 64-bit signed integer.
     * float - Stores a 32-bit floating-point number.
     * double - Stores a 64-bit floating-point number.
     * char - Stores a single Unicode character using single quotes ('A').
     * boolean - Stores one of two values: true or false.
     *
     * ----------------------------------------------------------
     *
     * 2. Non-Primitive (Reference) Data Types
     * - Store references (memory addresses) to objects.
     * - Can represent complex data and collections of values.
     *
     * Examples:
     * String - Stores text using double quotes ("Hello").
     * Array - Stores multiple values of the same data type.
     * Class - A blueprint for creating objects.
     * Object - An instance of a class.
     * Interface - Defines a contract that classes can implement.
     *
     * ==========================================================
     */

    public static void main(String[] args) {

        // ======================================================
        // Primitive Data Types
        // ======================================================

        byte age = 20;
        short year = 2026;
        int roll = 816483;
        long mobile = 8801712345678L;

        float cgpa = 3.90f;
        double salary = 25000.50;

        char grade = 'A';
        boolean isStudent = true;

        // ======================================================
        // Non-Primitive Data Types
        // ======================================================

        String name = "Rashed";

        int[] marks = { 85, 90, 95, 88 };

        // ======================================================
        // Print Primitive Data Types
        // ======================================================

        System.out.println("===== Primitive Data Types =====");
        System.out.println("Byte Age      : " + age);
        System.out.println("Short Year    : " + year);
        System.out.println("Int Roll      : " + roll);
        System.out.println("Long Mobile   : " + mobile);
        System.out.println("Float CGPA    : " + cgpa);
        System.out.println("Double Salary : " + salary);
        System.out.println("Char Grade    : " + grade);
        System.out.println("Boolean       : " + isStudent);

        // ======================================================
        // Print Non-Primitive Data Types
        // ======================================================

        System.out.println("\n===== Non-Primitive Data Types =====");

        System.out.println("String Name : " + name);

        System.out.print("Array Marks : ");

        for (int mark : marks) {
            System.out.print(mark + " ");
        }

        System.out.println();
    }
}