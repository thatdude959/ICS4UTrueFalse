import javax.swing.JOptionPane;
import java.util.Random;

public class GuessNumber {
    public static void GuessTheNumber() {
        while (true) {
            int attempts = 1;      
            //generating a random int from 1-100
            Random rand = new Random();
            int randomInt = rand.nextInt(100) + 1;

            int userGuess = Integer.parseInt(JOptionPane.showInputDialog("Guess A Number From 1-100"));

            while (true) {
                if (userGuess == randomInt) break;

                else if (userGuess < randomInt) {
                    userGuess = Integer.parseInt(JOptionPane.showInputDialog("The number is higher than " +userGuess));
                    attempts++;
                }

                else{
                    userGuess = Integer.parseInt(JOptionPane.showInputDialog("The number is lower than " +userGuess));
                    attempts++;
                }
            }
            
            String winmessage = ("You Won in  " +attempts);
            int restart = JOptionPane.showConfirmDialog(null, winmessage + " Tries!\n Want To Play Again?", null, 0);
            //quits if user does not want to play again
            if (restart == 1) {
                JOptionPane.showMessageDialog(null, "Goodbye!");
                System. exit(0);
            }  
        }
    }  
}
