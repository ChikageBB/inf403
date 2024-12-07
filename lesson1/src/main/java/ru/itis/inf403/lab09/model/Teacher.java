package ru.itis.inf403.lab09.model;

public class Teacher extends Person {
    private String[] disciplines;

    public Teacher(String lastName, String firstName, String middleName, int age) {
        super(lastName, firstName, middleName, age);
/*
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.age = age;
*/
    }


    public String[] getDisciplines() {
        return disciplines;
    }

    public void setDisciplines(String[] disciplines) {
        this.disciplines = disciplines;
    }

    public String toString() {
        return "Prof " + lastName + " " + firstName + " " + middleName + ", " + age;
    }

}