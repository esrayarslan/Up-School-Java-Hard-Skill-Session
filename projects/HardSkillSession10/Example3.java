package HardSkillSession10;

import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
		
		// Java code that finds the sum of the factorials of 5 numbers entered from the keyboard
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		
		for(int i = 0; i < 5; i++) {
			
			int num = sc.nextInt();
			int mult = 1;
			for(int j = 1; j <= num; j++) {
				mult = mult * j;
			}
			sum = sum + mult;
			System.out.print("factorial : " + mult);
	}
		System.out.println("sum: " + sum);

}
}

