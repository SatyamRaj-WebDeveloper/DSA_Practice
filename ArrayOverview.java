
import java.util.*;

//Taking Input in Java 
class Arrays {
    public static void main(String[] args) {
        //Array Declaration and Allocation
        int arr[] = new int[5];
        int n = arr.length;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i <= n - 1; i++) {
            System.out.println("Please Enter the Value for Index :" + i);
            arr[i] = sc.nextInt();
        }
        for (int val : arr) {
            System.out.print(val + " ");
        }
    }

}

//Sum of Elements in an Array
class ArraySum{
    public static void main(String[] args) {
        //Array Intialization
        int arr[] = {10,20,30,40,50};
        int sum = 0;
        for(int i = 0 ; i<= arr.length-1 ; i++){
            sum += arr[i];
        }
        System.out.print(sum);
    }
}

class ArrayMulti{
    public static void main(String[] args) {
        //Array Intialization
        int arr[] = {1,2,3,4,5};
        int mul = 1 ;
        for(int i = 0 ; i<= arr.length-1 ; i++){
            mul *= arr[i];
        }
        System.out.print(mul);
    }
}

//Find Max in Array
class FindMax{
    public static void main(String[] args) {
        int arr[]={10,50,2,6,70,3,45};
        int max = 0;
        for(int val : arr){
            if(val  > max)
            max = val;
        }
        System.out.print(max);
    }
}