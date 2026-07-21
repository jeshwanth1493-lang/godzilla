package thread.OddEvenPrinter;

public class OddEvenPrinter {


    int number = 1;
    int limit = 10;

    public synchronized void oddPrinter() {
        while (number <= limit) {

            if (number % 2 == 0) {
                try {
                    this.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("Inside OddEvenPrinter:"+number);
            number++;

            notify();
        }
    }

    public synchronized void evenPrinter() {
        while (number <= limit) {
            if (number % 2 != 0) {
                try {
                    this.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("Inside OddEvenPrinter:"+number);
            number++;


            notify();
        }
    }
}
