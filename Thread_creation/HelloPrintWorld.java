public class HelloPrintWorld implements Runnable {
    @Override
    public void run() {

        // TODO Auto-generated method stub
        System.out.println("Thread Name Please:" + Thread.currentThread().getName());

    }
}
