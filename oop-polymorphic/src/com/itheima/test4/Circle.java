package com.itheima.test4;

class Circle extends Shape {
    private double radius; // 半径
    private final double PI = Math.PI; // 圆周率

    public Circle(){

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * PI * radius;
    }

    @Override
    public double getArea() {
        return PI * radius * radius;
    }

    @Override
    public String getInfo() {
        return "圆形（半径: " + radius + "）";
    }
}
