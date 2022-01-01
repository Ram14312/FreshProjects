public class LaunchMaiNN {
    public static void main(String[] args) {


        Runnable r = new Multithreading();
        Thread t1 = new Thread( );
        Thread t2 = new Thread();
        Thread t3 = new Thread( );
        t1.setName("addition");
        t2.setName("subtraction");
        t3.setName("multiply");
        t1.start();
        t2.start();
        t3.start();
    }
}
