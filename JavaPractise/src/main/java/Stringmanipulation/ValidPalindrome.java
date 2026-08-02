package Stringmanipulation;

import java.util.Locale;

public class ValidPalindrome {

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));

    }

    public static boolean isPalindrome(String s) {

        String result = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        char[] c = result.toCharArray();
        int i=0;
        int j=c.length-1;

        while(i<j) {
            char temp = c[i];
            c[i]=c[j];
            c[j]=temp;
            i++;
            j--;
        }

        String str = new String(c);
        if(result.equals(str)) {
            return true;
        }
        return false;
    }
}
