package ru.itis.inf403.lab18.model;

public class CalculateIntegralTrapezium extends CalculateIntegral{


    public CalculateIntegralTrapezium(double a, double b, Function f){ super(a, b, f);}

    public double get(){
        return (function.calculate(a) + function.calculate(b)) / 2 * (b - a);
    }
}
