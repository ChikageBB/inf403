package ru.itis.inf403.task09.model;

public class Vampire extends Entity{
    protected int HP = 115;
    protected int ARMOR = 30;
    protected int DAMAGE = 15;


    public Vampire(){}

    public Vampire(String name, int age){
        super(name, age);
    }

    public void stealHealth(Entity e){
        if (this.HP < 115){
            this.HP += 15;
            e.HP -= 15;
        }
    }

    public void attack(Entity e){
        if (e.ARMOR > 0){
            e.ARMOR -= this.DAMAGE;
        }else{
            e.HP -= this.DAMAGE;
        }
    }

    @Override
    public void printInfo(){
        System.out.println("Vampire | " + name + " | " + age + " | " + HP + " HP | " + DAMAGE + " DAMAGE | " + ARMOR + " ARMOR");
    }
}
