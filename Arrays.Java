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

