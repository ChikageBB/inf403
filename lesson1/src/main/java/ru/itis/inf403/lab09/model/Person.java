package ru.itis.inf403.lab09.model;

public class Person {
    protected String lastName;
    protected String firstName;
    protected String middleName;
    protected int age;


    public Person() {}

    public Person(String lastName, String firstName, String middleName, int age){
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.age = age;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getAge() {
        return age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    @Override
    public String toString() {
        return getLastName() + " " + getFirstName() + " " + getMiddleName() + " " + getAge();
    }
}
