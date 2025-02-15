package com.dreamquest.practice.innerClass;

public class Employee {

    private  String name;
    private  String dept;
    private  double salary;

    private Employee()
    {

    }
    private Employee(Builder builder) {
         this.name = builder.name;
         this.dept = builder.dept;
         this.salary = builder.salary;
    }


    public String getDept() {
        return dept;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public static class Builder {

        private  String name;
        private  String dept;
        private  double salary;

        private Builder() {
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setDepertment(String dept) {
            this.dept = dept;
            return this;
        }

        public Builder setSalary(double sal) {
            this.salary = sal;
            return this;
        }

        public Employee build()
        {
            return new Employee(this);
        }
    }


    public static Builder builder()
    {
        return new Builder();
    }




}
