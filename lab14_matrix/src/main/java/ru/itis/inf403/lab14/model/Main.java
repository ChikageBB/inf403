package ru.itis.inf403.lab14.model;

public class Main {
    public static void main(String[] args) {

        Matrix matrix = new Matrix(new LAVector[]{
                new LAVector(new double[]{2, 0, 6}),
                new LAVector(new double[]{8, 1, -4}),
                new LAVector(new double[]{0, 5, 7})
        });

        LAVector vector = new LAVector(new double[]{2, 5, -3});

        Matrix matrix1 = matrix.multRVector(vector);
        matrix1.print();
    }
}
