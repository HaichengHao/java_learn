package com.itheima.arrlistdemo;

import java.util.ArrayList;

/*
增删改查
.add(E e)将数据添加到末尾
.add(int index,E e)将数据添加到指定位置
remove(E e)删除指定的数据
E remove(int index)删除指定位置的数据
E set(int index,E e)修改指定位置的数据
E get(int index)获取指定位置的数据
int size()获取集合的长度
 */
public class Test2 {
    static void main(String[] args) {
        ArrayList<String> arr1 = new ArrayList<>();
        arr1.add("niko");
        System.out.println(arr1);
        //增
        //ArrayList的add方法不管添加什么都能添加成功，忽略返回值即可
        //true:添加成功,false:添加失败
        //此时add方法在任意情况下,都会添加成功,永远不会失败
        //因为在java中，有很多很多的集合,HashSet(元素要唯一) aaa(true) aaa(false)
        //设计:跟其他的集合保持统一(面向对象的思想)
        //细节2:在集合当中无法直接添加基本数据类型的(byte short int long float double char boolean)
        //只能添加引用数据类型(对象)
        //如果在集合里面一定要添加基本数据类型,那么可以转成其对应的包装类
        arr1.add(0,"hello");
        System.out.println(arr1);
        //删
        arr1.remove("niko");
//        String res = arr1.remove(0); //根据索引删除，会将删除的元素返回
        System.out.println(arr1);
//        System.out.println(res);
        //改
        arr1.set(0,"world");
        System.out.println(arr1);

        //查
        String s1 = arr1.get(0);
        System.out.println(s1);

        //获取长度
        System.out.println(arr1.size());

        ArrayList<String> arr2 = new ArrayList<>();
        arr2.add("hello");
        arr2.add("world");
        arr2.add("java");

        //遍历:get+size
//        原来的enhaced for
//        for (String s : arr2) {
//            System.out.println(s);
//
//        }

        for (int i = 0; i < arr2.size(); i++) {
            System.out.println(arr2.get(i));
        }



    }
}
