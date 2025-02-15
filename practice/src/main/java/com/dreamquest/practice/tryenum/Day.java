package com.dreamquest.practice.tryenum;

import com.dreamquest.practice.innerClass.Student;

import java.util.Comparator;

public enum Day {

    Monday(12),Tuesday(34),Wednesday(43);


    private  int value;

    Day(int value) {
        this.value = value;
    }

    Day() {

    }

    public void display()
    {
        System.out.println("From inside enum");
    }

    public static void main(String[] args) {
        System.out.println(Day.Monday);
        System.out.println(Day.Monday.value);
    }


}
