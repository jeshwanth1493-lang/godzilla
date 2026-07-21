package Pattern.NumberPattern;

import java.util.*;

public class StarPattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many rows?");
        int rows = sc.nextInt();
        pattern4(rows);
    }

    /**
     * *
     * * *
     * * * *
     * * * * *
     * * * * * *
     * * * * * * *
     * * * * * * * *
     */
    public static void pattern1(int rows) {
        for(int i=1;i<=rows;i++) {

            for(int j=1;j<=i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /*
        *
       * *
      * * *
     * * * *
     */
    public static void pattern2(int rows) {

        for(int i=1;i<=rows;i++) {

            for(int j=1;j<=rows-i;j++) {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /*            *
                 **
                ***
               ****
              *****
     */
    public static void pattern3(int rows) {
        for(int i=1;i<=rows;i++) {

            for(int j=2*rows-1;j>i;j--) {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /**
     * *
     * * *
     * * * *
     * * * * *
     * * * * * *
     * * * * * * *
     * * * * * *
     * * * * *
     * * * *
     * * *
     * *
     *
     */
    public static void pattern4(int rows) {
        for(int i=1;i<=rows;i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=rows;i>=0;i--) {
            for(int j=rows;j>=rows-i;j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
