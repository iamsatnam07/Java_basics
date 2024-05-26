package Mutex;

import java.util.concurrent.locks.Lock;

public class Adder implements Runnable {
    Count count;
    private Lock lock;

    Adder(Count count, Lock lock){
        this.count=count;
        this.lock=lock;
    }
    
    @Override
    public void run() {
        // TODO Auto-generated method stub
        
        for(int i=1;i<=1000;i++){
            lock.lock();
            count.count +=i;
            lock.unlock();
        }
    
    }
}
