package thread.OddEvenPrinter;

public class EvenPrinter extends Thread {

    OddEvenPrinter o;

    public EvenPrinter(OddEvenPrinter o) {
        this.o = o;
    }

    public void run() {
        o.evenPrinter();
    }
}
