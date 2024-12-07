package ru.itis.inf403.lab09.model;

public class Student extends Person {
    private String groupName;
    private int rating;

    public Student(){}

    public Student(String lastName, String fistName, String middleName,int age, String groupName, int rating){
        super(lastName, fistName, middleName, age);
        this.groupName = groupName;
        this.rating = rating;

    }

    public String getGroupName() {
        return groupName;
    }

    public int getRating() {
        return rating;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public String toString(){
        return getLastName() + " " + getFirstName() + " " + getMiddleName() + " " + getGroupName();
    }

    @Override
    public boolean equals(Object o){
        if (this == o){
            return true;
        }else if (o == null || getClass() != o.getClass()){
            return false;
        }return this.getAge() == ((Student)o).getAge() && this.getMiddleName() == ((Student)o).getMiddleName()
                && this.getFirstName() == ((Student)o).getFirstName() && this.getLastName() == ((Student)o).getLastName()
                && this.getRating() == ((Student)o).getRating() &&  this.getGroupName() == ((Student)o).getGroupName();

    }
}
