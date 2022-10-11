package org.fasttrackit.exercitiul2;

public class Person {
    private String name;
    private int age;
    private String hairColour;

    public Person(String name, int age, String hairColour){
        this.name = name;
        this.age = age;
        this.hairColour = hairColour;
    }

    @Override
    public String toString() {
        return "{" + '\'' +
                  name + '\'' +
                ", age=" + age +
                ", hairColour='" + hairColour + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getHairColour() {
        return hairColour;
    }
}
