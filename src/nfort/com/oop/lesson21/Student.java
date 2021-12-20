package nfort.com.oop.lesson21;

public class Student {
    private String name;
    private int age;

    public Student (int age, String name){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
