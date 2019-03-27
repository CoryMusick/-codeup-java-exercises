import java.sql.SQLOutput;
import java.util.Scanner;
public class HighLow {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int remainingGuesses = 10;
        int targetNumber = (int) (Math.random()* 100) + 1;


        while(remainingGuesses > 0){
            System.out.printf("Guess a number between 1 - 100, you have %d guesses left%n",remainingGuesses);
            remainingGuesses--;
            int guess = scanner.nextInt();
            if(guess > 100 || guess < 1){
                System.out.println("Invalid Guess!");
            }else if(guess > targetNumber){
                System.out.println("LOWER");
            }else if(guess < targetNumber){
                System.out.println("HIGHER");
        }else {
                System.out.println("YOU GOT IT!");
                System.out.println("Would you like to play again");
                scanner.nextLine();
                String again = scanner.nextLine();
                if (again.equalsIgnoreCase("yes") || again.equalsIgnoreCase("y")) {
                    targetNumber = (int) (Math.random()* 100) + 1;
                    remainingGuesses = 10;
                } else {
                    remainingGuesses = 0;
                }
            }
        }
        System.out.println("Thanks for playing!");
    }
}
