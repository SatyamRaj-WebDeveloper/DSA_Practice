public class Bitwise{
    public static void main(String[] args) {
        int a = 5 ;
        int b = 6 ;
        // System.out.println("a & b = " + (a & b)); // 4
        // System.out.println("a | b = " + (a | b)); // 7
        // System.out.println("a ^ b = " + (a ^ b)); // 3
        // System.out.println("~a = " + (~a)); // -6
        // System.out.println("a << b = " + (a << b)); // 320
        // System.out.println("a >> b = " + (a >> b)); // 0
        // System.out.println("a >>> b = " + (a >>> b)); // 0
        // Left Shift Operator ( << ) number gets multiplied by 2 ( num << i --> num * 2^i)
        int n = 1 ;
        for( int i = 0 ; i <= 34 ; i++){
            n = n << 1;
            System.err.println(n);
            System.err.println();
        }
        // Right Shift Operator ( >> ) number gets divided by 2 ( num >> i --> num / 2^i)
        int m = 100;
        for(int i = 0 ; i<=10 ;i++){
            m = m >> 1;
            System.err.println(m);
            System.err.println();
        }


    }
}

class CheckEvenOdd{
    public static void main(String[] args) {
        int n = 10;
        if((n & 1) == 0){
            System.err.println("Even");
        }else{
            System.err.println("Odd");
        }
    }
}

class CheckPowerOfTwo{
    public static void main(String[] args) {
        int n = 16;
        if((n & (n-1)) == 0){
            System.err.println("Power of Two");
        }else{
            System.err.println("Not a Power of Two");
        }
    }
}

class SwapTwoNumbers{
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.err.println("a = " + a);
        System.err.println("b = " + b);
    }
}