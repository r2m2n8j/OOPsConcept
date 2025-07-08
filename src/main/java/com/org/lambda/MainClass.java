package com.org.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;





public class MainClass {
    public static void main(String[] args) {
//        String ans = func(7,6);
        System.out.println(sum.execute(1,11));

//        List<Integer> list = Arrays.asList(1,2,3,4);
//        int sum = 0;
//        Integer ans = list.stream().filter(val->

//        AA a = new BB();
//        a.m1();

    }



    static MyInterface<Integer,Integer,String> sum = (Integer a, Integer b) -> (a+b)%2==0?"Even":"Odd";
    private static String func(int a, int b) {
        return (a+b)%2==0?"Even":"Odd";
    }
    @FunctionalInterface
    interface MyInterface<I1,I2,R>{
        String execute(Integer a,Integer b);
    }
}


