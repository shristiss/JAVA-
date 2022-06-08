class college{
   synchronized public void print(String Faculty)
    {
        for(int i=0;i<7;i++)
        {
            System.out.println(i+" "+"is conducted by "+Faculty);
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
    Mythread(college c,String name)
    {
        this.c=c;
        this.name=name;
    }
}

public class q19a {
    public static void main(String[] args) {
        college ci=new college();
        Mythread mt1=new Mythread(ci, "Shristi");
        Mythread mt2=new Mythread(ci,"Sethiya");
        mt1.start();
        mt2.start();
    }
}
