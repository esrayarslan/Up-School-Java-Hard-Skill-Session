package hardSkillSession10;

import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		// Java code that finds the average of 5 numbers entered from the keyboard
		
		Scanner scanner = new Scanner(System.in);
		
		double sum = 0;
		
		for(int i = 1; i <= 5; i++) {
			System.out.print(i + ". enter the number: ");
			
			double num = scanner.nextInt();
			sum += num;
			} 
		
		double average = sum / 5;
		
		System.out.print("Average : " + average);
		
	}

	}


