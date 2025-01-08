package ru.itis.inf403.lab14.model;

public class Matrix {
    private double[][] components;

    public Matrix(double[][] components){
        this.components = components;
    }

    public Matrix(LAVector[] rows){
        components = new double[rows.length][rows[0].lenght()];
        for (int i = 0; i < rows.length; i++){
            for (int j = 0; j < rows[i].lenght(); j++){
                components[i][j] = rows[i].get(j);
            }
        }
    }
    public Matrix(int rows, int columns){
        components = new double[rows][columns];
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < columns; j++){
                components[i][j] = 0;
            }
        }
    }
    public Matrix(int size, double diagElement){
        components = new double[size][size];

        for (int i = 0; i < size; i++){
            for (int j = i; j < size - 1; j++){
                components[i][j] = diagElement;
            }
        }
    }

    public void print(){
        for (int i = 0; i < components.length; i++){
            for (int j = 0; j < components[i].length; j++){
                System.out.print(components[i][j] + " ");
            }
            System.out.println();
        }
    }

    public int rows(){
        return this.components.length;
    }

    public int columns(){
        return this.components[1].length;
    }
//
//    public Matrix transp(){
//        if (this.components.length != this.components[1].length){
//            throw new IndexOutOfBoundsException("Нельзя транспонировать матрицу");
//        }
//
//            for (int i = 0; i < this.components.length; i++) {
//                for (int j = i + 1; j < this.components[i].length; j++) {
//                    double temp = components[i][j];
//                    components[i][j] = components[j][i];
//                    components[j][i] = temp;
//                }
//            }
//            return this;
//    }
    public Matrix transp(){
        Matrix transpMatrix = new Matrix(this.columns(), this.rows());

        for (int i = 0; i < transpMatrix.rows(); i++){
            for (int j = 0; j < transpMatrix.columns(); j++){
                transpMatrix.components[i][j] = this.components[j][i];
            }
        }
        return transpMatrix;
    }

    public Matrix multLVector(LAVector vector){
        if (vector.lenght() != this.rows()){
            throw new IllegalArgumentException("Размерность вектора не совпадает с числом строк матрицы");
        }

        Matrix newMatrix = new Matrix(1, this.columns());

        for (int i = 0; i < this.columns(); i++){
            for (int j = 0; j < this.rows(); j++){
                newMatrix.components[0][i] += vector.get(j) * this.components[j][i];
            }
        }
        return newMatrix;
    }

    public Matrix multRVector(LAVector vector){
        if (this.columns() != vector.lenght()) {
            throw new IllegalArgumentException("Размерность вектора не совпадает с числом строк матрицы");
        }
        Matrix newMatrix = new Matrix(this.rows(), 1);
        for (int i = 0; i < this.rows(); i++){
            for (int j = 0; j < this.columns(); j++){
                newMatrix.components[i][0] += this.components[i][j] * vector.get(j);
            }
        }
        return newMatrix;
    }

    public double det(){
        double det = 1;
        int swaps = 0;
        // 1 2 3
        // 4 5 2
        // 5 1 2
        for (int i = 0; i < this.components.length; i++){
            int maxRow = i;

            for (int j = i + 1; j < this.components.length; j++){
                if (Math.abs(components[j][i]) > Math.abs(components[maxRow][i])){
                    maxRow = j;
                }
            }

            if (components[i][i] == 0){
                return 0.0;
            }

            if (i != maxRow) {
                double[] temp = components[i];
                components[i] = components[maxRow];
                components[maxRow] = temp;
                swaps++;
            }


        // 1 2 3    5 1 2     5  1    2       5 1 2    5 1 2
        // 4 5 2 -> 4 5 2 ->  0  21/5 2/5 ->  0     -> 0
        // 5 1 2    1 2 3     1  2    3       0        0 0

            for (int k = i + 1; k < components.length; k++ ){
                double koef = components[k][i] / components[i][i];

                for (int j = 0; j < components.length; j++){
                    components[k][j] -= koef * components[i][j];
                }
            }

            det *= components[i][i];
        }
        if (swaps % 2 != 0){
            det *= -1;
        }
        return det;
    }
}
