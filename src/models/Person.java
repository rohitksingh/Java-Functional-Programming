package models;

import enums.Gender;

public class Person{

    public String name;
    public Gender gender;

    public Person(String name, Gender gender){
        this.name = name;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return name;
    }
}