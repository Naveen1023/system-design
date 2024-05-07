package org.example;

import java.util.*;

public class TicTacToeGame {

  /*
   * 1. Create Players, choose playing symbol
   * 2. Choose Board with size
   * 3. Player can make move..
   * 4. End the game => if some player wins OR no possible move OR tie
   * */

  Deque<Player> players;
  Board board;
  Scanner scan;

  TicTacToeGame(List<Player> players, int size) {
    scan = new Scanner(System.in);
    initializeGame(players, size);
  }

  public void initializeGame(List<Player> playersList, int size) {
    board = new Board(size);

    players = new ArrayDeque<>();
    for (Player player : playersList) players.addLast(player);
  }


  public void startGame() {
    int moves = board.size * board.size;

    while (moves-- > 0) {
      Player currPlayer = players.removeFirst();
      System.out.println(currPlayer.name + " -> it's your turn, Choose i,j");
      int i = scan.nextInt();
      int j = scan.nextInt();

      board.cells[i][j] = new Cell(currPlayer.playingSymbol);

      System.out.println("i = " + i + ", j = " + j + " cells[i][j] = " + board.cells[i][j].symbol.label);


      if (checkWinner(currPlayer) == true) {
        System.out.println("WINNER is : " + currPlayer.name);
        return;
      }
      players.addLast(currPlayer);
    }
    System.out.println("NO further MOVES, SLATEMATE !!!!!!!");
  }


  public boolean checkWinner(Player player) {

    // check row-wise if player symbol occurs at all the places in that row
    for (int row = 0; row < board.size; row++) {
      int occurance = 0;
      for (int col = 0; col < board.size; col++) {
        if (board.cells[row][col] != null && board.cells[row][col].symbol.label.equals(player.playingSymbol.label)) {
          occurance++;
        }
      }
      if (occurance == board.size) return true;
    }

    // Check Column-wise
    for (int col = 0; col < board.size; col++) {
      int occurance = 0;
      for (int row = 0; row < board.size; row++) {
        if (board.cells[row][col] != null && board.cells[row][col].symbol.label.equals(player.playingSymbol.label)) {
          occurance++;
        }
      }
      if (occurance == board.size) return true;
    }

    // check Diagonal-wise left to right
    int count = 0;
    for(int row=0,col = 0;row<board.size; row++){
      if (board.cells[row][col] != null && board.cells[row][col].symbol.label.equals(player.playingSymbol.label)) {
        count++;
      }
      col++;
    }
    if (count == board.size) return true;
    else count = 0;

    // check Diagonal-wise right to left
    for(int row=0,col = board.size-1;row<board.size; row++){
      if (board.cells[row][col] != null && board.cells[row][col].symbol.label.equals(player.playingSymbol.label)) {
        count++;
      }
      col--;
    }
    if (count == board.size) return true;

    return false;
  }

}
