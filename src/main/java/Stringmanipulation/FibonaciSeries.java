package Stringmanipulation;

public class FibonaciSeries {

    public static void main(String[] args) {

        int i = 36;

        int first=0;
        int second=1;
        int next=0;

        while(i >= next) {

            next = first + second;
            first = second;
            second = next;
            System.out.println(next);
            if(next == i) {
                System.out.println("Part of fibonaci series");
                break;
            }
        }

        System.out.println("Not Part of fibonaci series");
    }
}
