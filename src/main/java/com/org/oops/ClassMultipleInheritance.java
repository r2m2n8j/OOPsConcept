package com.org.oops;

class Parent{
    void m1(){
        System.out.println("Parent class m1 method");
    }
}

class Child extends Parent{
    void m1(){
        System.out.println("Child class m1 method");
    }
}

class SubChild extends Child{

}

public class ClassMultipleInheritance {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.m1();

        Child child = new Child();
        child.m1();

        Parent pc = new Child();
        pc.m1();

        SubChild subChild = new SubChild();
        subChild.m1();
    }
}

/*

Key Concept: Static Methods are Hidden, Not Overridden
When a static method is re-declared in a subclass, it is hidden, not overridden.

Static methods are resolved at compile-time, based on reference type, not object type.

Output Explanation:

Code	                    Output	                                    Why?
p.m1();	                    Parent class m1 method	                    p is a Parent reference
c.m1();	                    Child class m1 method	                    c is a Child reference
Parent pc = new Child();
pc.m1();	                Parent class m1 method	                    Reference type is Parent, so static method from Parent is used

**/




