import java.util.Scanner;

public class Lab {
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
        int temp = getIntInput("Enter temperature in Fahrenheit: ");
        // Used AI to make the temp a float
        float convertedTemp = (temp - 32) * 5f/9;
        // Used AI to round the temp to the hundredths place
        float convertedTempRounded = Math.round(convertedTemp * 100) / 100.0f;
        System.out.println(temp + "°F is equal to " + convertedTempRounded + "°C");
    }
}