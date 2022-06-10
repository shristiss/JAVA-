import java.util.*;
public class q14
{
	public static void main(String[] args) {
	    int a,b;
	   //case 1
	    Scanner ob=new Scanner(System.in);
	    a=ob.nextInt();
	    b=ob.nextInt();
		int c=a/b;
		System.out.println(c);
// 		//case 2
// // 		Scanner ob=new Scanner(System.in);
// // 		a=ob.nextInt();
// // 		b=ob.nextInt();
// // 		try{
// // 		    int c=a/b;
// // 		    System.out.println(c);
// // 		}
// // 		catch(Exception e)
// // 		{
// // 		    System.out.println("Divide by zero exception caught");
// // 		}
// //   case 3
// //         Scanner ob=new Scanner(System.in);
// // 		a=ob.nextInt();
// // 		b=ob.nextInt();
// // 		if(b==0)throw new ArithmeticException("Divide by 0 exception");
// // 		int c=a/b;
// // 		System.out.println(c);
//         //case 4
//         Scanner ob=new Scanner(System.in);
//         a=ob.nextInt();
//         b=ob.nextInt();
//         try{
//             if(b==0)throw new ArithmeticException("exception caught");
//             int c=a/b;
//             System.out.println(c);
//         }
//         catch(ArithmeticException e)
//         {
//             System.out.println(e.getMessage());
//         }

	}
}
