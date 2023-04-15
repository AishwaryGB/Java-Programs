package Training;
import java.util.Scanner;
public class Trymul {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the numerator");
	int num=sc.nextInt();
	System.out.println("enter the denominator");
	int deno=sc.nextInt();
	int res=num/deno;//critical statement
	System.out.println("enter the array size:");
	int size=sc.nextInt();
	int arr[]=new int[size];
	System.out.println("enter the position to which avlue has to be added");
	int pos=sc.nextInt();
	System.out.println("enter the value:");
	int val=sc.nextInt();
	arr[pos]=val;
	System.out.println(res);
}
catch(ArithmeticException e)
{
	System.out.println("arithemtic exception is generated");
	
}
catch(ArrayIndexOutOfBoundsException e1)
{
	System.out.println("arrayindexoutofboundsExceptionOccured");
	
}
catch(NegativeArraySizeException e2)
{
	System.out.println("negativearraysizeexceptionoccured");
}
	}

}
