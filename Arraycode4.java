package Training;
import java.util.Scanner;

public class Arraycode4 {
public static int linearSearch(int arr[],int key)
{
for(int i=0;i<arr.length;i++)
{
	if (arr[i]==key)
	{
		return(i+1);
		
	}
}
return 0;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter the array element to be searched");
int key=sc.nextInt();
int arr[]= {10,209,30,40,79,88,90,78};
int res=linearSearch(arr,key);
if (res>0)
{
	System.out.println("element found in position"+(res));
}
else
{
	System.out.println("element not found");
}
	}

}

