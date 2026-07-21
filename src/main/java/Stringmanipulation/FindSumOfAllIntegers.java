package Stringmanipulation;

public class FindSumOfAllIntegers {

    public static void main(String[] args) {
        System.out.println(findSumOfAllIntegers(7654));
    }

    public static int findSumOfAllIntegers(int num) {
        int total = 0;

        while(num > 0) {
            total = total + num % 10;
            num = num / 10;
        }
        return total;
    }
}
