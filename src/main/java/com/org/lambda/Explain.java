package com.org.lambda;

import java.util.*;

public class Explain {
    public static void main(String[] args) {


       AA aa = new BB();
        aa.m1();

    }
}

abstract class AA{
     abstract void m1();
}
class BB extends  AA {
    @Override
     void m1(){
        System.out.println("Class BBB");
    }

    @Override
    public String toString(){
        return "value";
    }
}

interface AAAA{
    void m1();
}
