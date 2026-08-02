package Pattern.NumberPattern;

import java.util.*;

public class RightAngle {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many rows you want in this pattern?");
        int rows = scanner.nextInt();

//        invertRightAngle(rows);
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
     */
    public static void rightAngle(int rows) {
        for(int i=1;i<=rows;i++){

            for(int j=1;j<=i;j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    /**
     * 12345
     * 1234
     * 123
     * 12
     * 1
     */
    public static void invertRightAngle(int rows) {

        for(int i=rows;i>=1;i--){
            for(int j=1;j<=i;j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    /**
     * 1
     * 2 2
     * 3 3 3
     * 4 4 4 4
     * 5 5 5 5 5
     * 6 6 6 6 6 6
     * 7 7 7 7 7 7 7

     */
    public static void pattern2(int rows) {

        for(int i=1;i<=rows;i++){
            for(int j=1;j<=i;j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    /**
     * 7 7 7 7 7 7 7
     * 6 6 6 6 6 6
     * 5 5 5 5 5
     * 4 4 4 4
     * 3 3 3
     * 2 2
     * 1

     */
    public static void pattern3(int rows) {

        for(int i=rows;i>=1;i--){
            for(int j=1;j<=i;j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    /**
     * 7
     * 7 6
     * 7 6 5
     * 7 6 5 4
     * 7 6 5 4 3
     * 7 6 5 4 3 2
     * 7 6 5 4 3 2 1

     */
    public static void pattern4(int rows) {

        for(int i=rows;i>=1;i--){
            for(int j=rows;j>=i;j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    /**
     * 1
     * 2 1
     * 3 2 1
     * 4 3 2 1
     * 5 4 3 2 1
     * 6 5 4 3 2 1
     * 7 6 5 4 3 2 1
     */
    public static void pattern5(int rows) {

        for(int i=1;i<=rows;i++){
            for(int j=i;j>=1;j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
