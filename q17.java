import java.util.*;
public class q17 //: 01101111010
{
	public static void main(String[] args) {
		Scanner ob=new Scanner(System.in);
		String temp=ob.nextLine();
		int count1=0,ans=0;
		for(int i=0;i<temp.length()-1;)
		{
		    if(temp.charAt(i)!='1')
		    {
		       int j=i+1;
		       while(temp.charAt(j)!='0')
		       {
		           count1++;
		           j++;
		       }
		      
		       if(count1>=1)
		       {
		           ans++;
		           i=j;
		           
		       }
		       else i++;
		    }
		}

	  System.out.println(ans);
	}
}

