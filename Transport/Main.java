//This is an Abstract Class --> Cannot be Instantiated --> Object Cannot be created
abstract class Bird{
    abstract void fly();
    abstract void eat();
}

class sparrow extends Bird{
    //If we extend any Abstract Class we need to define the abstract method in that Abstract Class
    //Override the fly() method
    @Override
    void fly(){
        System.out.println("Sparrow Flew");
    }
    //Override the eat() method
    @Override
    void eat(){
        System.out.println("Sparrow ate");
    }

}
class Crow extends Bird{
    //If we extend any Abstract Class we need to define the abstract method in that Abstract Class
    //Override the fly() method
    @Override
    void fly(){
        System.out.println("Crow Flew");
    }
    //Override the eat() method
    @Override
    void eat(){
        System.out.println("Crow ate");
    }

}
public class Main{
       public static void main(String[] args) {
           Bird sp= new sparrow();
           sp.fly();
           sp.eat();

           sp = new Crow();
           sp.eat();
           sp.fly();
       }
}