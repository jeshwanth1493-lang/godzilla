package Alogirithm;

import java.util.*;

public class SelectionSorting {

    public static void main(String[] args) {

        // Find minimum element
        //swap

        int[] arr = {64, 25, 12, 22, 11};

        for (int i = 0; i < arr.length; i++) {

            int minIndex =i;

            for(int j=i+1;j < arr.length; j++) {
                if(arr[j]<arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp;
            temp = arr[i];
            arr[i]= arr[minIndex];
            arr[minIndex]= temp;
        }

        System.out.println(Arrays.toString(arr));
    }


}
