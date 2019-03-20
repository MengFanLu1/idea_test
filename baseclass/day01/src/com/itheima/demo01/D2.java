package com.itheima.demo01;

import java.util.Arrays;

public class D2 {

    public static void main(String[] args) {


        int [] arr = {25,16,25,38,29,65,73,22,98,36,4,2,8,2};

        for(int i = 0;i < arr.length;i++){
           for (int j = 0;j < (arr.length-1)-i;j++){
               if (arr[j] > arr[j+1]){

                   int temp = arr[j];
                   arr[j] = arr[j+1];
                   arr[j+1] = temp;

               }
           }
        }

        System.out.println(Arrays.toString(arr));

        m2();
    }

    public static  int m1(int[] arr,int x){

        int low = 0;
        int high = arr.length - 1;

        while(low <= high){

            int middle = (low + high) / 2;

            if (arr[middle] == x){

                return middle;
            }else if (x < arr[middle]){
                    high = middle;
            }else{
                low = middle + 1;
            }
        }
        return  -1;
    }

    public static void m2(){

       D3 f = new Zi();

       f.method();

    }
}
