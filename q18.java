import java.io.File;
import java.io.IOException;
import java.net.SocketPermission;
import java.util.*;
import java.lang.Throwable;
public class q18 {
    boolean ispalindrome(String s)
    {
            int low, high;
          low = 0;
          int counter=0;
        high = s.length()-1;
        while (low<high) {
        if (s.charAt(low) != s.charAt(high)) {
        return false;
        }
        low++;
        high--;
        }
        counter+=1;
        return true;
    }
    public static void main(String[] args) throws IOException  {
        int ans=0;
        q18 q=new q18();
        File fi=new File("C:\\Users\\sethi\\Desktop\\handle.txt");
        boolean result;
        try{
            result=fi.createNewFile();
            if(result)
            {
                System.out.println("File created successfully!!");
            }
            else{
                System.out.println("file already exist");
            }
        }catch(IOException e)
        {
            e.printStackTrace();
        }
        Scanner ob=new Scanner(fi);
        while(ob.hasNext())
        {
            String word=ob.nextLine();
            String[] words = word.split("\\W");
           for(int i=0;i<words.length;i++)
            {
                if(q.ispalindrome(words[i]))
                {
                    ans++;
                }
            }
            
        }
       System.out.println("Palindromic words->"+" "+ans); 
    }
}
