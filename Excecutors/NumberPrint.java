package Excecutors;

public class NumberPrint implements Runnable {
    public int num;

    NumberPrint(int n) {
        num = n;
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        System.out
                .println("Numbwer that is printing is: " + num + "  From the thread  "
                        + Thread.currentThread().getName());
    }
}
