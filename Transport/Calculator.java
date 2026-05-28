public class Calculator{
    int add(int a , int b){
        return a+b;
    }
    //Method Overloading
    int add(int a, int b , int c){
        return a+b+c;
    }
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