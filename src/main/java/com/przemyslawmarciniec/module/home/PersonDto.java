package com.przemyslawmarciniec.module.home;

public class PersonDto {

    private String name;
    private String surname;
    private int age;

    public PersonDto(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public int getAge() {
        return this.age;
    }
}