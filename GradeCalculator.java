import java.util.Scanner;

public class GradeCalculator {
    public static Scanner scanner = new Scanner(System.in);

    public static String getInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }

    public static int getIntInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextInt();
    }

    public static void main(String[] args) {
        // Your code goes here
        // Use getInput("Enter something: ") for strings
        // Use getIntInput("Enter a number: ") for integers

        // Example usage:
        // String name = getInput("What's your name? ");
        // int age = getIntInput("What's your age? ");
        // System.out.println("Hello " + name + ", you are " + age + " years old.");
        int firstTest = getIntInput("Enter first test score: ");
        int secondTest = getIntInput("Enter first test score: ");
        int thirdTest = getIntInput("Enter first test score: ");
        float averageScores = (firstTest + secondTest + thirdTest) / 3f;
        System.out.println("Your average is " + averageScores);
        String letterGrade;;
        if (averageScores >= 90) {
            System.out.println("Your letter grade is: A");
        } else if (averageScores <= 89 && averageScores >= 80) {
            System.out.println("Your letter grade is: B");
        } else if (averageScores <= 79 && averageScores >= 70) {
            System.out.println("Your letter grade is: C");
        } else if (averageScores <= 69 && averageScores >= 60) {
            System.out.println("Your letter grade is: D");
        } else {
            System.out.println("Your letter grade is: F");
        }
    }
}