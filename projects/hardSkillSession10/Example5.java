package hardSkillSession10;

import java.util.Scanner;
public class Example5 {

	public static void main(String[] args) {
		// Java code that finds the factorial of the number entered from the keyboard (using recursive methods)
		Scanner inp = new Scanner(System.in);
		
		System.out.print("Enter the number you want to find the factoring :");
		int number = inp.nextInt();
		
		System.out.println(calculateFactorial(number));
		
		
	}
	
	public static double calculateFactorial(int number) {
		if (number == 0) {
			return 1;
		} else {
			return number * calculateFactorial(number - 1);
			
		}
	}
}
			
