package HardSkillSession10;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
	
		//The Java code that finds the largest of the 5 numbers entered from the keyboard
		
		Scanner scanner = new Scanner(System.in);
		
		int max = Integer.MIN_VALUE;
		
		for(int i = 1; i <= 5; i++) {
			System.out.print(i + " .enter the number: ");
			int num = scanner.nextInt();
			
			if(num > max) 
				max = num;
				
			 } 
		System.out.print(max);
		
	}

}
