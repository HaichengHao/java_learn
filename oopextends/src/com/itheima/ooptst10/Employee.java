package com.itheima.ooptst10;

public class Employee {
    private String name;
    private String e_id;
    private double salary;

    public void work(){
        System.out.println("员工正在工作");
    }

    public void eat(){
        System.out.println("员工正在吃饭");
    }

    public Employee(){

    }

    public Employee(String name, String e_id, double salary) {
        this.name = name;
        this.e_id = e_id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getE_id() {
        return e_id;
    }

    public void setE_id(String e_id) {
        this.e_id = e_id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
