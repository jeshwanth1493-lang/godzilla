package TakeUForward.Sort1sN2s;

import ImplementDataStructure.*;

import java.util.*;

public class Sort1s2s {

    public static void main(String[] args) {
        int [] nums = {1, 0, 2, 1, 0,1,2,1,0,0,1,1};
System.out.println(Arrays.toString(sortArray(nums)));
    }

    public static int[] sortArray(int[] nums) {
        int zero=0;
        int one=0;
        int two=0;

        for(int i:nums){
            if(i==0){
                zero++;
            }
            else if(i==1){
                one++;
            }
            else if(i==2){
                two++;
            }
        }

        for(int i=0;i<zero;i++) {
            nums[i]=0;
        }
        for(int i=zero;i<zero+one;i++) {
            nums[i]=1;
        }
        for(int i=zero+one;i<zero+one+two;i++) {
            nums[i]=2;
        }
        return nums;
    }
}
