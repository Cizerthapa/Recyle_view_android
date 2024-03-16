package com.cizer.week3_recycle.Model;

public class Student {
    private String name;
    private String age;
    private int image;

    public Student(String name, String age, int image) {
        this.name = name;
        this.age = age;
        this.image = image;
    }

    // Getter method for name
    public String getName() {
        return name;
    }

    // Setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for age
    public String getAge() {
        return age;
    }

    // Setter method for age
    public void setAge(String age) {
        this.age = age;
    }

    // Getter method for image
    public int getImage() {
        return image;
    }

    // Setter method for image
    public void setImage(int image) {
        this.image = image;
    }
}
