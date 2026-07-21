package TakeUForward.KandaneSumFromString;

public class MaxSumInArray {

    public static void main(String[] args) {
        int[] arr = { -1, 2, 3, -1, 2, -6, 5 };

        System.out.println(maxSumInArray(arr));
    }

    public static int maxSumInArray(int[] arr) {

        int sum = 0;
        int maxSum=Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++) {
            sum += arr[i];

            if(sum>maxSum) {
                maxSum=sum;
            }
            if(sum<0) {
                sum=0;
            }

        }

        return maxSum;
    }
}
