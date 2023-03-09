package hardSkillSession9;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		
		int a = 1;
		int b = 1;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print(" Enter a number from the keyboard : ");
		int n = input.nextInt();
		
		if(n == 0) {
			System.out.println("There is no fibonacci number to calculate...");
		} else if(n == 1) {
			System.out.println(a);
			
		} else {
			for(int i = 0; i<n; i++){
				System.out.print(a + " ");
				int temp = a;
				a = b;
				b = temp + b;
					
			}
			
			//When we do it with the Fibonacci method
			
			
		}
	}

}
