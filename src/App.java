import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        Boolean restart;
        int startGame = JOptionPane.showConfirmDialog(null, "Ready to play!", null, 0);
         //For some reason YES = 0 NO = 1

        //closes program if user does not want to play
        if (startGame == 1) {
            JOptionPane.showMessageDialog(null, "Goodbye!");
            System. exit(0);
        }
        
        while (true) {
            restart = AskQustion("Does 1+1=2", true);
            
        }
    }
    //creating a function to ask questions and return if there correct of not
    public static Boolean AskQustion(String message, Boolean trueFalse){
        Boolean answer;
        int question = JOptionPane.showOptionDialog(null, message, null, 0, 0, null, null, null);
        if (question == 0) answer = true;
        if (question == 1) answer = false;

        if (answer = trueFalse) {
            return(true);
        }
        else return(false);
    }
}
