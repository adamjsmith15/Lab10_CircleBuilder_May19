package co.grandcircus;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CircleApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String keepTesting = "y";
		int counter = 0;
		System.out.println("Welcome to the Circle Tester");
		while (keepTesting.equals("y")) {
			double rad = 0;

			System.out.print("Enter radius: ");
			try {
				rad = sc.nextDouble();
			}catch(InputMismatchException e) {
				System.out.println("Error, please enter a number");
				sc.nextLine();
				continue;
			}
			
			Circle circleTest = new Circle(rad);
			System.out.print(circleTest.getFormattedCircumference());
			System.out.print(circleTest.getFormattedArea());
			counter ++;
			System.out.print("Continue? (y/n): ");
			keepTesting = sc.next();
		}
		
		System.out.println("");
		System.out.println("You built " + counter + " circle(s).");
		System.out.println("Goodbye.");
		sc.close();
	}

}
