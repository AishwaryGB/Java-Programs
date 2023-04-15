package Training;

import java.util.Scanner;

public class Try {

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
		catch(ArithmeticException|ArrayIndexOutOfBoundsException|NegativeArraySizeException e)
		{
			System.out.println("exception is generated");
		}
	}

}
