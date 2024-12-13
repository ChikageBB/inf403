package ru.itis.inf403.lab10.model;

import java.util.Random;

public class Something extends Entity {
    
    public Something() {}

    public Something(int x, int y) {
        super("Нечто", x, y);
    }

    @Override
    public void move(){
        Random r = new Random();
        int direction = r.nextInt(4);
        int step;

        switch (direction){
            case 0:
                step = r.nextInt(3);
                if (y - step  > 0){
                    y -= step;
                }
                break;
            case 1:
                step = r.nextInt(3);
                if (x + step < fieldWidth){
                    x += step;
                }
                break;
            case 2:
                step = r.nextInt(3);
                if (y + step < fieldHeight) {
                    y += step;
                }
                break;
            case 3:
                step = r.nextInt(3);
                if (x - step > 0){
                    x -= step;
                }
                break;
        }

    }
}
