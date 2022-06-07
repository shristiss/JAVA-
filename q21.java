import java.util.*;
public class q21 {
    void removeEvenLength(ArrayList<String>arr,int n)
    {
        for(int i=0;i<arr.size();i++)
        {
            String x=arr.get(i);
            if(x.length()%2==0)
            {
                arr.remove(i);
            }

        }
    }
    public static void main(String[] args) {
        ArrayList<String> arr=new ArrayList<String>();
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        for(int i=0;i<n;i++)
        {
            String x=ob.next();
            arr.add(x);
        }
        q21 rm=new q21();
       rm.removeEvenLength(arr,n);
       System.out.println("After removing even lentgh String:-");
        for(int i=0;i<arr.size();i++)
        {
            System.out.println(arr.get(i));
        }
    }
}
