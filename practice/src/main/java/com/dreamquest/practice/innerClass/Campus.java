package com.dreamquest.practice.innerClass;

import java.util.Comparator;

public class Campus extends  Student{


    public class CampusComparator implements Comparator<Campus> {

        @Override
        public int compare(Campus o1, Campus o2) {

            int result = o1.campus.compareTo(o2.campus);
            if( result == 0 )
                return new Student.StudentComparator("byName").compare(o1,o2);
            return result;
        }

        public static void display()
        {
            System.out.println("Testing static block inside inner class");
        }

    }

    private String campus;

    public Campus()
    {
        this("Salt Lake");
    }

    public Campus(String campus) {
        super("CSE","Pritam");
        this.campus = campus;


    }

    public Campus(String dept, String name, String campus) {
        super(dept, name);
        this.campus = campus;

    }

    @Override
    public String toString() {
        return "%-12s%s".formatted(campus, super.toString());
    }
}
