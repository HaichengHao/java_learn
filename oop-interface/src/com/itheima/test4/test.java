package com.itheima.test4;

public class test {
    static void main(String[] args) {
        bk_c bk_c1 = new bk_c("张三", 48);
        bk_c1.teach();

        bk_a bk_a1 = new bk_a("张四", 18);
        bk_a1.study();


        tt_c tt_c1 = new tt_c("王五", 28);
        tt_c1.teach();
        tt_c1.speak();

        tt_a tt_a1 = new tt_a("王六", 38);
        tt_a1.study();

    }
}
