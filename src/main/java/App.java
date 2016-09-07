import java.io.Console;
import java.util.Random;

public class App {
  public static void main(String[] args) {
    Console myConsole = System.console();
    Random ranGen = new Random();

    RockPaperScissors currentGame = new RockPaperScissors();
    String[] possibleMoves = {"rock", "paper", "scissors"};
    String computerMove = possibleMoves[ranGen.nextInt(3)];

    System.out.println("Player 1, Enter your move:");
    String playerOneMove = myConsole.readLine().toLowerCase();
    System.out.println("Computer throws: " + computerMove);
    // String playerTwoMove = myConsole.readLine().toLowerCase();


    System.out.println(currentGame.checkWinner(playerOneMove, computerMove));
  }
}
