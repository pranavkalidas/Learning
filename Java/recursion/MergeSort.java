package recursion;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {5,4,7,9,8,6,2,0};
        mergeSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    private static void mergeSort(int[] arr, int start, int end) {
        if(start >= end){
            return;
        }
        int mid = (start + end) /2;
        mergeSort(arr, 0, mid);
        mergeSort(arr, mid+1, end);

        mergeArray(arr,start,end);

        return;
    }

    private static void mergeArray(int[] arr, int start, int end) {
        int mid = (start+end)/2;

        int len1 = mid - start + 1;
        int len2 = end-mid;
        int[] firstHalf = new int[len1];
        int[] secondHalf = new int[len2];

        System.arraycopy(arr,0,firstHalf,0,len1);
        System.arraycopy(arr,mid+1,secondHalf,0,len2);

        System.out.println("F"+Arrays.toString(firstHalf));
        System.out.println("S"+Arrays.toString(secondHalf));

        int i = 0, j = 0, k = 0;
        while(i < len1 && j < len2){
            if(firstHalf[i] > secondHalf[j]){
                arr[k++] = secondHalf[j++];
            }
            else{
                arr[k++] = firstHalf[i++];
            }
        }

        while(i < len1){
            arr[k++] = firstHalf[i++];
        }
        while(j < len2){
            arr[k++] = secondHalf[j++];
        }
        System.out.println("A"+Arrays.toString(arr));
    }
}
