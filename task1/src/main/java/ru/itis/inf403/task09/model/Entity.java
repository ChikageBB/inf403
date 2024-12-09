package ru.itis.inf403.task09.model;

public class Entity {
    protected String name;
    protected int age;
    protected int HP = 10;
    protected int ARMOR = 0;

    public Entity() {}

    public Entity(String name, int age){
        this.name = name;
        this.age = age;
    }


    public void printInfo(){
        System.out.println(name + " | " + "age = " + age);
    }
}
