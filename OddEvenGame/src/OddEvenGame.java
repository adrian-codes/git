import java.util.Scanner;

public class OddEvenGame {
public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in );
		int user;
		double randomNum;
		int wins = 0;
		int losses = 0;
		boolean play = true;
		int playAgain;
		double number;
		
		RandomNumberGenerator myRandomNumberGenerator = new RandomNumberGenerator();
		
		 do {
		
		
		System.out.print("Guess if the number is odd or even. Input Nuymber 1 for even 2 for odd: ");
		user = input.nextInt();
		
		randomNum = myRandomNumberGenerator.genRandomNum();
		
		if (randomNum % 2 == 0) {
			if (user == 1) {
				System.out.println(" You guessed right the number is even");
				wins++;
			}
				else {
					System.out.println(" You guessed wrong the number is even");
					losses++;
				}
		}
			
			else if (randomNum % 2 != 0) {  
				if (user == 2) {
				System.out.println(" You guessed right the number is odd");
				wins++;
				}
				else {
					System.out.println(" You guessed wrong the number is odd");
					losses++;
				}
			}
		
		System.out.println("Total wins = " + wins);
		System.out.println("Total losses = " +losses);
		
		System.out.println("Do you still wish to play? 1 = yes, 2 = no"); 
		playAgain = input.nextInt();
		
		if (playAgain == 1) {
			play = true;
		}
		else 
			play = false;
		}
		 while(play == true);
	} 
}
