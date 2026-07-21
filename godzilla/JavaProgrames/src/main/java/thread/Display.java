package thread;

public class Display {

    public synchronized void display(String msg) {
        for(int i=0;i<10;i++) {
            System.out.println(msg+i);
        }
    }
}
