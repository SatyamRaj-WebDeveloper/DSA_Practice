
public class Calculator{
    // COMPILE TIME POLYMORPHISM
    int add(int a , int b){
        return a+b;
    }
    //Method Overloading
    int add(int a, int b , int c){
        return a+b+c;
    }
    //Method Overloading
    double add(double a  , double b , int c){
        return a+b+c;
    }
}

class Test{
    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println(c.add(1,5));
        System.out.println(c.add(2.4,5.8,6));
        System.out.println(c.add(5,8,3));


    }
}

class shape{
    public void draw(){
        System.out.print("Drawing Shape");
    }
}
class Rectangle extends shape{
    //METHOD OVERRIDING --> Runtime Polymorphism
    public void draw(){
        System.out.println("Drawing Rectangle");
    }
}

class Circle extends shape{
    //METHOD OVERRIDING --> Runtime Polymorphism 
    public void draw(){
        System.out.println("Drawing Circle");
    }
    public static void main(String[] args) {
        Circle c = new Circle();
        c.draw();
        Rectangle rec = new Rectangle();
        rec.draw();
        shape sh =  new shape();
        sh.draw();
    }
}