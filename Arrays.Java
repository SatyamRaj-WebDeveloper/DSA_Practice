public class Arrays{
    //Time Complexity --> O(n)
    //Space Complexity --> O(1)
    static double getAverage(int[]arr){
        int n = arr.length;
        double sum =0;
        for(int num : arr){
            sum += num;
        }
        return sum / n;
    }

    public static void main(String[] args){
        double average = getAverage(new int[]{1,2,3,4,5});
        System.out.println("Average: " + average);

    }
}

class Multiply{
    // Time Complexity  --> O(n)
    //Space Complexity  --> O(n)
    static int[] multiplyEachElement(int arr[]){
        int newarr[] = new int[arr.length];
        for(int i =0 ; i< arr.length ;i++){
            newarr[i] = arr[i]*10;
        }
        return newarr;
    }

    public static void main(String[] args){
        int arr[] = multiplyEachElement(new int[]{1,2,3,4,5});
        for(int num : arr){
            System.out.print(num +" ");
        }
    }
}

class findElement{
    //Time Complexity --> O(n)
    //Spce Complexity --> O(1)
    static boolean FindElementLinear(int arr[] ,  int val){
        for(int num : arr){
            if(num == val)
            return true;
        }
        return false;
    }

    public static void main(String[] args){
        System.out.println(FindElementLinear(new int[]{1,2,3,5,6} , 4));
    }
}

class findMax{
    //Time Complexity  --> O(n)
    //Space Complexity  --> O(1)
    static int FindMaxElement(int arr[]){
        int max = arr[0];
        for(int num : arr){
            if(num > max)
            max = num ;
        }
        return max;
    }

    public static void main(String[] args){
        System.out.println(FindMaxElement(new int[]{1,8,96,5,100,4}));
    }
}