class college{
    
   void print(String Faculty)
   {
        synchronized(this){
         for(int i=0;i<7;i++)
         {
             System.out.println(i+" "+"is conducted by "+Faculty);
         }
        }
    }
 }
 class Mythread extends Thread{
     college c;
     String name;
     public void run()
     {
         c.print(name);
     }
     public Mythread(college c,String name)
     {
         this.c=c;
         this.name=name;
     }
 }
 
public class q19b {
   public static void main(String[] args) {
    college ci=new college();
    Mythread mt1=new Mythread(ci, "Shristi");
    Mythread mt2=new Mythread(ci,"Sethiya");
    mt1.start();
    mt2.start();
    synchronized(college.class);
   }
    
}
