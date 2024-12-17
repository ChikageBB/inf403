package ru.itis.inf403.lab12.model;

public class Apple implements CanCompare{
    private String color;
    private double weight;

    public Apple(String color, double weight){
        this.color = color;
        this.weight = weight;
    }

    public int compare(CanCompare obj){
        Apple apple = (Apple) obj;

        if (this.color == apple.color && this.weight == weight){
            return 0;
        }else if (this.weight > apple.weight){
            return 1;
        }return -1;
    }



    @Override
    public String toString(){
        return "Apple | " + color + " | " + weight;
    }
}
