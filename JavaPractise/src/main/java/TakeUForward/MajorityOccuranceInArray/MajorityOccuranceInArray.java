package TakeUForward.MajorityOccuranceInArray;

public class MajorityOccuranceInArray {

    public static void main(String[] args) {

        int[] nums = {7, 0, 0, 1, 7, 7, 2, 7, 7};
        System.out.println("The majority element is: " + getMajorityElement(nums));
    }

    private static int getMajorityElement(int[] nums) {

        int n = nums.length;

        // Count variable
        int cnt = 0;

        // Candidate element
        int el = 0;

        // Step 1: Find the potential majority element
        for (int i = 0; i < n; i++) {
            if (cnt == 0) {
                cnt = 1;
                el = nums[i];
            } else if (el == nums[i]) {
                cnt++;
            } else {
                cnt--;
            }
        }

        // Step 2: Verify the candidate
        int cnt1 = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == el) {
                cnt1++;
            }
        }

        // Return the element if it's a majority
        if (cnt1 > (n / 2)) {
            return el;
        }

        // No majority found
        return -1;
    }

}
