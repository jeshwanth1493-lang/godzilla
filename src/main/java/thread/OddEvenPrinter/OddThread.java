package thread.OddEvenPrinter;

public class OddThread extends Thread {
    OddEvenPrinter o;

    public OddThread(OddEvenPrinter o) {
        this.o = o;
    }

    public void run() {
        o.oddPrinter();
    }
}
