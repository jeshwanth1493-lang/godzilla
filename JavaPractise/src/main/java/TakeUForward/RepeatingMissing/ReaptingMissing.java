package TakeUForward.RepeatingMissing;

import java.util.*;

public class ReaptingMissing {

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 6, 7, 5, 7};
    System.out.println(Arrays.toString(findDuplicate(nums)));
    }

    public static int[] findDuplicate(int[] arr) {

        int[] temp = new int[arr.length+1];
        int[] result = new int[2];

        for(int i=0;i<arr.length;i++){
            temp[arr[i]] += 1;
        }

        for(int i=0;i<temp.length;i++){
            if(temp[i]==2) {
                result[0]=i;
            }
            if(temp[i]==0) {
                result[1]=i;
            }
        }

        return result;
    }
}
