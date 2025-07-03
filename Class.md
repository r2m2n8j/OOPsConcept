# Is a relationship 
- It is also known as an inheritance
- The main advantage of Is-A-Relationship is code reusability.
- By using extends keyword we can implement Is-A-Relationship


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
                C c = new C();
                c.m1(); c.m2();
                
                P p = new P();
                p.m1();
                
                P p1 = new C();
                p1.m1();
                //p1.m2();
            }
        }


1. Whatever method parent has by default available to the child and hence child reference can call both parent and child class method. 
2. Whatever methods child have by default not available to the Parent and hence on the parent reference we can't call child specific methods.
3. Parent reference **P p1 = new C();** can use to hold child object but by using that reference we can't call child specific methods **p1.m2();**, but we can call the methods present in parent class **p1.m1();**.
4. Parent reference **P p1 = new C();** can use to hold child object but child reference **C c1 = new P();** can't be used to hold Parent reference.

**P p1 = new C();** This is concept of **Upcasting**.



# Multiple Inheritance
Class cannot support multiple classes.

# Why Java won't provide support for multiple inheritance?
- There may be a change of **ambiguity problem**. Hence, Java won't provide support for multiple inheritance.
- But interface can extend any number of interface simultaneously hence, Java provide support for multiple inheritance with respect to interfaces.
  - interfaceA.super.method1()
  - interfaceB.super.method2()


# why ambiguity problem won't be their in interface?



# Has-A-Relationship
- Has a relationship is also known as a **Composition and Aggregation**.

# Composition
- Without existing the container object if there is no chance of existing contained object than container and contained object are strongly associated.
- **Example** University consist of several department without existing University there is no chance of existing department. Hence, University and department are strongly associated and this strong association is called **Composition**

# Aggregation
- Without existing container object if there is a chance of existing contained object than container and contained object are weakly associated and this weak association is called **Aggregation**.
- **Example** Department consist of several professor without exist department there may be a chance of existing professor object. Hence, department and professor object are weakly associated and this weak association is called **aggregation**.



# Method Signature
- In Java method signature consist of method name followed by argument type.
-  **m1(int, float)**  -> Method Signature

- p.s.int m1(int, float)  -> **Method Declaration**

- With in a class two method with same signature not allow

    
      class Test{
          public static void m1(int i) {
              
          }
          public static void m1(int a){
              
          }
      }

- Compile time error **m1(int)** is already define in Test




# Overloading

- Two methods are said to be overloaded if and only if both methods having same name but **different argument types**.
- In overloading method resolution always take care by compiler based on reference type **Parent p = new Child()** parent type hence, overloading is also known as **Compile time Polymorphism, Static Polymorphism, and Early binding Polymorphism**.

## Case 1  Automatic Promotion in Overloading
- While resolving overloaded methods if existing matched method is not available that we won't get any compile time error immediately.
- First it will promote argument to the next level and check whether matched method is available or not.
- If matched method is available than it will be considered and if matched method is not available than compiler promote argument once again to the next level.
- This process will be continued until all possible promotion. Still if the matched method is not available than we will get **C.T.E.**

- **byte->sort->int->long->float->double**

- **char->int->long->float->double**


    

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
            }
        }

## Case 2 
- While resolving overloaded method compiler will always give precedence of child type argument than compared with parent type argument.



        class Case2{
            public void m1(String s){
                System.out.println("String version");
            }
            public void m1(Object o){
                System.out.println("Object version");
            }
        }

- o/p
  - String version
  - Object version
  - String version


## Case 3 ambiguous method call

    class Case2{
        public void m1(String s){
            System.out.println("String version");
        }
        public void m1(StringBuffer sb){
            System.out.println("String Buffer");
        }
    }

    Case2 case2 = new Case2();
    case2.m1("Ramanuj");
    case2.m1(new StringBuffer("av"));
    case2.m1(null);

- **case2.m1(null);** Compile-time Error: reference to m1 is ambiguous
  - Argument is null, which is compatible with both String and StringBuffer
  - But Java doesn't know which method to pick, and both are equally specific
  - 🟥 Result: Compile-time error — **ambiguous method call**

- How to fix this **ambiguity**?
- we can explicitly cast null to guide Java:

    
        case2.m1((String) null);        
        case2.m1((StringBuffer) null);  

- ✅ Output: String version
- ✅ Output: String Buffer


## Case 4 



    class Case4{
        public void m1(int i, float f){
            System.out.println("int float");
        }
        public void m1(float f, int i){
            System.out.println("float  int ");
        }
    
    }

    Case4 case4 = new Case4();
    case4.m1(11,11.5f);
    case4.m1(11.5f, 11);
    case4.m1(11,11);

