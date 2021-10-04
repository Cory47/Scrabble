package com.example.scrabble;

import android.graphics.Canvas;
import android.graphics.Paint;

public class BoardSpace {
    //define variables
    private float cx, cy;
    private float height, width;
    private Tile tile;
    private int multiplier;
    private int border;
    private Paint tileColor;
    private Paint letterColor;


    public BoardSpace(float x, float y, float h, float w, int mult){
        cx = x;
        cy = y;
        height = h;
        width = w;
        tile = null;
        multiplier = mult;
        border = 10;

        //set up Paint Colors
        tileColor = new Paint();
        tileColor.setARGB(255, 255, 211, 181);
        letterColor = new Paint();
        letterColor.setARGB(255, 0,0,0);
    }

    public void draw(Canvas canvas){
        if (tile != null){
            canvas.drawRect((cx - width/2) + border,
                    (cy - height/2) + border,
                    (cx + width/2) - border,
                    (cy + height/2) - border,
                    tileColor);
            //draw the letter for the tile
            //canvas.drawText(""+ value,
            // (cx - width/2) + border,
            // (cy + height/2) - border,
            // secondaryColor);
        }
    }
}
