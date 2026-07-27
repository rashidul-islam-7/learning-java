
import java.util.Scanner;

public class BasicProgram {
    // public static void main(String[] args) {
    // Scanner input = new Scanner(System.in);

    // float a = input.nextFloat();
    // float b = input.nextFloat();

    // float area = a * b;

    // System.out.println(area);

    // }

    // public static void main(String[] args){
    // Scanner input = new Scanner(System.in);

    // int r = input.nextInt();
    // double area = Math.PI*r*r;
    // System.out.println(area);
    // }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        int original = number;
        int revers = 0;

        while (number > 0) {
            int digit = number % 10;
            revers = revers * 10 + digit;
            number = number / 10;
        }

        if (original == revers)
            System.out.println(original + " is palindrome number!");
        else
            System.out.println(original + " is't palindrome number!");

    }

}
