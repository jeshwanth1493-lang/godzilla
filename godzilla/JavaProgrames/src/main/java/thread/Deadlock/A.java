package thread.Deadlock;

public class A {

    public synchronized void d2(B b) {
        System.out.println("Thread 1 in D2 method");
        System.out.println("Thread 1 Trying to call b last()");
        b.last();
    }

    public synchronized void last() {
        System.out.println("Inside last method of A class");
    }
}
