import java.util.Scanner; 

public class DiceHiLoGame {
	public static void main(String[] args){

	int userGuess;
	int diceValue; 
	int throwsOfDice = 0;
	boolean play = true;
	int playAgain;
	
	
	
	//three dice objects	
		Scanner input = new Scanner(System.in);
		Dice throwDice1 = new Dice();
		Dice throwDice2 = new Dice();
		Dice throwDice3 = new Dice();
		
		do {
			
			System.out.println("Guess if the one dice is high or lo? 1-3 is low, 4-6 is hi. ");
			userGuess = input.nextInt();
		
			
			
			//using single dice
			if (throwDice1.getThrowDice1() <=3){
				
				if (userGuess <=3) {
					System.out.println(" You guessed right the dice value is:" + throwDice1.getThrowDice1());
					
				}
					else {
						System.out.println(" You guessed wrong dice value is: " + throwDice1.getThrowDice1());
					
					}
			}
				
				else if (throwDice1.getThrowDice1() >= 4) {  
					if (userGuess >= 4) {
					System.out.println(" You guessed right the dice value is:" + throwDice1.getThrowDice1());
					}
					else {
						System.out.println(" You guessed wrong dice value is: " + throwDice1.getThrowDice1());
						throwsOfDice++;
						//prints how many throws
						System.out.println("Total throws of dice is:" + throwsOfDice);
						
					}
				}
			
			System.out.print("Guess if the one dice is high or lo? 1-6 is low, 7-12 is hi. ");
			userGuess = input.nextInt();
			
			//using double dice
			//uses get method to retrieve dice value from object
			if (throwDice2.getThrowDice2() <=6){
				
				if (userGuess <=6) {
					System.out.println(" You guessed right the dice value is:" + throwDice2.getThrowDice2());
					
				}
					else {
						System.out.println(" You guessed wrong dice value is: " + throwDice2.getThrowDice2());
					
					}
			}
				
				else if (throwDice2.getThrowDice2() >= 7) {  
					if (userGuess >= 7) {
					System.out.println(" You guessed right the dice value is:" + throwDice2.getThrowDice2());
					}
					else {
						System.out.println(" You guessed wrong dice value is: " + throwDice2.getThrowDice2());
						throwsOfDice++;
						System.out.println("Total throws of dice is:" + throwsOfDice);
						
					}
				}
			
			System.out.print("Guess if the one dice is high or lo? 1-9 is low, 10-18 is hi. ");
			userGuess = input.nextInt();
			
			//using triple dice
			if (throwDice1.getThrowDice3() <=9){
				
				if (userGuess <=9) {
					System.out.println(" You guessed right the dice value is:" + throwDice3.getThrowDice3());
					
				}
					else {
						System.out.println(" You guessed wrong dice value is: " + throwDice3.getThrowDice3());
					
					}
			}
				
				else if (throwDice1.getThrowDice3() >= 10) {  
					if (userGuess >= 10) {
					System.out.println(" You guessed right the dice value is:" + throwDice3.getThrowDice3());
					}
					else {
						System.out.println(" You guessed wrong dice value is: " + throwDice3.getThrowDice3());
						throwsOfDice++;
						System.out.println("Total throws of dice is:" + throwsOfDice);
						
					}
				}
			
			System.out.println("Do you still wish to keep playing? 1 = keep playing, 2 = quit"); 
			playAgain = input.nextInt();
			
			if (playAgain == 1) {
				play = true;
			}
			else {
				play = false;
			}
		}
			 while(play == true);
		 
	}
}
	
