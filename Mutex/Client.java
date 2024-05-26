package Mutex;

import java.util.concurrent.locks.ReentrantLock;

public class Client {

    public static void main(String[] args){
        Count count=new Count();
        ReentrantLock lock = new ReentrantLock();

        Adder adder=new Adder(count,lock);
        Substr sub=new Substr(count,lock);

        Thread t1 = new Thread(adder);
        Thread t2 = new Thread(sub);

        t1.start();

        t2.start();

        // t1.join();
        // t2.join();

        System.out.println(count.count);
    }
}
