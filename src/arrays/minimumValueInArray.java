package arrays;

public class minimumValueInArray {
    public static void main(String[] args) {
        int[] arr = {3,4,-5,6,1,2};
        int min = minimumValue(arr);
        System.out.println(min);
    }
    public static int minimumValue(int[] arr){
        int min = 0;
        if (arr.length<1){
            min  = Integer.MAX_VALUE;
        }
        min = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }
}
