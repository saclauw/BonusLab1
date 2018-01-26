import java.util.Scanner;

/*
 * Convert given number grades into letter grades.
 * 
 * -Accept a numerical grade from 0 to 100
 * -Display the corresponding letter grade
 * -Prompt the user to continue
 * 
 * BUILD SPECS
 * --Assume the user wil enter valid int for grades
 * --The App should only continue if the user enters y
 * 
 * grade ranges
 * 
 * A 100 -88
 * B 87 - 80
 * C 79 - 67
 * D 66 - 60
 * F 60 - 0
 */
import java.util.Scanner;

public class BonusLab1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int userGrade = 0;
		boolean validNum;
		String cont = "y";

		System.out.println("Welcome to the Letter Grade Converter!");
		System.out.println("");

		while (cont.equalsIgnoreCase("y")) {
		
		do { // loop used to validate user input will be an int
			System.out.print("Enter a numerical grade: ");
			System.out.println("");
			if (scan.hasNextInt()) {
				userGrade = scan.nextInt();
				validNum = true;
			} else {
				System.out.print("Not a valid entry");
				validNum = false;
				scan.next();
			}
		} while (!(validNum));
		
		if ((userGrade <= 100) && (userGrade > 98)) {
			System.out.println("Letter Grade: A+");
		}
		if ((userGrade <=98) && (userGrade > 90)) {
			System.out.println("Letter Grade: A");
		}
		if ((userGrade <= 90) && (userGrade > 87)) {
			System.out.println("Letter Grade: A-");
		}
		if ((userGrade <= 87) && (userGrade > 85)) {
			System.out.println("Letter Grade: B+");
		}
		if ((userGrade <=85) && (userGrade > 81)) {
			System.out.println("Letter Grade: B");
		}
		if ((userGrade <= 81) && (userGrade > 79)) {
			System.out.println("Letter Grade: B-");
		}
		if ((userGrade <= 79) && (userGrade > 75)) {
			System.out.println("Letter Grade: C+");
		}
		if ((userGrade <= 75) && (userGrade > 69)) {
			System.out.println("Letter Grade: C");
		}
		if ((userGrade <= 69) && (userGrade > 66)) {
			System.out.println("Letter Grade: C-");
		}
		if ((userGrade <= 66) && (userGrade > 64)) {
			System.out.println("Letter Grade: D+");
		}
		if ((userGrade <= 64) && (userGrade > 61)) {
			System.out.println("Letter Grade: D");
		}
		if ((userGrade <= 61) && (userGrade > 59)) {
			System.out.println("Letter Grade: D-");
		}
		if (userGrade < 60) {
			System.out.println("Letter Grade: F");
		}
		
		System.out.println("");
		System.out.print("Do you want to continue? (y/n): ");
		cont = scan.next();
		System.out.println("");
		if (!cont.equalsIgnoreCase("y")) {
			System.out.println("Goodbye!");
		}

	}
}
}