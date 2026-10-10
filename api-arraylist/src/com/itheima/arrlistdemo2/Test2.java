package com.itheima.arrlistdemo2;

import java.util.ArrayList;

public class Test2 {
    static void main(String[] args) {
        /*
        定义一个集合,添加数字,并进行遍历
        遍历格式参照:[元素1，元素2，元素3]
         */

        //1.创建一个集合
        ArrayList<Integer> list = new ArrayList<>();
        //2.添加数据
//        Integer i1 = 10;
//        Integer i2 = 20;
//        Integer i3 = 30;
//        list.add(i1);
//        list.add(i2);
//        list.add(i3);

        //或者
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.print("[");
        //进行遍历
        for(int i = 0;i<list.size();i++){
            //i:索引
            if(i==list.size()-1){
                System.out.print(list.get(i));
                System.out.print("]");
            }else {
                System.out.print(list.get(i)+",");
            }

        }

    }
}
