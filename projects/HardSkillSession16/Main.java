package HardSkillSession16;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int guessCount = 0, predictedNumber, randomNumber, score = 0;
		boolean isContinue = true;
		
		randomNumber = (int) (Math.random() * 100) + 1;
		Scanner scanner = new Scanner(System.in);
		
		while(isContinue) {
			System.out.print("1-100 arasında bir sayı giriniz : ");
			predictedNumber = scanner.nextInt();
			if(predictedNumber < 1 || predictedNumber > 100) {
				continue;
			}
			guessCount++;
			
			if(predictedNumber == randomNumber) {
				score++;
				System.out.println("-----------------------------");
				System.out.println("- Tebrikler Sayıyı Bildiniz, " + guessCount + " tahminde bildiniz, skorunuz :" + score);
				System.out.println("-----------------------------");
				System.out.println("Tekrar Oynamak İster Misiniz ? E/H");
				char playAgain = scanner.next().charAt(0);
				if(playAgain == 'H' || playAgain == 'h') {
					isContinue = false;
				} else {
					guessCount = 0;
					randomNumber = (int) (Math.random() * 100) + 1;
				}
				
			} else if(predictedNumber < randomNumber) {
				System.out.println("Çok düşük tekrar deneyiniz.");
			} else {
				System.out.println("Çok yüksek tekrar deneyiniz.");
			}
			
			System.out.println();
		}
		

	}

}
