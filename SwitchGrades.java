//Name:Ahmet Yesilbas
//Project Name: SwitchGrades
//Date: 1/27/2021
//Project Description: Uses switch to give feedback to user based on their grade.

import java.util.Scanner;


public class SwitchGrades {
public static void main(String Args[]) {
	String input;
	String grade;
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter your grade (letter)\n");
	input = scan.nextLine();
	grade = input.toUpperCase();
	System.out.println(grade);
	switch (grade)
	{
		case "A":
		System.out.println("Good grade! Keep it up.");
		break;
		
		case "B":
			System.out.println("Nice, Try harder to get an A.");
			break;
		case "C":
			System.out.println("Try paying more attention to class.");
			break;
		case "D":
			System.out.println("Use other learning opportunities like Khan Academy or getting help from peers.");
			break;
		case "F":
			System.out.println("Ask help from teacher & get a tutor!");
		default:
			System.out.println("Invalid grade.");
	}
}
}
