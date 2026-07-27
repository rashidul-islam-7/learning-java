public class Main {

    public static void main(String[] args) {

        int score = 10;
        String grade = null;

        switch (score / 10) {

            case 10:
            case 9:
                grade = "A+";
                break;

            case 8:
                grade = "A";
                break;

            case 7:
                grade = "A-";
                break;

            case 6:
                grade = "B";
                break;

            case 5:
                grade = "C";
                break;

            default:
                grade = "F";
                break;
        }

        System.out.print("Grade: " + grade);
    }
}