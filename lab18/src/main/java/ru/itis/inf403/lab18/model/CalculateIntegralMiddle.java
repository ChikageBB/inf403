package ru.itis.inf403.lab18.model;

public class CalculateIntegralMiddle extends CalculateIntegral{
    public CalculateIntegralMiddle(double a, double b, Function f){ super(a, b, f);}
    public static final int H = 1000;


    public double get(){
        double s = 0;

        double h = (b - a) / H;

        for (int i = 0; i < H; ++i){
            s += h * function.calculate(a + h * (i + 0.5));
        }


//        return (b - a) * function.calculate((b - a) / 2);
        return s;
    }

}
