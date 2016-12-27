package main.java.patterns.BehavioralPatterns.IteratorPattern;

import com.sun.tools.javac.comp.Flow;

/**
 * Created by aliyuabdullahi on 12/27/16.
 */
public class Flower {
    private String name;
    private String id;

    public Flower(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        Flower flower = (Flower) obj;
        if (flower == this) {
            return true;
        } else {
            return flower.getName().equals(this.getName()) && flower.getId().equals(this.getId());
        }
    }

    @Override
    public String toString() {
        return "Flower: {\n Name: " + this.name + "\n Id: " + this.id + "\n}";
    }
}
