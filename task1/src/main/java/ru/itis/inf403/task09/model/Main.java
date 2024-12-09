package ru.itis.inf403.task09.model;

public class Main {
    public static void main(String[] args) {

        Warrior p1 = new Warrior("Geralt", 34);
        Wizard p2 = new Wizard("Triss", 25);

        p1.printInfo();
        p2.printInfo();

        p1.attack(p2);
        p2.printInfo();
    }
}
