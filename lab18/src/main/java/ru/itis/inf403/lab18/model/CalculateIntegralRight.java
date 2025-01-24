package ru.itis.inf403.lab18.model;

public class CalculateIntegralRight extends CalculateIntegral{
    private static final int N = 1000;
    public CalculateIntegralRight(double a, double b, Function f){ super(a, b, f);}


    @Override
    public double get(){
        double s = 0;
        double h = (b - a) / N;

        for (int i = N; i > 0; --i){
            s += h * function.calculate(b - h * i);
        }
        return s;
    }
}
