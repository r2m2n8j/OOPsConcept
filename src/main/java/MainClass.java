import java.util.function.BiFunction;

class A{

    public static void test(){
        System.out.println("Class A");
    }
}

class B extends A{
    public static void test(){
        System.out.println("Class B");
    }
}


public class MainClass {
    public static void main(String[] args) {
        A a = new B();
        a.test();

        System.out.println(sum.sum1(8,7));

    }
    static CustomFunctionalInterface sum = (a, b)-> (a+b)%2==0?"Even":"Odd";
//    public static String sum(int a, int b){
//        return (a+b)%2==0?"Even":"odd";
//    }
}
interface CustomFunctionalInterface{
    String sum1(int a, int b);
}
