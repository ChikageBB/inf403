package ru.itis.inf403.lab18.model;

public class CalculateIntegralMiddle extends CalculateIntegral{
    public CalculateIntegralMiddle(double a, double b, Function f){ super(a, b, f);}


    public double get(){
        return (b - a) * function.calculate((b - a) / 2);
    }

}
