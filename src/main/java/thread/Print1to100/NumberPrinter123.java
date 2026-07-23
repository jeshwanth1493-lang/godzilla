package thread.Print1to100;

public class NumberPrinter123 {

    private int number = 1;
    private final int limit = 100;

    public synchronized void printNumbers(int remainder) {
        while (number <= limit) {

            while (number % 3 != remainder) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }

            if (number <= limit) {
                System.out.println(Thread.currentThread().getName() + ": " + number);
                number++;
                notifyAll();
            }
        }
    }
}
