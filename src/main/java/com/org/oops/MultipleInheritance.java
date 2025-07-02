package com.org.oops;

interface A{
    default void m1(){
        System.out.println("A class m1 method");
    }
}

interface B{
    default void m1(){
        System.out.println("m3 methods");
    }
    static void m3(){
        System.out.println("static method from interface B");
    }
    void m2();
}

class MyClass implements B{
    @Override
    public void m2() {
        System.out.println("m2 method from MyClass");
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
//        MyClass myClass = new MyClass();
//        myClass.m2();
//        myClass.m1();

        //myClass.m3();
        PureSum pureSum = new PureSum();
        pureSum.m1();
        pureSum.m2();
        pureSum.mq();

        sum.m3();

    }
}


interface sum {
    void m1();//This is by default public abstract method
    public default void m2(){
        System.out.println("This is default m2 method from sum interface");
    }
    public static void m3(){
        System.out.println("This is static m3 method");
    }
    private void m22(){
        System.out.println("This is private m22 method");
    }
}

interface moreSum extends sum{
    default void mq(){
        System.out.println("mq default method from moreSum interface");
    }
//    public default void m2(){
//        System.out.println("m2 method from moreSum interface");
//    }
}

class PureSum implements moreSum{

    @Override
    public void m1() {
        System.out.println("override m1 abstract method body inside PureSum Class");
    }

//    @Override
//    public void mq(){
//        System.out.println("This is mq method from PureSum class");
//    }
}

//
//interface A {
//    default void show() {
//        System.out.println("A's default show()");
//    }
//
//    static void util() {
//        System.out.println("A's static util()");
//    }
//}
//
//interface B {
//    default void show() {
//        System.out.println("B's default show()");
//    }
//
//    static void util() {
//        System.out.println("B's static util()");
//    }
//}
//
//interface CC extends A {
//    @Override
//    default void show() {
//        System.out.println("CC's override of A's show()");
//    }
//
//    default void helper() {
//        common();
//        System.out.println("CC's helper() logic");
//    }
//
//    private void common() {
//        System.out.println("CC's private common()");
//    }
//}
//
//interface D {
//    void process();
//}
//
//class MyClass implements A, B, D {
//    @Override
//    public void show() {
//        System.out.println("MyClass resolves show() conflict:");
//        A.super.show();  // calling A's version
//        B.super.show();  // calling B's version
//    }
//
//    @Override
//    public void process() {
//        System.out.println("Processing in MyClass");
//    }
//}
//
//
//class AdvancedClass implements CC {
//    @Override
//    public void show() {
//        System.out.println("AdvancedClass overrides show()");
//    }
//
//    public void testHelper() {
//        helper();  // calls CC's helper which uses private common()
//    }
//}
//
//public class MultipleInheritance {
//    public static void main(String[] args) {
//        System.out.println("===> MyClass Demo:");
//        MyClass obj = new MyClass();
//        obj.show();       // resolving show() from A and B
//        obj.process();    // implementing abstract method
//
//        System.out.println("\n===> AdvancedClass Demo:");
//        AdvancedClass adv = new AdvancedClass();
//        adv.show();       // AdvancedClass override
//        adv.testHelper(); // helper() calls private common()
//
//        System.out.println("\n===> Static Method Conflict Demo:");
//        A.util();         // ✅ works
//        B.util();         // ✅ works
//
//        // obj.util();    ❌ Error: static methods not inherited
//    }
//}
