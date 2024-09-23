package arrays;

public class removeEvenIntegersFromArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }    

        System.out.println(" ");
        removeEven(arr);

    }

    public static void removeEven(int[] arr){
        int oddCount = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] % 2 != 0){
                oddCount++;
            }
        }
        int[] arr1 = new int[oddCount];

        int index = 0;
        
        for (int i = 0; i < arr.length; i++){
            if (arr[i] % 2 == 0) {
                arr1[index] = arr[i];
                index++;
            }
        }

        for(int i = 0; i < arr1.length; i++){
            System.out.print(arr1[i] + " ");
        }
    }
}
