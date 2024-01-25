package it.training.lesson24.task2;

public class University {
    static class Student {
        int id;
        String name;

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }
    }

    public static void main(String[] args) {

        University.Student student = new University.Student(1, "John Doe");


        System.out.println("ID of the Student: " + student.id);
        System.out.println("Name of the Student: " + student.name);
    }
}
