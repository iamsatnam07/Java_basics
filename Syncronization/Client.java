package Syncronization;

public class Client {

    public static void main(String[] args){
        Count count=new Count();

        Adder adder=new Adder(count);
        Substr sub=new Substr(count);

        Thread t1 = new Thread(adder);
        Thread t2 = new Thread(sub);

        t1.start();

        t2.start();

        System.out.println(count.count);
    }
}
