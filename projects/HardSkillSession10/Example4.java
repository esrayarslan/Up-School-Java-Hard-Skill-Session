package HardSkillSession10;

import java.util.Scanner;

public class Example4 {
	
	public static void main(String[] args) {
		System.out.println(findFactorial(findMaxNumber()));
	}
	
	
	public static double findFactorial(int a) {
		if(a == 0)
			return 1;
		double factorial = 1;
		for(int i = 1; i <= a; i++) {
			factorial *= i;
		}
		 
		return factorial;
		
	}

	public static int findMaxNumber() {
		// Java code that finds the factorial of the largest number from the 5 numbers entered from the keyboard
		Scanner scanner = new Scanner(System.in);
		
		int max = Integer.MIN_VALUE;
		
		for(int i = 1; i <= 5; i++) {
			System.out.print(i + ". enter the number:");
			int num = scanner.nextInt();
			
			if(num > max) 
				max = num;
				
			 } 
		return max;
		
	} 
	

	}


