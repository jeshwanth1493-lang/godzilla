package thread.Print1to100;

public class NumberPrinter123main {

    public static void main(String[] args) {

        NumberPrinter123 numberPrinter = new NumberPrinter123();
        Thread thread1 = new Thread(() -> numberPrinter.printNumbers(1),"THread1");
        Thread thread2 = new Thread(() -> numberPrinter.printNumbers(2),"THread2");
        Thread thread3 = new Thread(() -> numberPrinter.printNumbers(0),"THread3");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
