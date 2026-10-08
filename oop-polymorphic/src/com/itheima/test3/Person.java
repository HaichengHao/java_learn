package com.itheima.test3;

public class Person {
    private String name;
    private int age;
    private String gender;

    //行为:驾驶交通工具
    public void drive(Vehicle vehicle){
        vehicle.move();
        if(vehicle instanceof Bicycle){
            Bicycle b= (Bicycle)vehicle;
            b.ringBell();
        } else if (vehicle instanceof Car) {
            Car c = (Car)vehicle;
            c.honk();
        }else {
            System.out.println("没有这个类型");
        }


    }

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
