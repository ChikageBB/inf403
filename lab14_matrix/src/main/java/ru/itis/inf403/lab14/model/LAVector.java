package ru.itis.inf403.lab14.model;

public class LAVector {

    private double[] components;

    public LAVector(int size){

        this.components = new double[size];
        for (int i = 0; i < this.components.length; i++){
            components[i] = 0;
        }
    }

    public LAVector(double[] components){
        this.components = components;
    }

    public LAVector(int size, double value){
        this.components = new double[size];

        for (int i = 0; i < this.components.length; i++){
            components[i] = value;
        }
    }


    public LAVector plusVector(LAVector other){

        for (int i = 0; i < other.components.length; i++){
            this.components[i] += other.components[i];
        }

        return this;
    }

    public LAVector multNum(double num){
        for (int i = 0; i < this.components.length; i++){
            components[i] *= num;
        }
        return this;
    }

    public double scalarMult(LAVector other) {
        double res = 0;
        if (this.components.length < other.components.length){
            for (int i = 0; i < this.components.length; i++){
                res += this.components[i] + other.components[i];
            }
        } else {
            for (int i = 0; i < other.components.length; i++){
                res += this.components[i] + other.components[i];
            }
        }
        return res;
    }

    public double abs(){
        double res = 0;
        for (int i = 0; i < components.length; i++){
            res += components[i] * components[i];
        }
        return Math.sqrt(res);
    }

    public int lenght(){
        return components.length;
    }

    public double get(int i ){
        return components[i];
    }

    public void print(){
        System.out.print("( ");
        for (double i: this.components){
            System.out.print(i + " ");
        }
        System.out.println(")");
    }
}
