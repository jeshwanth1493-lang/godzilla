package Pattern.NumberPattern;

import java.util.*;

public class DoubleTrianglePattern {

    public static void main(String[] args) {

        Scanner c = new Scanner(System.in);
        System.out.println("How many rows do u want?");
        int rows = c.nextInt();
        pattern5(rows);
    }

    /**
     * 1
     * 1 2
     * 1 2 3
     * 1 2 3 4
     * 1 2 3 4 5
     * 1 2 3 4 5 6
     * 1 2 3 4 5 6 7
     * 1 2 3 4 5 6
     * 1 2 3 4 5
     * 1 2 3 4
     * 1 2 3
     * 1 2
     * 1
    * */
    public static void pattern1(int rows) {

        //1st triangle
        for(int i=1;i<=rows;i++) {
            for(int j=1;j<=i;j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        rows= rows-1;
        //2nd triangle
        for(int i=1;i<=rows;i++) {
            for(int j=i;j<=rows;j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    /**
     * 1 2 3 4 5 6 7
     * 1 2 3 4 5 6
     * 1 2 3 4 5
     * 1 2 3 4
     * 1 2 3
     * 1 2
     * 1
     * 1 2
     * 1 2 3
     * 1 2 3 4
     * 1 2 3 4 5
     * 1 2 3 4 5 6
     * 1 2 3 4 5 6 7
     * */
    public static void pattern2(int rows) {

        //1st triangle
        for(int i=rows;i>=1;i--) {
            for(int j=1;j<=i;j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        //2nd triangle
        for(int i=2;i<=rows;i++) {
            for(int j=1;j<=i;j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    /**
     * 1234567
     *  234567
     *   34567
     *    4567
     *     567
     *      67
     *       7
     *      67
     *     567
     *    4567
     *   34567
     *  234567
     * 123456
     * */
    public static void pattern3(int rows) {

        //1st triangle
        for(int i=1;i<=rows;i++) {
            for(int j=1;j<=i;j++) {
                System.out.print(" ");
            }
            for(int j=i;j<=rows;j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        //2nd triangle
        for(int i=rows;i>=1;i--) {
            for(int j=1;j<=i;j++) {
                System.out.print(" ");
            }
            for(int j=i;j<=rows ;j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    /**
     *       1
     *      1 2
     *     1 2 3
     *    1 2 3 4
     *   1 2 3 4 5
     *  1 2 3 4 5 6
     * 1 2 3 4 5 6 7
     * */
    public static void pattern4(int rows) {

        //1st triangle
        for(int i=1;i<=rows;i++) {
            for(int j=1;j<=rows-i;j++) {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    /**
     * 7 7 7 7 7 7 7
     *  6 6 6 6 6 6
     *   5 5 5 5 5
     *    4 4 4 4
     *     3 3 3
     *      2 2
     *       1
     * */
    public static void pattern5(int rows) {

        //1st triangle
        for(int i=rows;i>=1;i--) {
            for(int j=1;j<=rows-i;j++) {
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
