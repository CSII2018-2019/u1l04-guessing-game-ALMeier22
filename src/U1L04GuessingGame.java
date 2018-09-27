import javax.swing.JOptionPane;

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

		// computer picks random number 
		int computerNum = (int)(Math.random()* 100) + 1;
		
		int num = -1;
		int guesses = 0;
		// printer computers number
		System.out.println("Computers number:  " + computerNum);
		
		do {
			// user inputs guess
			String guess = JOptionPane.showInputDialog("Take A Guess between 1 - 100");
			num = Integer.parseInt(guess);
			
			if (num > 0 && num <= 100) {
				guesses++;
				
			
				// too high
				if (num > computerNum) {
					JOptionPane.showMessageDialog(null,"Too High !!");
				}
				
				// to low 
				else if (num < computerNum) {
					JOptionPane.showMessageDialog(null,"Too Low !!");
				}
			}
				//if user goes out of the 1-100  
				else {
					JOptionPane.showMessageDialog(null,"Please pick a number between 1 and 100");
				}
		}while (num != computerNum || num == -1);
		if (num == -1); 
		
	}
}
