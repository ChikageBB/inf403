package ru.itis.inf403.lab12.model.func_int;


public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[]{
                new Student("Ivan", "Skolov", 3, 50),
                new Student("Andrey", "Karpov", 2, 89 ),
                new Student("Sveta", "Morozova", 1, 90),
                new Student("Maria", "Zayceva", 4, 100),
                new Student("Ekaterina", "Smirnova", 1, 45),
                new Student("Dmitriy", "Kuznecov", 2, 2),
                new Student("Nikita", "Orlov", 3, 76)
        };

        ArrayUtils.sort(students, new ICompareObject() {
            @Override
            public int compare(Object obj1, Object obj2) {
                return (((Student)obj1).getScore() - ((Student)obj2).getScore());
            }
        });

        for (Student s: students){
            System.out.println(s);
        }

    }
}
