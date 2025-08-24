package TaskFourTenQuestions;

import java.util.Scanner;

public class EvenNumberCheck {

	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);

	        // Get an integer from the user
	        System.out.print("Enter an integer: ");
	        int number = scanner.nextInt();	// TODO Auto-generated method stub

		if (number%2 == 0) {
			System.out.println(number+" is an even number");
		}
		else {
			System.out.println(number+" is an oddd number");
		}

	}

}
