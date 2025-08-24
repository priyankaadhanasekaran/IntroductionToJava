package TaskFourTenQuestions;

import java.util.Scanner;

public class SeniourCitizenCheck {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the age");
		int age=scanner.nextInt();
		if (age>=60) 
		{
		System.out.println("The persion is a seniour citizen");
		}
		
		else
		{
			System.out.println("the persion is not a seniour citizen");
			
		}
	    scanner.close();


	}

}
