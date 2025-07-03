package com.org.oops;

import java.io.EOFException;
import java.io.IOException;

public class OverridingConcept {
    public static void main(String[] args) {
        ParentClas parentClas = new ParentClas();
//        parentClas.marry();
        parentClas.property();


        ChildClas childClas = new ChildClas();
        childClas.property();
//        childClas.marry();
//        childClas.education();

        ParentClas parentClas1 = new ChildClas();
        parentClas1.property();
//        parentClas1.marry();
//        parentClas1.education();

        ParentStatic parentStatic = new ChildStatic();
        parentStatic.m1();
        System.out.println(parentStatic.x);

        ChildStatic childStatic= new ChildStatic();
        childStatic.m1();
        System.out.println(childStatic.x);



    }
}

class ParentStatic{
    static int x = 100;
    public static void m1(){
        System.out.println("Parent static method");
    }
}

class ChildStatic extends ParentStatic{
    static int x = 200;
    public static void m1(){
        System.out.println("Child static method");
    }
}




class ParentClas{
    public void property(){
        System.out.println("Parent property");
    }
    public void marry(){
        System.out.println("Parent arrange ...");
    }
}

class ChildClas extends ParentClas{
    public void property(){
        System.out.println("Child Property increased");
    }
    public void education(){
        System.out.println("Child Education ...");
    }
}




