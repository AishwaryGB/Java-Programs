package Training;
import java.util.Scanner;
public class Arraycode3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("enter the count of movie house:");
Scanner sc =new Scanner(System.in);
int mh=sc.nextInt();
System.out.println("enter the count of theater in movie house");
int  th=sc.nextInt();
System.out.println("enter the count of screens");
int scr=sc.nextInt();
int arr[][][]=new int [mh] [th] [scr];
for(int i=0;i<arr.length;i++)
{
	System.out.println("inside the movie house"+(i+1));
	for(int j=0;j<arr[i].length;j++)
	{
		System.out.println("inside the theater"+(j+1));
		for(int k=0;k<arr[i][j].length;k++)
		{
			System.out.println("enter the capacity of screens"+(k+1));
			arr[i][j][k]=sc.nextInt();
		}
	}
}
System.out.println("-----------");
for(int i=0;i<arr.length;i++)
{
	System.out.println("inside the movie house"+(i+1));
	for(int j=0;j<arr[i].length;j++)
	{
		System.out.println("inside the theater"+(j+1)+"is:"+arr[i][j]);
		for(int k=0;k<arr[i][j].length;k++)
		{
			System.out.println("the fund collected for screen no"+(k+1)+"is:"+arr[i][j][k]);
			int fund=arr[i][j][k]*350;
			System.out.println(fund);
			
		
		}
	}
}

	}
}



