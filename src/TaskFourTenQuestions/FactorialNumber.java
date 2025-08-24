package TaskFourTenQuestions;

import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input from user
        System.out.print("Enter a number to calculate its factorial: ");
        int number = scanner.nextInt();

        // Variable to store factorial result
        long factorial = 1;

        // Check for negative input
        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            // Calculate factorial using a loop
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }

            // Display result
            System.out.println(number + "! = " + factorial);
        }

        scanner.close();
    }
}
