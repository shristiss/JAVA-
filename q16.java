import java.util.*;
  class MyCalculator extends Throwable{
    public void power(int n,int p)
    {
        try{
            if(n<0 || p<0)
             {
               throw new Exception("n or p shoulb be non-negative");
             }
             else if(n==0 && p==0)
             {
                 throw new ArithmeticException("n and p cannot be zero");
             }
            int ans=1;
            while(p>0)
            {
                ans*=n;
                p--;
            }
            System.out.println(ans);
    }
    catch(Exception e)
    {
      System.out.println( e.getMessage());
   }
}
 }
 public class q16{
    public static void main(String[] args) {
        MyCalculator ob=new MyCalculator();
        Scanner s=new Scanner(System.in);
        System.out.println("Enter n");
        int n=s.nextInt();
        System.out.println("Enter p");
        int p=s.nextInt();
        ob.power(n, p);
    }
 }


