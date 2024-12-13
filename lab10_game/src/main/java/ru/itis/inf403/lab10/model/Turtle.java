package ru.itis.inf403.lab10.model;

import java.util.*;

public class Turtle extends Entity {

    public Turtle() {}

    public Turtle(int x, int y){
        super("Черепаха", x, y);
    }

    @Override
    public void move(){
        Random r = new Random();
        int direction = r.nextInt(4);

        switch (direction){
            case 0:
                if (y > 0 && x < fieldWidth){
                    ++x;
                    --y;
                }
                break;
            case 1:
                if (y < fieldHeight && x < fieldWidth){
                    ++y;
                    ++x;

                }
                break;
            case 2:
                if (x > 0 && y < fieldHeight){
                    --x;
                    ++y;
                }
                break;
            case 3:
                if (x > 0 && y > 0){
                    --x;
                    --y;
                }
                break;
        }
    }
}
