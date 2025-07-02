# Interface concept

# 🔹 1. Default Method Conflict (Diamond Problem)
🔸 Scenario:
Two interfaces define the same default method, and a class implements both.

    
    interface A {
        default void show() {
        System.out.println("A's show");
        }
    }
    
    interface B {
        default void show() {
        System.out.println("B's show");
        }
    }
    
    class C implements A, B {
        @Override
        public void show() {
            System.out.println("Resolving conflict...");
            A.super.show(); // call A's version
            B.super.show(); // call B's version
        }
    }
🧠 Why important?
This is the Java version of the Diamond Problem, and you must override the method in class to resolve the conflict.

# 🔹 2. Combining Abstract and Default Methods
You can use interfaces where:

One interface has only abstract methods.

One interface has default methods.
    
    interface Loggable {
        default void log() {
            System.out.println("Default logging...");
        }
    }
    
    interface Printable {
        void print();
    }
    
    class Document implements Loggable, Printable {
        public void print() {
            System.out.println("Printing document");
        }
    }
🧠 Helps combine capabilities in a modular way.

# 🔹 3. Overriding Default Method in Implementing Class
You can override the default method in your class to change its behavior.

    
    class MyClass implements sum {
        @Override
        public void m1() {
        System.out.println("MyClass overrides m1");
        }
        
        @Override
        public void m2() {
            System.out.println("MyClass overrides default m2");
        }
    }


    public class MultipleInheritance {
        public static void main(String[] args) {
    
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
# 🔹 4. Default Method Overriding in Sub-Interface
In your moreSum interface, you commented this out:


    // public default void m2(){
    //     System.out.println("m2 method from moreSum interface");
    // }
✅ You can override a default method in a child interface, and that will be the one used unless the implementing class overrides it again.

# 🔹 5. Static Methods from Multiple Interfaces
If two interfaces declare static methods with the same name, there’s no conflict, because static methods are not inherited.
    
    interface A {
        static void utility() {
            System.out.println("A's static utility");
        }
    }
    
    interface B {
        static void utility() {
            System.out.println("B's static utility");
        }
    }
    
    class Test {
        public static void main(String[] args) {
            A.utility();
            B.utility();  // both work independently
        }
    }
# 🔹 6. Using Private Interface Methods for Code Reuse
    
    interface Helper {
        default void process() {
            start();
            System.out.println("processing...");
        }
    
        private void start() {
            System.out.println("starting...");
        }
    }
✅ The private method improves internal code reuse without exposing it to implementing classes.