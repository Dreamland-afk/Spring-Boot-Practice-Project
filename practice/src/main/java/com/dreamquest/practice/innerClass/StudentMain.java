package com.dreamquest.practice.innerClass;

import java.util.ArrayList;
import java.util.List;

public class StudentMain {

    public static void main(String[] args) {

//        List<Student>  studentList = new ArrayList<>(List.of(
//
//                new Student("CSE","Swapnadeep"),
//                new Student("ECE","Rohan"),
//                new Student("IT","Abir"),
//                new Student("Civil","Moni")
//
//
//        ));
//        studentList.sort(new Student.StudentComparator("byDept"));
//        studentList.forEach(System.out::println);

        List<Campus>  studentList = new ArrayList<>(List.of(

                new Campus("CSE","Swapnadeep","Salt Lake"),
                new Campus("IT","Sayan","NewTown"),
                new Campus("ECE","Rohan","Salt Lake"),
                new Campus("Civil","Amrita","NewTown")
                ));

        Campus.CampusComparator campusComparator =  new Campus().new CampusComparator();
        studentList.sort(campusComparator);

//        studentList.forEach(System.out::println);

        Employee employee1 = Employee.builder().setDepertment("CSE").setName("Sayan").setSalary(100.0).build();
        Employee employee2 = Employee.builder().setDepertment("IT").setName("Rohan").build();

        Employee employee3 = Employee.builder().setDepertment("ECE").setName("Amit").setSalary(300.0).build();




        System.out.printf("%n%10s %5s %.2f", employee1.getName() , employee1.getDept() , employee1.getSalary());
        System.out.printf("%n%10s %5s %.2f", employee2.getName() , employee2.getDept() , employee2.getSalary());
        System.out.printf("%n%10s %5s %.2f", employee3.getName() , employee3.getDept() , employee3.getSalary());




    }
}
