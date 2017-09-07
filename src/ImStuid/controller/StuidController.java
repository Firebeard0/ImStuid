package ImStuid.controller;

import java.util.Scanner;


public class StuidController
{
	public void start() {
		System.out.println("I am so stupid:)");
		testScanner();
	}
	private void testScanner()
	{
		Scanner firstScanner;
		firstScanner = new Scanner(System.in);
		System.out.println("What is your favorite food?");
		String answer = firstScanner.nextLine();
		System.out.println("oh cool, you like " + answer);
	}
	
}
