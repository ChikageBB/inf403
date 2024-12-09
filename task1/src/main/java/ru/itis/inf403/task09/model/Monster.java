package ru.itis.inf403.task09.model;

public class Monster extends Entity{
    protected int HP = 80;
    protected int DAMAGE = 25;

    public Monster(String name, int age){
        super(name, age);
    }

    public void attack(Entity e){
        if (e.ARMOR > 0){
            e.ARMOR -= this.DAMAGE;
        }else {
            e.HP -= this.DAMAGE;
        }
    }

    @Override
    public void printInfo(){
        System.out.println("Monster | " + name + " | " + HP + " HP | " + DAMAGE + " DAMAGE");
    }

}
