package Stringmanipulation;

public class SortOddEven {

    public static void main(String[] args) {
        int[] arr = {12, 7, 5, 8, 10, 3, 4};

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            while (left < right && arr[left] % 2 == 0) {
                left++;
            }

            while (left < right && arr[right] % 2 != 0) {
                right--;
            }

            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
