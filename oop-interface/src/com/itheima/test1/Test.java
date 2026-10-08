package com.itheima.test1;

public class Test {
    static void main(String[] args) {
        Dog d1 = new Dog("burus","white");
        Rabbit r1 = new Rabbit("zag","gray");
        Frog f1 = new Frog("guru","green");

        d1.eat();
        f1.eat();
        r1.eat();

        d1.swim();
        f1.swim();

    }
}
