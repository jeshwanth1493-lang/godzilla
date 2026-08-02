package Stringmanipulation;

public class FIndMissingNumberInArray {

    public static void main(String[] args) {

        int[] arr = {1, 4, 5, 3, 7, 8, 6};
        int n = 8;

        int sum =0;
        for(int a:arr) {
            sum+=a;
        }

        int totalSum = (n*(n+1))/2;

        int missingNumnber = totalSum-sum;
        System.out.println(missingNumnber);
    }
}
