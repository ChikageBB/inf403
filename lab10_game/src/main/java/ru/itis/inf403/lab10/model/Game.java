package ru.itis.inf403.lab10.model;

public class Game {
    private int fieldWidth;
    private int fieldHeight;
    private Entity[] players;
    private int fieldFinishWidth;
    private int fieldFinishHeight;
    private int finishX;
    private int finishY;


    public Game() {}

    public Game(int fieldWidth, int fieldHeight,int fieldFinishWidth, int fieldFinishHeight, int finishX, int finishY, Entity[] players) {
        this.fieldWidth = fieldWidth;
        this.fieldHeight = fieldHeight;
        this.fieldFinishWidth = fieldFinishWidth;
        this.fieldFinishHeight = fieldFinishHeight;
        this.finishX = finishX;
        this.finishY = finishY;
        this.players = players;
    }

    public Entity start() {
        while(true) {
            for (int i = 0; i < players.length; i++) {
                players[i].move();
            }

            for (int i = 0; i < players.length; i++) {
                if (players[i].getX() >= finishX && players[i].getX() <= finishX + fieldFinishWidth
                        && players[i].getY() >= finishY
                        && players[i].getY() <= finishY + fieldFinishHeight){

                    return players[i];
                }
            }
        }
    }
}


