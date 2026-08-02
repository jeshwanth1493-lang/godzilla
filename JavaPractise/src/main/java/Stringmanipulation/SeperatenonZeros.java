package Stringmanipulation;

import java.util.*;

public class SeperatenonZeros {

    public static void main(String[] args) {

        int[] arr = {1, 0, 2, 0, 3, 0, 4};
        int index = 0;

        // Move non-zero elements forward
        for(int i=0;i<arr.length;i++) {
            if(arr[i]!=0) {
                arr[index]=arr[i];
                index++;
            }
        }
        // Fill remaining positions with zeros
        while(index<arr.length) {
            arr[index]=0;
            index++;
        }

        System.out.println(Arrays.toString(arr));
        zeroFirst(arr);

    }

    public static void zeroFirst(int[] arr) {

        int index = arr.length-1;

        for(int i=index;i>=0;i--) {

            if(arr[i] !=0) {
                arr[index]=arr[i];
                index--;
            }
        }

        while(index>=0) {
            arr[index]=0;
            index--;
        }

        System.out.println(Arrays.toString(arr));
    }
}
