package org.example;

public class Board {
  int size;
  Cell[][] cells;


  Board(int size) {
    this.size = size;
    this.cells = new Cell[size][size];
  }
}
