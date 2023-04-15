package Strings.pkg;
import java.util.Scanner;
public class Arraycode5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter the sentence");
String str=sc.next();
int count=1;
for(int i=0;i<str.length()-1;i++)
{
	if((str.charAt(i)==' ')&& (str.charAt(i+1)!=' '))
	{
		count++;
	}
	System.out.println("number of words in an string="+count);
}
	}

}
