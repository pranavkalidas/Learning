package sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class InsertionSort {

    //Time complexity : O (n^2)

    public static void main(String[] args) {
        int[] arr = {2,8,3,7,5,4,2};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void insertionSort(int[] arr) {
        for(int i=1; i<arr.length; ++i){
            int j = i;
            while(j>0 && arr[j]<arr[j-1]){
                int temp = arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }

//            if(arr[j]==arr[j-1]){
//                System.out.println("TRUE");
//            }
            System.out.println(Arrays.toString(arr));
            System.out.println(j);
        }
    }
}
