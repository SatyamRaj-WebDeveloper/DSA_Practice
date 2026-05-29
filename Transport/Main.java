//This is an Abstract Class --> Cannot be Instantiated --> Object Cannot be created
// abstract class Bird{
//     abstract void fly();
//     abstract void eat();
// }
interface  Bird{
    void fly();
    void eat();
}

class sparrow implements  Bird{
    //If we extend any Abstract Class we need to define the abstract method in that Abstract Class
    //Override the fly() method
    @Override
    public void fly(){
        System.out.println("Sparrow Flew");
    }
    //Override the eat() method
    @Override
    public void eat(){
        System.out.println("Sparrow ate");
    }

}
class Crow implements  Bird{
    //If we extend any Abstract Class we need to define the abstract method in that Abstract Class
    //Override the fly() method
    @Override
    public void fly(){
        System.out.println("Crow Flew");
    }
    //Override the eat() method
    @Override
    public void eat(){
        System.out.println("Crow ate");
    }

}
public class Main{

       public static void dobirdStuff(Bird b){
        b.fly();
        b.eat();
       }
       public static void main(String[] args) {
           dobirdStuff(new sparrow());
           dobirdStuff(new Crow());
       }
}