package ru.itis.inf403.lab18.model;

public class CalculateIntegralLeft extends CalculateIntegral{
    private static final int N = 1000;
    public CalculateIntegralLeft(double a, double b, Function f){
        super(a, b, f);
    }



    public double get(){
        double s = 0;
        double h = (b - a) / N;

        for (int i = 0; i < N; ++i){
            s += h * function.calculate(a + h * i);
        }


        return s;
    }
}
