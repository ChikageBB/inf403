package ru.itis.inf403.lab12.model.func_int;

public class Student {
    private String name;
    private String surname;
    private int score;
    private int course;

    public Student(){}

    public Student(String name, String surname, int course, int score){
        this.name = name;
        this.surname = surname;
        this.course = course;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    public String toString(){
        return "Student | " + name + " " + surname + " | " + course + " course | " + score;
    }
}
