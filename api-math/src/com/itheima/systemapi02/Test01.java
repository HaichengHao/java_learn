package com.itheima.systemapi02;

public class Test01 {
    static void main(String[] args) {
        //1. exit种植当前运行的jvm
        //0:正常,非0:异常终止
        System.out.println("hello");
//        System.exit(0);//这里旧正常终止jvm,下面的代码不再执行
//        System.out.println("world");


        //2.currentTimeMillis() 获取当前时间戳(毫秒形式,从计算机原点时间1970-01-01 00:00:00开始)
        System.out.println(System.currentTimeMillis());//1791600922765


        //3.arraycopy()

        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = new int[5];
        //把arr1中的数据从0索引开始拷贝，拷贝到arr2,从0索引开始的数据，拷贝长度为arr1的长度
        System.arraycopy(arr1, 0, arr2, 0, arr1.length);

        int[] arr3 = new int[3];
        System.arraycopy(arr1, 2, arr3, 0, 3);
        System.out.println(arr3);
        for(int i =0;i<arr3.length;i++){
            System.out.println(arr3[i]);// 3,4,5
        }


        //把目的地索引设置为所引2，拷贝2个，这样就复制到对应的数组位置了
        int[] arr4 = new int[4];
        System.arraycopy(arr1, 1, arr4, 2, 2);
        for(int i =0;i<arr4.length;i++){
            System.out.println(arr4[i]);// 0,0,2,3
        }


    }
}
