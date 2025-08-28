import java.util.Scanner;

public class NumberGuessingGame {
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
        int secretNumber = 1;
        while (true){ // Searched up how to while loop
            int guess = getIntInput("Guess the number between 1 and 100: ");
            if (secretNumber == guess) {
                System.out.println("Correct! You got it!");
                break;
            } else if (secretNumber > guess){
                System.out.println("Too low!");
            } else {
                System.out.println("Too high!");
            }
        }
    }
}