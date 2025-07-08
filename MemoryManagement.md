# 🔷 WHAT IS JVM, JRE, AND JDK?
1. ✅ JVM (Java Virtual Machine)
    - What it is: JVM is an abstract machine that enables your Java program to run on any device or OS. It interprets or compiles .class files (bytecode) into machine code for your specific hardware.
    - Why it's important: It provides platform independence (Write Once, Run Anywhere)
    - Handles memory management (GC), security, and performance optimizations 
    - Responsibilities:
      - Loading .class files (via ClassLoader)
      - Verifying bytecode
      - Executing bytecode (via Interpreter or JIT Compiler)
      - Memory Management (Heap, Stack, GC)

2. ✅ JRE (Java Runtime Environment)
   - What it is: JRE is the runtime environment that contains everything required to run Java applications — including the JVM, core libraries, and supporting files.

    - Key Point: JRE = JVM + Java Libraries

3. ✅ JDK (Java Development Kit)
  - What it is:JDK is the full package for Java development. 
  - It includes:
      - JRE
      - Compiler (javac)
      - Debugger (jdb)
      - JavaDoc, and other development tools

  - Key Point: JDK = JRE + Compiler + Dev Tools

            JDK
            ├── JRE
            │    ├── JVM
            │    └── Core Libraries (rt.jar, etc.)
            └── Compiler, Debugger, JavaDoc, etc.


        JVM
        ├── ClassLoader Subsystem
        ├── Runtime Data Areas
        │   ├── Method Area
        │   ├── Heap
        │   ├── Java Stack
        │   ├── PC Register
        │   └── Native Method Stack
        ├── Execution Engine
        │   ├── Interpreter
        │   └── JIT Compiler
        ├── Garbage Collector
        └── Native Interface


### What is the difference between JVM, JRE, and JDK?
* JVM executes Java bytecode.
* JRE provides the environment to run Java programs (includes JVM + libraries).
* JDK is the full development kit (includes JRE + compiler + tools).

### Is JVM platform-dependent?
- The **JVM** is platform-dependent (different for Windows, Linux, Mac), but **bytecode is platform-independent**.
- That’s why we say Java is platform-independent.

### What is the role of ClassLoader in JVM?
- ClassLoader loads .class files (bytecode) into memory when a class is needed during runtime. 
- It's the first part of the JVM lifecycle.

### How is memory managed in JVM?

* **Heap**: Stores objects
* **Stack**: Stores method calls and local variables
* **GC**: Frees memory from unreachable objects in the heap







