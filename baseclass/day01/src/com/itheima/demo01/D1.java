package com.itheima.demo01;

import com.sun.org.apache.xml.internal.res.XMLErrorResources_tr;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class D1 {

    public static void main(String[] args) {

        int sum = 0;

        for(int i = 0;i <= 100;i++){
            sum += i;
        }

        m6();
    }

    public static void m1(){

        int i = 10;

        do {
            i++;
        }while (i <= 0);

        System.out.println(i);
    }

        public static void m2(){

        for (int  i = 1; i < 10;i++){

            for (int  j = 1; j < 20;j++){
                if (j %3 == 0){
                    continue;
                }
                System.out.println(j);
            }

            System.out.println("i:" + i);
        }
        }

        public  static void m3(){

        for (int i =1;i <= 10;i++){
            for (int j = 1;j <= 10;j++){

                if (i == j || (j +i)==11){
                    System.out.print("O");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        }

        public  static  void m4(){

        int [] arr = {1,2,3,4,5,6,7,8,9,1};

        for (int i = 0,j=arr.length -1;i < arr.length / 2;i++,j--){

            int  item = arr[i];
            arr[i] = arr[j];
            arr[j] = item;
        }

            System.out.println(Arrays.toString(arr));
        }

        public static  void m5(){

            Scanner scan = new Scanner(System.in);
            System.out.println("请输入一个数字:");

            int i = scan.nextInt();

            System.out.println(i);
        }

        public  static void m6(){

            List<Integer> list = new ArrayList<>();
            list.add(15);
            list.add(20);
            list.add(25);

            System.out.println(list);

            int [] arr = {45,65,85};
            System.out.println(Arrays.toString(arr));

            for (int i : arr) {
                System.out.println(i);
            }
        }
}
