//CLASSES AND OBJECTS IN JAVA

public class Student{
    //Attributes
    public int id;
    public int age;
    public String name;
    public int nos ;

    //Constructor
    //Default Constructor
    public Student(){
        System.out.println("Student Default Constructor Called");
    }
    public Student(int id , int age , String name ,  int nos){
        this.name = name;
        this.age = age;
        this.nos = nos;
        this.id = id;
    }

    //Methods
    public void study(){
        System.out.println(name +" Studying");
    }
    public void sleep(){
        System.out.println(name +" Sleeping");
    }
    public void bunk(){
        System.out.println(name +" Bunking");
    }

    public static void main(String[]args) {
        //Object of the Class Student
        // Student A = new Student();
        // A.id = 1 ;
        // A.name = "Ramesh";
        // A.nos = 5;
        // A.age = 16;

        // System.err.println(A.name);
        // System.err.println(A.age);
        // System.err.println(A.id);
        // System.err.println(A.nos);
        
        // //Method Calling
        // A.bunk();
        // A.sleep();
        // A.sleep();

        //PARAMETERIZED CONSTRUCTOR
        Student A = new Student(1,16,"Ramu" , 8);
        System.out.println(A.name);
        System.out.println(A.age);
        System.out.println(A.nos);
    }
}



//FIRST PILLAR OF OOPS --> ENCAPSULATION
/* Encapsulation binds data and mehthods in a class
Like a Capsule , it combines and binds them together */

/* Encapsulation provides a Security Layer , Hides Ineternal implementation of code and data in a class
Exposes only necessary information to the external world*/


//SECOND PILLAR OF OOPS --> INHERITENCE
//Use Inheritence whenever an IS-A relationship is identified between Objects
/*Inheritence is applied where objects exhibit a hierarichal relationship , signifying a
specialized-generalized connection*/
//Do not Reinvent the Wheel 
/* Example - Animal Hierarchy
   1. Base Class : Animal
   2. Derived Class : Mammal , Reptile , Bird
   3. Explanation : Mammals , reptiles,and birds are all types of animals , forming 
      an IS-A relationship*/

//PROTECTED MEMBERS:
/* 1 . Members declared protected are accessible within the class itself and to its derives class
      But still acts as Private ( i.e needs getters and setters for access)
   2. The protected access modifiers serves two primary purposes:
      A. Encapsulation : Like the private modifer , protected provides a level of encapsulation , ensuring 
         that certain class members are not directly accessible from outside the class . This promotes data hiding
         and prevents external code from modifying or accessing sensitive data directly
      B. Inheritence : Unlike private , protected members can be inherited by derived classes , This means that subclasses 
         have limited access to these members , allowing them to build upon the base class's functionality while maintaining 
         some level of data integriy and control.*/

//Types of Inheritence 
/* 1. Single Inheritence
   2. Multiple Inheritence --> Not Supported In Java (Directly)
   3. Hierarichal Inheritence
   4. Multi-Level Inheritence 
   5. Hybrid Inheritence */

//ADVANTAGES
  /* 1. Reusability
     2. Code modification
     3. Extensibility
     4. Data hiding 
  */

// IMPLEMENTING INHERITENCE IN JAVA
/* 1. Unlike C++ , JAVA dosen't provide an inheritence specifier like public , protected or private .
      i.e , you can not specify mode of Inheritence 
   2. Java does not support multiple Inheritence */

//Code Example of INHERITENCE --> Transport folder --> Vehicle.java



//THIRD PILLAR OF OOPS --> POLYMORPHISM

// A phenomenon that allows an object to have several different forms and behaviours 
// Two Types:- 
    // 1. Compile Time Polymorphism (Static Polymorphism)
    // 2. RunTime Polymorphism

/* METHOD OVERLOADING --> Overloading occurs when a class contains multiple methods sharing 
                           a name but different in argument count or argument type*/
         
     /* Ex -  class calculator{
            int add (int a , int b){
                return a+b;
            }
            int add(int a , int b , int c){
                return a+b+c;
            }
         } */

    //Method Overloading Code Example --> Transport Package --> Calculator.java

/* Operator Overloading --> Java does not support user-defined operator Overloading but internally 
                            overloads certain operators( e.g - + for String concatenation and integer addition)*/


/* Runtime Polymorphism :
    1. Function Overriding :- A subclass can provide a specific implementation of a method 
                              that is already defined in its superclass.
    2. Dynamic Method Dispatch[Upcasting]:- A superclass reference variable can refer to a 
                               subclass object and dynamic dispatch is used to resolve the called method at runtime */

//FOURTH PILLAR OF OOPS --> ABSTRACTION

/* Delivering only the essential information to the outer world while masking the background details*/
// It is a design and programming method that seperates the interface from the implementation

/* Abstraction using Classes:- 
    1. Grouping data members and member functions into classes using access specifiers.
    2. A class can choose which data members are visible to the outside world and which are hidden */

//What is Abstract Class ?
/* An Abstract class in Java is a class that cannot be instantiated on its own and is designed to be subclassed .
   It can serve as a superclass for other classes that share a common structure or behaviour. */ 
/* An abstract class in Java delivers abstraction by serving as a template for its subclasses , allowing for the definition of a common 
   interface without specifiying the complete implementation details */ 
/* It has come from the idea of Abstraction*/