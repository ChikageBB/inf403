package ru.itis.inf403.lab10.model;

import java.util.Random;

public class Grig extends Entity{

    public Grig() {}

    public Grig(int x, int y) {
        super("Кузнечик", x, y);
    }

    @Override
    public void move(){
        Random r = new Random();
        int direction = r.nextInt(4);

        switch (direction){
            case 0:
                if (y > 0){
                    y -= 2;
                }
                break;
            case 1:
                if (x < fieldWidth){
                    x += 2;
                }
                break;
            case 2:
                if (y < fieldHeight){
                    y += 2;
                }
                break;
            case 3:
                if (x > 0){
                    x -= 2;
                }
                break;
        }
    }
}
