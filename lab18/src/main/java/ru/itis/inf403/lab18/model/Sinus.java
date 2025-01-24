package ru.itis.inf403.lab18.model;

public class Sinus implements Function{
    @Override
    public double calculate(double x) {
        return Math.sin(x);
    }
}
