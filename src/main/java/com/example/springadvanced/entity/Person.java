package com.example.springadvanced.entity;

import lombok.Getter;

@Getter
public class Person {

    private String name;

    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
