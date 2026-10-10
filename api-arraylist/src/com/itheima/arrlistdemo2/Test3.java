package com.itheima.arrlistdemo2;

import java.util.ArrayList;

public class Test3 {
    static void main(String[] args) {
        /*
        需求:定义一个集合,添加一些学生对象
        学生类的属性为:id,姓名,年龄
        要求:
            1.遍历集合,将所有学生的属性打印在控制台上,每个学生一行
            2.定义一个方法,根据id查找学生的信息
                 存在:返回索引
                 不存在:返回-1
         */

        //1.创建集合对象
        ArrayList<Student> list1= new ArrayList<>();
        //2.创建一些学生的对象
        Student s1 = new Student("001","张三",18);
        Student s2 = new Student("002","李四",19);
        Student s3 = new Student("003","王五",20);

        //3.添加到集合
        list1.add(s1);
        list1.add(s2);
        list1.add(s3);

        //4.遍历集合,将所有学生的属性打印在控制台上,每个学生一行
        for(int i = 0;i<list1.size();i++){
            Student s = list1.get(i);
            System.out.println(s.getName());
        }
        /*
        张三
        李四
        王五
         */

        //5.查找对应的id
        int index = findStudent("004",list1);
        System.out.println(index);//-1 即不存在

        int index2 = findStudent("002",list1);
        System.out.println(index2);//1 即存在
    }

    //作用:根据id查找学生的信息
    //形参:id,ArrayList<Student> list
    //返回值:int
    public static int findStudent(String id,ArrayList<Student> list){
        //遍历得到集合中的每一个元素(学生对象),判断元素的id跟查找的id是否一致
        for(int i = 0;i<list.size();i++){
            Student s = list.get(i);

            //引用类型没办法用"=="来判断,所以用之前学的equals()方法
            //判断equals -- 链式编程,多行代码写在一行(少定义几个变量)
            if(s.getId().equals(id)){
                return i;
            }
        }
        return -1;//表示要查找的id不存在的


    }
}
