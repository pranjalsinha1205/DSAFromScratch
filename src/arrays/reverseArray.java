package arrays;

public class reverseArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.print("Original array: [ ");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.print("]");

        reverse(arr);
        
        System.out.println("");

        System.out.print("Reversed array: [ ");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.print("]");
    }

    public static void reverse(int[] array){
        int p1 = 0;
        int p2 = array.length - 1;
        while (p1<p2) {
            int temp = array[p1];
            array[p1] = array[p2];
            array[p2] = temp;
            p1++;
            p2--;
        }
    }
}
