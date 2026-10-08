package com.itheima.ooptest4;

public class Test {
    static void main(String[] args) {
        Zi1 z = new Zi1();
        z.drink();
    }
}

class Fu {
    public void eat() {
        System.out.println("吃米饭,吃菜");
    }

    public void drink() {
        System.out.println("喝开水");
    }
}

class Zi1 extends Fu {

}

class Zi2 extends Fu {

}
