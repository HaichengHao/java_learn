package com.itheima.test3;

public class Car extends Vehicle{

    public Car() {
    }
    public Car(String brand, double speed) {
        super(brand, speed);
    }

    @Override
    public void move() {
        System.out.println(getBrand()+"的汽车正在以"+getSpeed()+"km/h的速度移动");
    }

    //行为
    public void honk(){
        System.out.println("di~didi~~");
    }
}
