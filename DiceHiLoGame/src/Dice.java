
public class Dice {

		private int diceValue;
		
		
		
		public void setThrowDice1(){
			
			diceValue = 1 + (int) (Math.random() * 6);
		}
		public int getThrowDice1(){
			return diceValue;
		}
		
		public void setThrowDice2(){
			diceValue = (1 + (int) (Math.random() * 6)) + (1 + (int) (Math.random() * 6));
		}
		public int getThrowDice2(){
			return diceValue;
		}
		
		public void setThrowDice3(){
			diceValue = (1 + (int) (Math.random() * 6)) + (1 + (int) (Math.random() * 6)) + (1 + (int) (Math.random() * 6));
		}
		public int getThrowDice3(){
			return diceValue;
		}
	}
