import java.util.Scanner;

//play the game
public class Tester{

    public static void main(String [] args){
        Board board = new Board();

        //PLAYER ONE
        System.out.println("First Player: Choose a number 0-9");
        Scanner scan = new Scanner(System.in);
        int correctGuess = scan.nextInt();
        board.setCorrectGuess(correctGuess);

        //PLAYER TWO
        int playerGuess;
        boolean gameOver = false;
        while(!gameOver) 
        {

            System.out.println("Second Player: Guess a number 0-9");
            playerGuess = scan.nextInt();

            if (board.getAlreadyGuessed(playerGuess)){
                System.out.println("You already guessed that!");
                continue;
            }
           
            board.setAlreadyGuessed(playerGuess); 

            if (playerGuess == board.getCorrectGuess()){
                System.out.println("You are correct!");
                gameOver = true;
            } 
            else if (playerGuess < board.getCorrectGuess()){
                System.out.println("Your guess is too low");
            }
            else{
                System.out.println("Your guess is too high");
            }
        }
    }
}
