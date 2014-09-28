import java.util.Scanner;
import java.util.Random;

public class PaperScissorsRock {
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		
		int userChoice;
		int computerChoice;
		
		System.out.println("Let's play Rock, Paper, Scissors! (0 = Rock, 1 = Paper, 2 = Scissors)");
		userChoice = scanner.nextInt();
		computerChoice = random.nextInt(3);
		
		//Both choose same choice
		if (userChoice == computerChoice) {
			if (userChoice == 0) {
				System.out.println("Both players chose rock!");
			}
			else if (userChoice == 1) {
				System.out.println("Both players chose paper!");
			}
			else {
				System.out.println("Both players chose scissors!");
			}
			return;
		}
		
		//user chooses rock
		if (userChoice == 0) {
			if(computerChoice == 1) {
				System.out.println("You chose rock and computer chose paper. Computer wins!");
			}
			else {
				System.out.println("You chose rock and computer chose scissors. You win!");
			}
		}
			//user chooses paper
			else if (userChoice == 1) {
				if(computerChoice == 0) {
					System.out.println("You chose paper and computer chose rock. You win!");
				}
				else {
					System.out.println("You chose paper and computer chose scissors. You lose!");
				}
			}
		
			//user chooses scissors
			else {
				if(computerChoice == 0) {
					System.out.println("You chose scissors and computer chose rock. You lose!");
				}
				else {
					System.out.println("You chose scissors and computer chose paper. You win!");
				}
			}
		}
	}
