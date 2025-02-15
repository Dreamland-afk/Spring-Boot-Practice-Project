package com.dreamquest.practice.innerClass;

import java.util.Comparator;
import java.util.Random;


public class Student {

    public static class StudentComparator implements Comparator<Student> {

        private final String sortType;



        public StudentComparator() {
            this("byName");
        }

        public StudentComparator(String type) {
            this.sortType = type;
        }

        @Override
        public int compare(Student o1, Student o2) {
            if(sortType.equals("byName"))
                return o1.name.compareTo(o2.name);
            if(sortType.equals("byDept"))
                return o1.dept.compareTo(o2.dept);
            return o1.stdId - o2.stdId;
        }
    }

    private int stdId;
    private String name;
    private String dept;

    static int count = 1;

    public Student() {
    }

    public Student(String dept, String name) {
        this.dept = dept;
        this.name = name;
        this.stdId = new Random().nextInt(1000,1300);
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStdId() {
        return stdId;
    }

    public void setStdId(int stdId) {
        this.stdId = stdId;
    }

    @Override
    public String toString() {
        return "%d %-15s %-8s".formatted(stdId, name, dept);
    }
}
