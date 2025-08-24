package TaskFourTenQuestions;

	import java.util.Scanner;

	public class DigitCounter {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Get an integer from the user
	        System.out.print("Enter an integer: ");
	        int number = scanner.nextInt();

	        int count = 0;
	        int temp = Math.abs(number); // Handle negative numbers

	        // Special case for 0
	        if (temp == 0) {
	            count = 1;
	        } else {
	            while (temp > 0) {
	                temp = temp / 10;
	                count++;
	            }
	        }

	        
	        System.out.println("Number of digits in " + number + " is: " + count);

	        scanner.close();
	    }
	}
