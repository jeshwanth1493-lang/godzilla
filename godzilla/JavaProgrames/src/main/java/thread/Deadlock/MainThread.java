package thread.Deadlock;

public class MainThread extends Thread {

    A a = new A();
    B b = new B();

    public void m1() {
        this.start();
        a.d2(b);
    }

    public void run() {
        b.d1(a);
    }
    public static void main(String[] args) {
        MainThread mainThread = new MainThread();
        mainThread.m1();

    }
}
