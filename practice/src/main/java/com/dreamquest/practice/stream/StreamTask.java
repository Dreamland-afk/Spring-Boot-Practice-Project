package com.dreamquest.practice.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamTask {

    public static void main(String[] args) {

        Employee emp1 = new  Employee(1, "Swapnadeeep");
        Employee emp2 = new  Employee(2, "Dibya");
        Employee emp3 = new  Employee(3, "Rohan");
        Employee emp4 = new  Employee(5, "Dibya");

        List<Employee> empList = new ArrayList<>();
        empList.add(emp1);
        empList.add(emp2);
        empList.add(emp3);
        empList.add(emp4);

        List<Employee> usingName = empList.stream().sorted(Comparator.comparing(Employee::getName).thenComparing(Comparator.comparing(Employee::getId))).toList();

        for(Employee e : usingName)
            System.out.print(e.getName() +" ");

        System.out.println();
        List<Employee> usingId = empList.stream().sorted(Comparator.comparing(Employee::getId)).toList();
        List<Employee> list = empList.stream().sorted().toList();


        for(Employee e : usingId)
            System.out.print(e.getName() +" ");

        System.out.println();
        List<String> usingNameModify = empList.stream().map(Employee::getName).sorted().toList();

        for(String s : usingNameModify)
        {
            System.out.print(s + " ");
        }



    }
}


class Employee{

    private int empId;
    private String name;

    public Employee( int empId, String name)
    {
        this.empId = empId;
        this.name = name;
    }

    public void setId(int id)
    {
        this.empId = id;
    }
    public void setName(String name)
    {
        this.name = name;
    }

    public int getId()
    {
        return empId;

    }

    public String getName()
    {
        return name;
    }
}
