package com.kodilla;

import com.kodilla.board.Board;
import javafx.scene.layout.GridPane;

public class Game {

    private Board board;
    private GridPane gridPane;

    public Game(Board board, GridPane gridPane) {
        this.board = board;
        this.gridPane = gridPane;
    }


    public void showBoard() {
    }
}
