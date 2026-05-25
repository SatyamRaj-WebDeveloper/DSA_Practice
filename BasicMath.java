//Calculating GCD 
class Calculating{

    static int getLCM(int a , int b){
        int gcd = getGCD(a, b);
        int prod = a*b;
        return prod/gcd;
    }

    static int getGCD(int a , int b){
        //gcd(a,b) = gcd(b , a%b)
        while( b != 0){
            int temp = b;
            b = a%b;
            a =  temp ;
        }
        int ans = a;
        return ans;
    }
    public static void main(String[] args){
        System.out.println(getGCD(12, 18));
        System.out.println(getLCM(12,18));
    }
}