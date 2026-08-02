package thread.Deadlock;

public class B {

    public synchronized void d1(A a) {
        System.out.println("Thread 2 in D1 method");
        System.out.println("Thread 2 Trying to call a last()");
        a.last();
    }

    public synchronized void last() {
        System.out.println("Inside last method of B class");
    }
}
