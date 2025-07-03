package com.org.oops;

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