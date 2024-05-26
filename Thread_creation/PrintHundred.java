public class PrintHundred implements Runnable {
    int n;

    PrintHundred(int n) {
        this.n = n;
    }

    @Override
    public void run() {

        System.out.println("Pirnt the num:" + n + "from the thread  " + Thread.currentThread().getName());
    }
}
