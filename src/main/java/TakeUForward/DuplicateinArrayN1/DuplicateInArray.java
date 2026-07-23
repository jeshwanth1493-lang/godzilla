package TakeUForward.DuplicateinArrayN1;

public class DuplicateInArray {

    public static void main(String[] args) {

        int[] arr = {1, 3, 4, 2, 3};
        System.out.println("The duplicate element is " + findDuplicate(arr));

    }


    static int findDuplicate(int[] arr) {

        int n = arr.length;

        int[] freq = new int[n + 1];

        for (int i = 0; i < n; i++) {
            // return current value if already seen
            if (freq[arr[i]] == 0) {
                // mark as seen
                freq[arr[i]] += 1;
            } else {
                // duplicate found
                return arr[i];
            }
        }
        // fallback if none (per original)
        return 0;
    }



}
