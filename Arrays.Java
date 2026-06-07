import java.util.*;

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

class AlternateExtreme{
    static int[] findAlternateExtreme(int arr[]){
        int[] ansarr = new int[arr.length];
        int x = 0;
        int i = 0 , j = arr.length-1;
        while( i <= j){
            ansarr[x++] = arr[i];
            ansarr[x++] = arr[j];
            i++;
            j--;
        }
        return ansarr;
    }
    public static void main(String[]args){
        int ans[] = findAlternateExtreme(new int[]{1,2,3,4,5,6});
        for(int num : ans){
            System.out.print(num +", ");
        }
    }
}

class ReverseArray{
    static int[] ReverseAnArray(int arr[]){
        int i =0 , j = arr.length-1;
        while( i <= j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return arr;
    }
    public static void main(String[]args){
        int[]ans = ReverseAnArray(new int[]{1,2,3,4,5,6,7});
        for(int num : ans){
            System.out.print(num +" ");
        }
    }
}

class ShitfArraybyOne{
    static int[] ShiftByOne(int arr[]){
        int last = arr[arr.length-1];
        for(int i = arr.length-1 ; i>0 ; i-- ){
            arr[i] = arr[i-1];
        }
        arr[0] = last;
        return arr;
    }
    public static void main(String[]args){
        int ans[] = ShiftByOne(new int[]{10,20,30,40,50,60,70});
        for(int num : ans){
            System.out.print(num + " ");
        }
    }
}

class Mod{
    static int findModOfArray(int arr[]){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : arr){
            map.put(num  , map.getOrDefault(num , 0)+1);
        }
        // for(int i : map.keySet()){
        //     System.out.println(i + "--> " + map.get(i));
        // }
        int maxfreq = -1;
        int maxfreqKey = -1;
        for( int key : map.keySet()){
            if(map.get(key) > maxfreq){
                maxfreq = map.get(key);
                maxfreqKey = key;
            }
        }
        return maxfreqKey;
    }
    public static void main(String[]args){
        System.out.println(findModOfArray(new int[]{1,2,2,3,3,3,3,4,5,6,6,7}));
        
    }
}

class Union{
    static Set<Integer> printUnionOfArrays(int arr1[] , int arr2[]){
        Set<Integer> st = new HashSet<>();
        for(int num : arr1){
            st.add(num);
        }
        for(int num : arr2){
            st.add(num);
        }
        return st;
    }
    public static void main(String args[]){
        Set<Integer> ansSet = printUnionOfArrays(new int[]{1,2,3,4,5} , new int[]{2,5,6,7});
        for(int number : ansSet){
            System.out.print(number+" ");
        }
    }
}

class SortArray{
    //Time Complexity --> O(n)
    //Space Complexity --> O(1)
    static int[] sortArrayZeorAndOne(int arr[]){
        int i = 0 , j = arr.length-1;
        while(i <= j ){
            if(arr[i] == 0){
                i++;
            }else if(arr[j] == 1){
                j--;
            }else{
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        return arr ;
    }
    public static void main(String[] args){
        int ans[] = sortArrayZeorAndOne(new int[]{1,1,0,1,0,1,1,1,0,0,1});
        for(int num : ans){
            System.out.print(num +" ");
        }
    }
}
