package thread.OddEvenPrinter;

public class MainPrinter {

    public static void main(String[] args) {
        OddEvenPrinter printer = new OddEvenPrinter();
        OddThread oddThread = new OddThread(printer);
        EvenPrinter evenPrinter = new EvenPrinter(printer);
        oddThread.start();
        evenPrinter.start();
    }
}
