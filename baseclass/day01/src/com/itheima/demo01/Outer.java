package com.itheima.demo01;

public class Outer {

    class Inner{

        public void show(){
            System.out.println("我是成员内部类");
            System.out.println(name);
        }
    }

    private  String name = "sdds";

    public void use(){
        new Inner().show();
    }
}
