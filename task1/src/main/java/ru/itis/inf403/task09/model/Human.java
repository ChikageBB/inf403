package ru.itis.inf403.task09.model;

import com.sun.source.tree.ProvidesTree;

public class Human extends Entity{
    protected int HP = 100;
    protected int DAMAGE = 10;

    public Human(){}

    public Human(String name,int age){
        super(name, age);
    }

    @Override
    public void printInfo(){
        if (this.HP > 0) {
            System.out.println("Human | " + name + " | " + age + " | " + HP + " HP | " + DAMAGE + " DAMAGE");
        }else{
            System.out.println("Human | " + name + " | dead");
        }
    }


    public void attack(Entity e){
        e.HP -= this.DAMAGE;
    }

    private int getHP(){
        return HP;
    }

    private int getDAMAGE(){
        return DAMAGE;
    }

    private void setHP(int HP){
        this.HP = HP;
    }
    private void setDAMAGE(int DAMAGE){
        this.DAMAGE = DAMAGE;
    }


}