- **case4.m1(11, 11);**
Both are int literals → so Java tries to match m1(int, int)

❌ No such method exists!

- Can Java promote one of the int to float?
    - Yes. Widening from int → float is allowed.
    - But now two candidates match:

    - m1(int, float)
    - m1(float, int)

- 🎯 Both are equally valid after promotion!
-  Result: ❌ Compile-Time Error — ambiguous method call


## Case 5 

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
        Case5 case5 = new Case5();
        Animal a = new Animal();
        case5.m1(a);

        Monkey m = new Monkey();
        case5.m1(m);

        Animal aa = new Monkey();
        case5.m1(aa);
- o/p 
    - Animal version
    - Monkey
    - Animal version

- In overloading method resolution always takes care by **compiler** based on **reference type**.
- In overloading run time object won't any role.






# Overriding 

- What ever methods Parent has by default available to the child through inheritance.
- If child class not satisfied with parent class implementation than child is allowed to redefine that method based on its requirement is called overriding.


  
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
          
          
          ParentClas parentClas = new ParentClas();
          parentClas.property();
          
          ChildClas childClas = new ChildClas();
          childClas.property();
          
          ParentClas parentClas1 = new ChildClas();
          parentClas1.property();

- O/P
  - Parent property
  - Child Property increased
  - Child Property increased


- In overriding method resolution always takes care by **JVM based on run time object** and hence overriding is also consider as **RunTime Polymorphism or Dynamic Polymorphism or Late Binding**.
 ### VVVI  Role of JVM and Compiler
ParentClas parentClas1 = new ChildClas();
parentClas1.property();

- Parent Reference can be hold child object but by using that reference we can call only the method which are present in Parent class. Child specific methods we can't call.
- But here **compiler and JVM role comes**.
- Here parentClas1 is reference of ParentClas type so compiler will check in ParentClas **property() method** is available or not if it is available than compile.
- But at the runtime JVM will check new ChildClas(); is it parent object if it is ParentClas object than no problem.
- But here it is ChildClas object So JVM will go and check is **property() method** overriding(ParentClas) in child class or not.
- If it is not overridden than Parent method will execute but if it is overriding in the child classes than at **runtime object JVM** will execute **child method**. 


## Rules of overriding
1. Method signature must be same
2. In overriding return type must be same but this rule is applicable until 1.4 version only from 1.5 version onwards we can take **co-variant return type**.
   - co-variant return type means if Parent class method return type is object than in child class overriding method return type must be either object type of child class of object type.
   - Parent class method return type is object child class method return type should  object, string, Number, Integer, StringBuffer...
   - If Parent class method return type is Number child class method return type should  Number, Integer

3. co-variant return type concept applicable only for object types not for primitive types.
4. Parent class private method not applicable to the child and hence overriding not applicable for **private method**.
5. Based on our requirement we can define exactly same private methods in child class it is valid but not overriding.
6. We can't override parent class final method in child classes if we are try to override we will get C.T.E.
7. Parent class abstract method we should override in child class to provide implementation.
8. We can override non-abstract method as abstract. The **_main advantage_** of this approach is we can stop this availability of parent method implementation to the next level child class.

                 class P {
                   public void m1(){}
                 }
                 abstract class C extends P{
                   public abstract void m1();
                 }
                 class SubChild extends C{
                   public void m1(){}
                 }

             Parent class method      final           non-final     abstract            synchronized
                                       |                 |           | ^                   | ^
                                       V                 V           V |                   V |
             child class method     final, non-final     final      non-abstract          non-synchronized

9. While overriding we can't reduce scope of access modifier, but we can increase the scope.


        class P{
          public void m1(){
            System.out.println("Parent");
          }
        }
        class C extends P{
          void m1(){
            System.out.println("Child");
          }
        }
        C.T.E. -> m1() in C can't override m1() in P attempting to assign weaker access privileges ('package-private'); was 'public'


        Parent class method         public          protected                  default                      private
                                      
        child class method          public          protected, public       default, protected, public      private method overriding concept can't be applicable for private method


* If Child class method throws any **checked exception** compulsory Parent class method should throw same checked exception otherwise we will get compile time exception.
* But there are no restriction for **unchecked exception**. 

        import java.io.*;
        class P{
            public void m1() throws IOException{
        
            }
        }
        class C extends P{
            public void m1() throws EOFException, InterruptedException{
        
            }
        }
- m1() in C can't override m1() in P; Overridden method doesn't throw java.lang.InterruptedException.




