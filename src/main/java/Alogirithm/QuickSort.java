package Alogirithm;

import java.util.*;

public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {2,1,6,3,8,5,7,4};

        quickSort(arr, 0, arr.length - 1);

        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);

            quickSort(arr, low, pivotIndex - 1);   // sort left
            quickSort(arr, pivotIndex + 1, high);  // sort right
        }
    }

    public static int partition(int[] arr, int low, int high) {

        int pivot = arr[high];
        int i= low-1;

        for(int j=low;j<high;j++) {
            if(arr[j]< pivot) {
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

            }
        }

        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }


}
