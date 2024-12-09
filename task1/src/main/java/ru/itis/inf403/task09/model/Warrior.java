package ru.itis.inf403.task09.model;

public class Warrior extends Human{
    protected int HP = 200;
    protected int ARMOR = 100;
    protected int DAMAGE = 25;

    public Warrior(){}



    public Warrior(String name, int age){
        super(name, age);
    }

    @Override
    public void attack(Entity e){
        if (e.ARMOR > 0){
            e.ARMOR -= this.DAMAGE;
        }else{
            e.HP -= this.DAMAGE;
        }
    }

    public void printInfo() {
        if (this.HP > 0) {
            System.out.println("Warrior | " + name + " | " + age + " | " + HP + " HP | " + DAMAGE + " DAMAGE | " + ARMOR + " ARMOR");
        }else{
            System.out.println("Warrior | " + name + " | " + "dead");
        }
    }
}
