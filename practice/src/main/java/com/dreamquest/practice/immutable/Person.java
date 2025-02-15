package com.dreamquest.practice.immutable;

import java.util.Arrays;

public class Person {

    private String name;
    private String dob;

    private Person[] kids;

    public Person( String name, String dob) {

        this(dob,name,null);

    }

    public Person(String dob, String name, Person[] kids) {
        this.dob = dob;
        this.kids = kids == null? null: Arrays.copyOf(kids,kids.length);
        this.name = name;
    }

    // Copy constructor for shallow copy
    public Person(Person other) {
        this.name = other.name;
        this.dob = other.dob;
        this.kids = other.kids; // Shallow copy of the array reference
    }
    public String getDob() {
        return dob;
    }

    public String getName() {
        return name;
    }

    public Person[] getKids() {
//         return  ( kids == null) ?   null :  Arrays.copyOf(kids,kids.length) ;

        return kids;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", dob='" + dob + '\'' +
                ", kids=" + Arrays.toString(kids) +
                '}';
    }
}
