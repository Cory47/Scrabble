package com.example.scrabble;

import java.util.ArrayList;
import java.util.Random;

public class Bag {
    private ArrayList<Tile> tiles;
    private Random rnd;

    public Bag (){
        tiles = new ArrayList<>();
        rnd = new Random();
    }

    public void put(Tile newTile){
        tiles.add(newTile);
    }

    public Tile get(){
        int index = rnd.nextInt(tiles.size());
        Tile temp = tiles.get(index);
        tiles.remove(index);
        return temp;
    }
}
