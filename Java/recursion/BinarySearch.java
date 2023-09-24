package recursion;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {3,1,4,5,7,6,9,4};  //1, 3, 4, 4, 5, 6, 7, 9
        Arrays.sort(arr);
        int key = 10;
        int index = BinarySearchByRecursion(arr,key,arr.length);
        if(index == -1){
            System.out.println("Key not found");
        }
        else{
            System.out.println("Key found at index: "+index);
        }
    }

    private static int BinarySearchByRecursion(int[] arr, int key, int length) {
        return helperBinary(arr,key,0,length-1);
    }

    private static int helperBinary(int[] arr, int key, int start, int length) {
        if(start > length){
            return -1;
        }
        int mid = (start + length)/2;
        if(arr[mid] == key){
            return mid;
        }
        if(arr[mid] > key){
            return helperBinary(arr,key,start,mid-1);
        }
        return helperBinary(arr,key,mid+1,length);
    }
}
