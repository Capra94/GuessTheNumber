import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int number1;
        int numberOfAttempts = 0; 


    while (true) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        number1 = scanner.nextInt();

        // creates an object of the random class
        Random random = new Random();

        System.out.println("Try: " + numberOfAttempts);

        // Generate a random integer between 0 (inclusive) and 100 (exclusive)
        int randomNumber = random.nextInt(100);

        System.out.println("Random Number: " + randomNumber);

        

        if (randomNumber > number1) {
            System.out.println("The computer has chosen a higher number");
        } else if (randomNumber < number1) {
            System.out.println("The computer has chosen a lower number");
        } else {
            System.out.println("You have found the number!");
            break;
        }

        // Increment the number of attempts after each attempt
        numberOfAttempts++;
        System.out.println("Total Attempts: " + numberOfAttempts);
    }
    System.out.println("Total attempts: " + numberOfAttempts);
}
}

