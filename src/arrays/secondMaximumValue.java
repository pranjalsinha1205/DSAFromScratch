package arrays;

public class secondMaximumValue {
    public static void main(String[] args) {
        int[] arr = {1,2,3,41,51};
        int secondMax = secondMaximum(arr);
        System.out.println(secondMax);
    }
    public static int secondMaximum(int[] arr){
        int max = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int maxIndex = 0;
        
        //finding the index of maximum
        for (int i = 0; i < arr.length; i++){
            if (max<arr[i]) {
                max = arr[i];
                maxIndex = i;
            }
        }

        for(int i = 0; i < arr.length; i++){
            if (i == maxIndex) {
                continue;
            }
            else{
                if (max2 < arr[i]) {
                max2 = arr[i];
                }
            }
        }
        return max2;
    }
}
