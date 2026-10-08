package com.itheima.a03stringdemo;

public class ArrayUtil {

    private ArrayUtil() {
    }

    public static String ArraytoString(int[] arr){
        String s = "[";

        for(int i = 0;i<arr.length;i++){
            if(i==arr.length-1){
                s+=arr[i]+"]";
                break;
            }
            s+=arr[i]+",";
        }
        return s;
    }


}
