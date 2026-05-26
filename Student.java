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
        Student A = new Student();
        A.id = 1 ;
        A.name = "Ramesh";
        A.nos = 5;
        A.age = 16;

        System.err.println(A.name);
        System.err.println(A.age);
        System.err.println(A.id);
        System.err.println(A.nos);
    }
}