package org.example.project;

public class Person {

    private Pet pet;
    private String surname;
    private String name;
    private int age;

    public Person () {
        System.out.println("Person bean is created!");
    }

    /*public Person(Pet pet) {
        System.out.println("Person bean is created!");
        this.pet = pet;
    }*/

    public void setPet(Pet pet) {
        System.out.println("Class Person: set pet");
        this.pet = pet;
    }

    public void setSurname(String surname) {
        System.out.println("Class Person: set surname");
        this.surname = surname;
    }

    public void setName(String name) {
        System.out.println("Class Person: set name");
        this.name = name;
    }

    public void setAge(int age) {
        System.out.println("Class Person: set age");
        this.age = age;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void callYourPet(){
        System.out.println("Hello, my lovely Pet!");
        pet.say();
    }
}
