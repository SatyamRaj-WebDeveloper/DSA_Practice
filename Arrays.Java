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