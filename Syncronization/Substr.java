package Syncronization;

public class Substr implements Runnable{
    Count count;

    Substr(Count count){
        this.count=count;
    }
    
    @Override
    public void run() {
        // TODO Auto-generated method stub
        for(int i=1;i<=1000;i++){
            count.count-=1;
        }
    }
}
