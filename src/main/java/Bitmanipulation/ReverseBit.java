package Bitmanipulation;

public class ReverseBit {


    public static void main(String[] args) {

        System.out.println(reverseBits(43261596));
    }


    public static int reverseBits(int n) {

        int result = 0;

        for (int i = 0; i < 32; i++) {

            // Shift result left to make room
            result <<= 1;

            // Copy last bit of n
            result |= (n & 1);

            // Unsigned right shift n
            n >>>= 1;
        }

        return result;
    }
}
