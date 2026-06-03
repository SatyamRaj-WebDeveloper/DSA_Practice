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

        int n = 1 ;
        for( int i = 0 ; i <= 34 ; i++){
            n = n << 1;
            System.err.println(n);
            System.err.println();
        }
    }
}