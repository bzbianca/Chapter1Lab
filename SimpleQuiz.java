import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SimpleQuiz {
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

        // Searched up how to make a list
        // Used AI to fix list code - added import java.util.List; and java.util.ArrayList
        List<String> quizQuestions = new ArrayList<>();
        quizQuestions.add("Question 1: What is the capital of France?");
        quizQuestions.add("Question 2: What is 2 + 2?");
        quizQuestions.add("Question 3: What language are we learning?");

        int scoreCounter = 0;;
        // Used AI how to iterate through a list
        for (int i = 0; i < quizQuestions.size(); i++) {
            // Used AI to get the item from the list
            String question = quizQuestions.get(i);
            System.out.println(question);
            String userAnswer = getInput("Your answer: ");
            if (userAnswer.equals("Paris") || userAnswer.equals("4") || userAnswer.equals("Java")) {
                System.out.println("Correct!");
                scoreCounter += 1;
            } else {
                System.out.println("Incorrect.");
            }
        }
        if (scoreCounter == 3) {
            System.out.println("Final Score: " + scoreCounter + "/3 - Perfect!");
        } else {
            System.out.println("Final Score: " + scoreCounter + "/3 - Nice Try.");
        }

    }
}