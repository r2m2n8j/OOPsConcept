# Class Level Modifier
- When ever we are writing our own java class compulsory we have  to provide some information about our class to the **JVM**.
- Whether our class can be accessible from anywhere or not, Whether chld class creation is possible for our class or not.
- For top level class
    * public
    * default
    * abstract
    * final
- For inner class
    * private
    * protected
    * static

- public is accessible from anywhere
- default/package level access We can access only with in the current package.
- abstract modifier is applicable for class & va 


# final modifier
- final is the modifier applicable for classes, methods and variables

1. final method
    - If a method declared as a final then we are not allowed to override that method in the child class.

            class P{
                public final void study(){
                    System.out.println("Study...");
                }
            }
            class C extends P{
                public final void study(){
            
                }
            }

    'study()' cannot override 'study()' in 'P'; overridden method is final

2. final class 
   - if a class create a final then we can't create child class.

            final class P{
            
            }
            class C extends P{
            
            }
        
    Cannot inherit from final 'P'
    - The main advantage of final keyword is we can achieve security as no one is allowed to change our implementation.
    - But the main disadvantage of final keyword is we are missing key benefits of OOP's Inheritance and Polymorphism.

3. final variable
    - **final instance variable**
    - For the normal instance variables it is not required to perform initialization explicitly JVM will provide default value.
    - But for the final instance variable we have to perform initialization whether we are using or not otherwise we will get compile time error.
- **Rule**
  - for the final instance variable we should perform initialization before constructor compilation.
      1. At the time of declaration

              class Test{ 
                  final int x = 10; 
              }
      2. inside instance block
            
              class Test { 
                 final int x;
                 { 
                     x = 10;
                 } 
              }
    3. inside constructor

              class Test{
                  final int x;
                  public Test(){
                      x = 10;
                  }
              }
    4. **Other than these if we are perform initialization anywhere else we will get compile time error.**

  **final static variable**
- For normal static variables it is not required to perform initialization explicitly JVM will always provide default values.
- But for final static variables we should perform initialization explicitly otherwise we will get compile time error.

        class Test{
            static int x;
        }
        
        class Test{
            final static int x;
        }

- **Rule**
  - for the final static variable we should perform initialization before class loading completion.
  - At the time of declaration

          class Test{
              final static int x = 10;
          }
  - inside static block

        class Test{
            final static int x;
            static {
                x = 10;
            }
        }
  - **Otherwise, we will get C.T.E.** 

    
**final local variable**

- For local variable JVM won't provide any default values compulsory we should perform initialization before using that variable.


        class Test{
            public static void main(String[] args) {
                int x;
                System.out.println("Hello");
            }
        }
        o/p = Hello
        class Test{
            public static void main(String[] args) {
                int x;
                System.out.println("x");
            }
        }
        
        C.T.E. x might not have been initialized
 
- Even though local variable declare as the final it is not required to perform initialization if we are not using  that variable.

        class Test{
            public static void main(String[] args) {
                final int x;
                System.out.println("Hello");
            }
        }
        
        o/p Hello

- The only applicable modifier for local variables is final if we are using any other modifier we will get C.T.E.







