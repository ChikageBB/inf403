package ru.itis.inf403.lab16.model;
import java.util.*;


public class Car {

    public boolean isBroken = false;
    public int crew = 2;
    public int seat = 5;


    public void check(double probability) throws Exception{
        if (new Random().nextInt(100) <= probability){
            isBroken = true;
            throw new Exception("Автомобиль сломался");
        }
    }



}
