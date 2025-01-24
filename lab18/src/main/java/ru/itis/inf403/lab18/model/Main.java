package ru.itis.inf403.lab18.model;

public class Main {
    public static void main(String[] args) {

        CalculateIntegralLeft calculateIntegralLeft = new CalculateIntegralLeft(0, Math.PI, new Sinus());
        System.out.println(calculateIntegralLeft.get());

        System.out.println("-------------");

        CalculateIntegralMiddle calculateIntegralMiddle = new CalculateIntegralMiddle(0, Math.PI, new Sinus());
        System.out.println(calculateIntegralMiddle.get());

        System.out.println("-------------");

        CalculateIntegralRight calculateIntegralRight = new CalculateIntegralRight(0, Math.PI, new Sinus());
        System.out.println(calculateIntegralRight.get());

        System.out.println("-------------");

        CalculateIntegralTrapezium calculateIntegralTrapezium = new CalculateIntegralTrapezium(0, Math.PI, new Sinus());
        System.out.println(calculateIntegralTrapezium.get());
    }
}
