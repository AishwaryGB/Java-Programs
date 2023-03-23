package Training;

import java.util.Arrays;

public class Arraycode6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr1[]= {10,20,30,40,90,100,2};
int arr2[]= {20,40,90,10,2,100,30};
Arrays.sort(arr1);
Arrays.sort(arr2);
if (arr1.length==arr2.length)
{
	for(int i=0;i<arr1.length;i++)
	{
		if (arr1[i]!=arr2[i])
		{
			System.out.println("array not equal");
			System.exit(0);
		}
	}
	System.out.println("array are equal");
}
else
{
	System.out.println("array not equal");
	
		
	}
		
	}
}

	

