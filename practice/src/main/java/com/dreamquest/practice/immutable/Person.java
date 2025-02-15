package com.dreamquest.practice.immutable;

public class Person {

    private String name;
    private String dob;

    public Person(String dob, String name) {
        this.dob = dob;
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public String getName() {
        return name;
    }
}
