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

//Two Sum
//Time Complexity ---> O(n^2)
class twoSumBruteForce{
    static int[] twoSum(int arr[] , int target){
        int n =arr.length;
        for(int i = 0 ; i< n;i++){
            for(int j = i+1 ; j<n ;j++){
                if((arr[i]+arr[j]) == target)
                return new int[]{arr[i] , arr[j]};
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[]args){
        int arr[] = {2,5,8,6,3,9,3,5,8};
        int ans[] = twoSum(arr , 8);
        for(int num : ans){
            System.out.print(num +" ");
        }
    }
}

//Two Sum better Approach
class TwoSum{
    static int[] twoSum(int arr[] , int target){
        Map<Integer,Integer>map = new HashMap<>();
        int n = arr.length;
        for(int i = 0 ; i<n ; i++){
            int newTarget = target-arr[i];
            if(map.containsKey(newTarget)){
                return new int[]{map.get(newTarget) , i};
            }
            map.put(arr[i] , i);
        }
        return new int[]{-1,-1};
    }
    public static void main(String[]args){
        int arr[] = {2,4,6,12,3,7,9};
        int ans[] = twoSum(arr , 18);
        for(int num : ans){
            System.out.println("Index :" + num +" ");
        }
    }
}

//Three Sum better
// class ThreeSum{
//      public static List<List<Integer>> threeSum(int[] nums) {
//         List<List<Integer>> list = new ArrayList<>();
//         Arrays.sort(nums);
//         for(int i =0 ; i< nums.length-2 ;i++){
//             if(i >0  && nums[i]==nums[i-1])
//             continue;
//             findTriplets(nums , -nums[i] , i+1 , list);
//         }
//         return list;
//     }
//     public static void findTriplets(int[]nums , int target , int left , List<List<Integer>>list){
//         int right = nums.length-1;
//         while(left < right){
//             int sum = nums[left]+nums[right];
//             if(sum == target){
//                 list.add(Arrays.asList(nums[left] , nums[right] , -target));
//                 left++;
//                 right--;
//                 while(left < right && nums[left] == nums[left-1])
//                 left++;
//                 while(left < right && nums[right] == nums[right+1])
//                 right--;
//             }else if(sum > target){
//                 right--;
//             }else{
//                 left++;
//             }
//         }
//     }
//     public static void main (String[]args){
//         List<List<Integer>> ans = threeSum(new int[]{4,8,9,6,2,5,3,7});
//         for(List<Integer> li: ans){
//             System.out.print(li);
//         }
//     }
// }

//Brute Force
class Duplicates{
    static int[] RemoveSuplicates(int arr[]){
        int i = 0, j=1 , n=arr.length;
        while(j < n){
            if(arr[j] == arr[i])
            j++;
            else{
                i++;
                arr[i]=arr[j];
                j++;
            }
        }
        return arr;
    }

    public static void main(String[]args){
       int ans[] = RemoveSuplicates(new int[]{-20,-20,-16,-2,-1,4,8});
       for(int num : ans){
        System.out.print(num +" ");
       }
    }
}

//Better Approach for Remove Duplicate Array --> Frequency (HashMap)
class Repeating{
    static int findfirstRepeatingElement(int arr[]){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : arr){
            map.put(num , map.getOrDefault(num,0)+1);
        }
        for(int num : arr){
            if(map.get(num)>1)
            return num ;
        }
        return -1;
    }
    public static void main(String[] args){
        System.out.print(findfirstRepeatingElement(new int[]{10,5,3,4,3,5,6}));
    }
}

class findMissing{
    static List<Integer> findMissingElements(int arr[]){
        List<Integer> li = new ArrayList<>();
        int n = arr.length;
        for(int i = 0 ; i<n ; i++){
            int val = Math.abs(arr[i]);
            int position = val-1;
            if(arr[position] > 0){
                arr[position] = -arr[position];
            }
        }
        for(int i = 0 ;i<n ;i++){
            if(arr[i] > 0)
            li.add(i+1);
        }

        return li;
    }
    public static void main(String[]args){
        List<Integer> ans =  findMissingElements(new int[]{8,2,1,10,9,4,6,4,5,6});
        for(int num : ans){
            System.out.print(num+",");
        }
    }
}