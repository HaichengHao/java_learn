package com.itheima.test3;

public class Vehicle {
    private String brand;
    private double speed;

    public void run() {

    }
    public Vehicle() {
    }
    public Vehicle(String brand, double speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }


    //行为
    public void move(){
        System.out.println("车辆正在移动");
    }


}
