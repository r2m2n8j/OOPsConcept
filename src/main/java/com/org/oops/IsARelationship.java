package com.org.oops;

class P{
    void m1(){
        System.out.println("P class m1 method");
    }
}
class C extends P{
    void m2(){
        System.out.println("C class m2 method");
    }
}
public class IsARelationship {
    public static void main(String[] args) {
        P p = new P();
        p.m1();

        P p1 = new C();
        p1.m1();
//      p1.m2();

    }
}
