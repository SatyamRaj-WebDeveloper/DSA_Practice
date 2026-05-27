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