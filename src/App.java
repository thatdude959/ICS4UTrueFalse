import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        
        int startGame = JOptionPane.showConfirmDialog(null, "Ready to play!", null, 0);
         //For some reason YES = 0 NO = 1

        //closes program if user does not want to play
        if (startGame == 1) {
            JOptionPane.showMessageDialog(null, "Goodbye!");
            System.exit(0);
        }
        //askes questions and restarts if wrong
        while (true) {
            while (true) { 
                //asks a set of 5 true of false qestions restarting if the user gets it wrong
                if (AskQustion("1+1=2", 0) == false) break;
                if (AskQustion("Apples Are A Fruit", 0) == false) break;
                if (AskQustion("Bats are blind", 1) == false) break;
                if (AskQustion("The blue whale is the biggest animal to have ever lived", 0) == false) break;
                if (AskQustion("Taste buds can only be found on the tongue", 1) == false) break;
                JOptionPane.showMessageDialog(null, "You Win!");
                //starts the number guessing game
                GuessNumber.GuessTheNumber();
            }

            int restart = JOptionPane.showConfirmDialog(null, "Wrong answer\n Want To Retry?", null, 0);
            //quits if user does not want to play again
            if (restart == 1) {
                JOptionPane.showMessageDialog(null, "Goodbye!");
                System.exit(0);
            }
        }
    }
    //function to ask questions and return if there correct of not
    public static Boolean AskQustion(String message, int trueFalse){
        String[] options = {"True", "False"};
        int question = JOptionPane.showOptionDialog(null, message, null, 0, 0, null, options, null);
        return (question == trueFalse);
    }
}
