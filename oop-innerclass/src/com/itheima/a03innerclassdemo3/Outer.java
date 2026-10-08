package com.itheima.a03innerclassdemo3;

public class Outer {

    public class Inner1{
        static int a = 10;  //在成员内部类里卖弄，JDK16之前不能定义静态变量,可以从file->Project-structure里面设置SDK版本来尝试
    }

    private class Inner2{
        int[] arr1 = {1,2,3,4,5};
        int arr2[] = new int[]{1,2,3,4,5};
    }

    public Inner2 getInner2(){
        return new Inner2();
    }
}
