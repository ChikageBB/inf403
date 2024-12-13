package ru.itis.inf403.lab10;
import ru.itis.inf403.lab10.model.*;

public class Main {
    public static void main(String[] args) {

        int fieldWidth = 1000;
        int fieldHeigth = 1000;
        int finishFieldWight = 10;
        int finishFieldHeight = 10;
        int finishX = 495;
        int finishY = 495;

        Entity[] entities = new Entity[]{new Ant(0, 0),
                                         new Grig(0, 0),
                                         new Turtle(0, 0),
                                         new Something(0, 0)};

        Entity.setFieldSize(fieldWidth, fieldHeigth);

        Game game = new Game(fieldWidth, fieldHeigth,
               finishFieldWight, finishFieldHeight,
               finishX, finishY, entities);
        Entity champion = game.start();
        System.out.println(champion);
    }
}