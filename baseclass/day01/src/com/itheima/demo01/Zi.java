package com.itheima.demo01;

import java.util.*;

public class Zi extends D3 {


    public static void main(String[] args) {

        Map<String,Object> map = new HashMap<>();
        Map<String,List> map2 = new HashMap<>();
        map.put("a",12);
        map.put("b",24);
        map.put("c",36);
        map.put("d",48);

        Set<Map.Entry<String, Object>> entries = map.entrySet();

        for (Map.Entry<String, Object> entry : entries) {

            System.out.println(entry.getKey() +":"+entry.getValue());
        }

    }

    public static void test(int... arr){

        for (int i : arr) {
            System.out.println(i);
        }
    }


}
