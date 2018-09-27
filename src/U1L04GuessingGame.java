import javax.swing.JOptionPane;

public class U1L04GuessingGame {

	public static void main(String[] args) {
		
		// computer picks random number 
		int computerNum = (int)(Math.random()* 100) + 1;
		
		int num = -1;
		int guesses = 0;
		// printer computers number
		// System.out.println("Computers number:  " + computerNum);
		
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
				// too low 
				else if (num < computerNum) {
					JOptionPane.showMessageDialog(null,"Too Low !!");
					}
				}
				//if user goes out of the 1-100  
				else {
					JOptionPane.showMessageDialog(null,"Please pick a number between 1 and 100");
					}
		}while (num != computerNum || num == -1);
			
		if (num == 0) {
		
		// number attempts after giving up
		JOptionPane.showMessageDialog(null,"You gave up after " + guesses + "attempts :-(");
		}
		// number f attempts after guessing correctly 
		else {
			JOptionPane.showMessageDialog(null, "You guessed it in " + guesses + " attempts :-)");
					
			}
	}
}
