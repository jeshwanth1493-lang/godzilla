package Stringmanipulation;

public class Reverseaddpalidrome {

    public static void main(String[] args) {

       int a = 195;
       while(!checkPalindrome(a)) {

           a= a + reverse(a);

       }

       System.out.println(a);
    }

    public static int reverse(int x) {

        int reverse=0;

        while(x>0) {
            int temp = x%10;
            reverse= reverse*10+temp;
            x=x/10;
        }

        return reverse;
    }

    public static boolean checkPalindrome(int x) {

        if(reverse(x)==x) {
            return true;
        }
        return false;
    }
}


