package Stringmanipulation;

//find Continues SubArray whose sum is equals target
public class SlidingWIndowTechnique {

    public static void main(String[] args) {

        int[] arr = {2,3,1,2,4,3};
        int target = 7;

        int start =0;
        int currentSum =0;

        for(int end=0; end<arr.length; end++) {

            currentSum += arr[end];

            if(currentSum>target && start<end) {
                currentSum -= arr[start];
                start++;
            }

            if(currentSum==target) {

                for(int i=start;i<=end;i++) {
                    System.out.print(arr[i]+" ");
                }
            }
        }
    }
}
