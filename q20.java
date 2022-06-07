import java.util.*;
class RationShop{
    boolean ip=false;
    int item;
    synchronized void produce(int x)
    {
        if(ip==true)
        {
            try{
                System.out.println("Producer is waiting for comsumer to consume");
                wait();
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();
            }
            
        }
        item=x;
            ip=true;
            notify();
    }
    synchronized void consume()
    {
        if(ip==false)
        {
            try{
                System.out.println("Consumer is waiting for producer to produce");
                wait();
            }catch(InterruptedException e)
            {
                e.printStackTrace();
            }
        }
        System.out.println("Item consumed");
        ip=false;
        notify();
    }
}
class Producer extends Thread{
 RationShop rs;
 Producer(RationShop rs)
 {
     this.rs=rs;
 }
 public void run()
 {
   for(int i=0;i<3;i++)rs.produce(i);
 }
} 
class Consumer extends Thread{
    RationShop rs;
 Consumer(RationShop rs)
 {
     this.rs=rs;
 }
 public void run()
 {
    
         for(int i=0;i<3;i++)rs.consume();
    
 }
}
public class q20{
    public static void main(String[] args) {
        RationShop rs=new RationShop();
    Producer pr=new Producer(rs);
    Consumer cr=new Consumer(rs);
    pr.start();
    cr.start();
    }
    
}