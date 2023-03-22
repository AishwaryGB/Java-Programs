package bldeatraining;

import java.util.Scanner;
public class Program9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter the value of n:");
int n=sc.nextInt();
for(int i=1;i<=n;i++)
{
	for(int j=1;j<=n;j++)
	{
		if (i==1||i==n||j==1||j==n)
		{
			System.out.print(" # ");
		}
		else if(i==2||i==n-1||i==3||i==n-2||j==2||j==n-1||j==3||j==n-2)
		{
			System.out.print(" $ ");
		}
		else
		{
			System.out.print(" * ");
		}
	}
	System.out.println();
}

	}

}
