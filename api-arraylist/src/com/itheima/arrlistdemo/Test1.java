package com.itheima.arrlistdemo;

import java.util.ArrayList;

public class Test1 {
    static void main(String[] args) {
        //1.创建一个长度为0的ArrayList集合
        //它本身也像StringBuilder，是容器，可以存储任意数据类型



        //创建一个长度为0的ArrayList集合
        //int[] arr = new int[3];
        //问题:能判断集合中能存储什么类型的数据么?
        //如果没有进行限定,此时集合里面可以存储任意数据类型的数据
//        ArrayList list = new ArrayList();
//        list.add("niko");
//        System.out.println(list);
//        list.add(new Student("张三",18));


        //泛型:限定集合当中的数据类型    格式: ArrayList<数据类型>

        //用泛型去限定集合中能存储什么类型
        ArrayList<String> list = new ArrayList<String>();//JDK7之后,后面的泛型类型可以不写,只保留<>
        ArrayList<String> list2 = new ArrayList<>();
        list.add("niko");
        System.out.println(list);

//        list.add(1);这样写就会有错误提示,因为我们用泛型规定了ArrayList集合只能存储String类型数据




    }
}
