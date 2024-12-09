package ru.itis.inf403.task09.model;

public class Wizard extends Human{
    private int HP = 120;
    private int MANA = 100;
    private int DAMAGE = 20;
    private int ARMOR = 50;

    public Wizard(){}

    public Wizard(String name, int age){
        super(name, age);
    }

    @Override
    public void attack(Entity e){
        if (this.MANA > 0){
            if (e.ARMOR > 0){
                e.ARMOR -= this.DAMAGE;
                this.MANA -= 10;
            }else{
                e.HP -= this.DAMAGE;
                this.MANA -=10;
            }
        }
    }

    public void drinkPotionOfMana(){
        this.MANA = 100;
    }

    @Override
    public void printInfo(){
        if (this.HP > 0) {
            System.out.println("Human | " + name + " | " + age + " | " + HP + " HP | " + DAMAGE + " DAMAGE | " + ARMOR + " ARMOR | " + MANA + " MANA ");
        }else{
            System.out.println("Human | " + name + " | dead");
        }
    }
}
