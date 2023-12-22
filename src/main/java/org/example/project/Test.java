package org.example.project;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        //Pet pet = context.getBean("myPet", Pet.class);
        //Pet pet = new Cat();
        Person person = context.getBean("myPerson", Person.class);
        person.callYourPet();

        person.getSurname();
        person.getName();
        person.getAge();

        context.close();
    }
}
