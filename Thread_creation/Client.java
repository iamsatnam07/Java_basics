// package satnam;

public class Client {
  public static void main(String[] args) {

    // HelloPrintWorld p = new HelloPrintWorld();
    // Thread tr = new Thread(p);
    // tr.start();

    // System.out.println("Current thread Please:" +
    // Thread.currentThread().getName());
    for (int i = 1; i <= 100; i++) {
      PrintHundred ph = new PrintHundred(i);
      Thread tr = new Thread(ph);
      tr.start();
    }

  }
}