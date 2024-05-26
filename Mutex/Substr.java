package Mutex;

import java.util.concurrent.locks.Lock;

public class Substr implements Runnable{
    Count count;
    private Lock lock;

    Substr(Count count, Lock lock){
        this.count=count;
        this.lock=lock;
    }
    
    @Override
    public void run() {
        // TODO Auto-generated method stub
        for(int i=1;i<=100;i++){
            lock.lock();
            count.count-=i;
            lock.unlock();
        }
    }
}
