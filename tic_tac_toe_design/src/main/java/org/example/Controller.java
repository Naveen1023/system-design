package org.example;

import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Controller {
  public static void main(String[] args) {
    System.out.println("Welcome to TIC TAC TOE !!!!!!");

    Player p1 = new Player("naveen", SymbolType.Symbol_X);
    Player p2 = new Player("computer", SymbolType.Symbol_Y);

    TicTacToeGame game1 = new TicTacToeGame(Arrays.asList(p1, p2), 2);


    Scanner scan = new Scanner(System.in);

    System.out.println(p1.name+" playing with "+p1.playingSymbol.label);
    System.out.println(p2.name+" playing with "+p2.playingSymbol.label);

    System.out.println("Press 1 to start the GAME....");
    int startGame = scan.nextInt();
    if(startGame != 1) System.exit(0);


    System.out.println("GAME STARTED.....");
    game1.startGame();

  }
}
