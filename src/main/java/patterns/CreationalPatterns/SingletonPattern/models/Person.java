package main.java.patterns.CreationalPatterns.SingletonPattern.models;

/**
 * Created by aliyuabdullahi on 12/25/16.
 */
public class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        Person person = (Person) obj;
        if (person == this) {
            return true;
        }
        if (person.getAge() == this.getAge() && person.getName().equals(this.getName())) {
            return true;
        }

        return false;
    }

    @Override
    public String toString() {
        return "Person: {\n    Name: " + getName() + "\n     Age: " + getAge() + "\n}";
    }
}
