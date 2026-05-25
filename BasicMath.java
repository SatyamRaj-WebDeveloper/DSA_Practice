//Calculating GCD 
class Calculating{
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
    }
}