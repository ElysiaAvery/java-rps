import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

class RockPaperScissors {

  public String checkWinner(String _playerOneMove, String _playerTwoMove){
    String[] playerShow = {"rock", "paper", "scissors"};
    String[] playerToBeat = {"scissors", "rock", "paper"};

    if(Arrays.asList(playerShow).indexOf(_playerOneMove) == Arrays.asList(playerToBeat).indexOf(_playerTwoMove)){
      return "Player One Wins!";
    }else if(Arrays.asList(playerShow).indexOf(_playerTwoMove) == Arrays.asList(playerToBeat).indexOf(_playerOneMove)){
      return "Player Two Wins!";
    }else{
      return "Nobody wins! Everyone cries!";
    }
  }
}
