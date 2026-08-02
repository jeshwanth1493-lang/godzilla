package Stringmanipulation;

import java.util.Arrays;

public class ReverseString {

    public static void main(String[] args) {

        String a ="Jeshwanth";

        char[] c = a.toCharArray();
        char[] reverse = new char[c.length];
        int j=0;

        for(int i=c.length-1; i>=0; i--) {
            reverse[j++]=c[i];
        }

        System.out.println(reverse);
        reverseString(a);

    }

    public static void reverseString(String a) {

        int i=0;
        int j=a.length()-1;
        char[] word = a.toCharArray();
        while(i<j) {
            char temp = word[i];
            word[i]=word[j];
            word[j] = temp;
            i++;
            j--;
        }

        System.out.println(new String(word));
    }
}
