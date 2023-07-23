package HardSkillSession16;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		while(true) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Bir kelime giriniz : ");
		String word = scanner.next();
		
		String reverseWord = reverse(word);
		
		System.out.println("Kelimenin terse çevrilmiş hali : ");
		
		if(word.equalsIgnoreCase(reverseWord)) {
			System.out.println(word + " kelimesi bir polindrome kelimedir");
		} else {
			System.out.println(word + " kelimesi bir polindrome kelime değildir");
		}
	 }

	}
	
	public static String reverse(String word) {
		String reversedWord = "";
		
		for(int i = word.length() - 1; i >= 0; i--) {
			reversedWord += word.charAt(i);
		}
		return reversedWord;
	
	}

}
