package Stringmanipulation;

public class SecondLargestNumber {

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(secondLargestNumber(arr1));
    }

    public static int secondLargestNumber(int [] n) {
        int secondLargest = 0;
        int largest = 0;

        for(int i=0; i<n.length;i++) {

            if(n[i]> largest) {
                secondLargest = largest;
                largest = n[i];
            }
        }

        return secondLargest;
    }
}
