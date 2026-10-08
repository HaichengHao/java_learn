package com.itheima.test4;
/*
这个是用来为图形计算器的类，将被子类继承
 */
class Rectangle extends Shape {
    private double width;  // 宽
    private double height; // 高

    public Rectangle(){

    }
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public String getInfo() {
        return "长方形（宽: " + width + ", 高: " + height + "）";
    }
}