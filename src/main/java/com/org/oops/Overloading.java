package com.org.oops;

public class Overloading {
    public void m1(){
        System.out.println("No args");
    }
    public void m1(int i){
        System.out.println("Int args");
    }
    public void m1(float f){
        System.out.println("Float args");
    }
    public void m1(double d){
        System.out.println("Double args");
    }




    public static void main(String[] args) {
        Overloading overloading = new Overloading();
        overloading.m1();
        overloading.m1(11);
        overloading.m1(10.5f);
        overloading.m1(10.4);

        Case2 case2 = new Case2();
        case2.m1("Ramanuj");
        case2.m1(new StringBuffer("av"));
//        case2.m1(null);

        Case4 case4 = new Case4();
        case4.m1(11,11.5f);
        case4.m1(11.5f, 11);
//        case4.m1(11,11);

        Case5 case5 = new Case5();
        Animal a = new Animal();
        case5.m1(a);

        Monkey m = new Monkey();
        case5.m1(m);

        Animal aa = new Monkey();
        case5.m1(aa);


    }
}

class Case2{
    public void m1(String s){
        System.out.println("String version");
    }
    public void m1(StringBuffer sb){
        System.out.println("String Buffer");
    }
}

class Case4{
    public void m1(int i, float f){
        System.out.println("int float");
    }
    public void m1(float f, int i){
        System.out.println("float  int ");
    }

}


//Case 5

class Animal{}
class Monkey extends Animal{}

class Case5{
    public void m1(Animal a){
        System.out.println("Animal version");
    }
    public void m1(Monkey m){
        System.out.println("Monkey");
    }
}