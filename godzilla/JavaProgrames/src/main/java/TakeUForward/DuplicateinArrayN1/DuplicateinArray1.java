package TakeUForward.DuplicateinArrayN1;

public class DuplicateinArray1 {

    public static void main(String[] args) {

        int[] arr = { 1, 2, 5, 4, 5, 3 };
System.out.println(findDuplicate(arr));

    }

    public static int findDuplicate(int[] arr) {

         int num = arr.length;
        int[] temp = new int[num+1];

        for (int i = 0; i < num; i++) {

            if(temp[arr[i]] == 0) {
                temp[arr[i]] += 1;
                continue;
            }
            if(temp[arr[i]] > 0) {
                return arr[i];
            }
        }
        return 0;
    }
}
