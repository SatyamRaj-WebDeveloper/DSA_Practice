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

class CalculateSum{
    static int[] CalculateSumOfPositive(int arr[]){
        int sumpos = 0 , sumneg = 0;
        for(int num : arr){
            if(num > 0)
            sumpos += num;
            else
            sumneg += num;
        }
        return new int[]{sumpos , sumneg};
    }

    public static void main(String[]args){
        int arr[] = CalculateSumOfPositive(new int[]{1,2,-4,-9,6,-2,5});
        for(int num : arr){
            System.out.print(num + " ,");
        }
    }
}


class ZeroAndOne{
    static int[] CountZerosandOnes(int arr[]){
        int zero = 0 , one =0;
        for(int num : arr){
            if(num == 0)
            zero++;
            else
            one++;
        }
        return new int[]{zero , one};
    }
    public static void main(String[]args){
        int arr[] = CountZerosandOnes(new int[]{0,0,0,1,1,1,1,1,0,1});
        System.out.println("Zero Count : "+arr[0]);
        System.out.println("One COunt : "+ arr[1]);
    }
}

class UnsortedArray{
    static int findFirstElement(int arr[]){
        for(int i =0 ; i< arr.length ; i++){
            if(arr[i+1] <= arr[i])
            return arr[i+1];
        }
        return -1;
    }

    public static void main(String[] args){
        int ans = findFirstElement(new int[]{1,5,6,2,7,8,9,10});
        System.out.println(ans);
    }
}
class InterSectionElement{
    static int[] findIntersectionElement(int arr1[] , int arr2[]){
         int x = 0 ;
         int[]newarr = new int[arr1.length];
         for(int i = 0; i < arr1.length ; i++){
            for(int j = 0 ; j< arr2.length ;j++){
                if(arr1[i] == arr2[j])
                newarr[x++] = arr1[i];
            }
         }
         return newarr;
    }
    public static void main(String[]args){
        int ans[] = findIntersectionElement(new int[]{1,2,3,4,5} , new int[]{2,5,6,7,8});
        for(int num : ans){
           if(num > 0 ){
            System.out.print(num +" ");
           }
        }
    }
}