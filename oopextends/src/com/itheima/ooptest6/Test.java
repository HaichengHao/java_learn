package com.itheima.ooptest6;

import com.itheima.ooptest2.Phone;

public class Test {
    static void main(String[] args) {
        //创建三个子类对象，并查看计算结果
        SmartPhone phone1 = new SmartPhone();
        phone1.name = "小米";
        phone1.price = 7999.9;
        double pay4phone = phone1.payment();
        System.out.println(pay4phone);

        PadandLaptop t = new PadandLaptop();
        t.name = "联想";
        t.price = 10000;
        double pay4t = t.payment();
        System.out.println(pay4t);
    }
}

class SmartDevice{
    String name;
    double price;

    //行为,计算商品价格
    public double payment(){
        if (this.price > 0 & this.price < 1000){
            return this.price;
        }else if (this.price>=1000&this.price<5000){
            return this.price*0.9;
        } else if (this.price>=5000 & this.price<10000) {
            return this.price*0.8;
        }else if (this.price>=10000){
            return this.price*0.7;
        }else{
            return 0;
        }

    };
}

//调用父类里面的方法计算出商品的价格
//如果是手机就再打九折
class SmartPhone extends SmartDevice{
    public double payment(){
        double payment = super.payment();
        payment = payment*0.9;
        return payment;
    }


}

//笔记本电脑和平板没有额外折扣
class PadandLaptop extends SmartDevice{

}


/*
方法重写的注意事项和要求
重写方法的名称、形参列表必须与父类中的一致，方法体按照实际需求书写
子类重写父类方法时，访问权限子类必须大于等于父类(空着不写<protected<public)
子类重写父类方法时，返回值类型必须与父类一致或者子类返回值类型必须与父类一致
重写的方法申明和父类保持一致即可
final修饰类为最终类，不能被继承，不能有子类，final修饰方法为最终方法，不能被重写
private私有方法、static静态方法、final最终方法不能被重写
 */

