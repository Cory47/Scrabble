package com.example.scrabble;

public class Tile {
    //define variables
    private String letter;
    private int isInDeck;
    private boolean isOnBoard;
    private int points;

    public Tile(String l, int p){
        letter = l;
        points = p;

        isInDeck = 0;
        isOnBoard = false;
    }
}
