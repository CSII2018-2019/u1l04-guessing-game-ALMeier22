
public class U1L04GuessingGame {

	public static void main(String[] args) {
		
		//int computerNum = (int)(Math.random()* 100) + 1;
		//do.. while loop  
			//ask for user input “take a guess”
					// convert to integer 
			//if statement (num > computerNum) for too high 
			//else if too low (num < computerNum)
			//else number not in range 
			//while loop for how many attempts after correctly 
			//else how many attempts if incorrectly

		
		int computerNum = (int)(Math.random()* 100) + 1;
		int guesses = 0;
		int num = -1;

		do {
			String guess = JOptionPane.showInputDialog("Take A Guess");
			num = Integer.parseInt(guess);
			
			
		} while (num != computerNum || num == -1);

	}

}
