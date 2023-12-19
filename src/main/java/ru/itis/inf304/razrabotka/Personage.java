package ru.itis.inf304.razrabotka;
public class Personage {

    private String name;
    private int age;
    private String city;

    Personage (String name, int age, String city){ //инициализация
        this.name = name;
        this.age = age;
        this.city = city;
    }



    public void sayHello(){
        System.out.println("Привет,меня зовут " + name + ", мне " + age + ", я живу в городе " + city );
    }



}
