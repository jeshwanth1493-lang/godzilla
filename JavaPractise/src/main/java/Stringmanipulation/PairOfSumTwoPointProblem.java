package Stringmanipulation;

import java.util.*;

public class PairOfSumTwoPointProblem {

    public static void main(String[] args) {
        int[] numbers = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(numbers,target)));
    }

    public static int[] twoSum(int[] numbers, int target) {

        int i =0;
        int j=numbers.length-1;
        int[] result = new int[2];

        while(i<j) {
            int sum = numbers[i]+numbers[j];
            if(target==sum) {
                result[0]=numbers[i];
                result[1]=numbers[j];
                break;
            }
            else if(sum<target) {
                i++;
            } else {
                j--;
            }
        }
        return result;
    }
}
