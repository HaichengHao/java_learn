package com.itheima.object_and_objects03;
//Object是Java中的顶级父类,所有的类都直接或简介的继承于Object类
public class Test1 {
    static void main(String[] args) {
        Student s = new Student("张三",23);
        String s1 = s.toString();
        System.out.println(s1);
        /*Object类中的源代码:
        返回对象的内存地址
            public String toString() {
            //getClass():调用者的字节码文件

            //getName(): 这个字节码文件的名字
            //@间隔符号
            //hashCode():调用者的内存地址
                return getClass().getName() + "@" + Integer.toHexString(hashCode());
            }
         */

        //但是我们想看到的是值,那就重写，回到Student类中重写toString()


        //多说一句,如果想要把一个对象变成字符串并打印,其实不需要手动调用toString()方法,直接打印对象即可
        System.out.println(s);


    }
}
