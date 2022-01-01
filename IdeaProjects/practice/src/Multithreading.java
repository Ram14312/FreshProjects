public class Multithreading implements Runnable {
    int a = 12, b = 13;
    int c = 0;

    public void run() {
        if (Thread.currentThread().getName().equals("addition")) {
            addition();
        } else if (Thread.currentThread().getName().equals("subtraction")) {
            subtraction();
        } else {
            multiply();
        }

    }

    public void addition() {
        c = a + b;
        System.out.println(c);
    }

    public void subtraction() {
        c = a - b;
        System.out.println(c);
    }

    public void multiply() {
        c = a * b;
        System.out.println(c);
    }
}
