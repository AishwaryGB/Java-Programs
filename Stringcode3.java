package Strings.pkg;
import java.util.Scanner;
public class Stringcode3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter the string-1:");
String str1=sc.next();
System.out.println("enter the string-2");
String str2=sc.next();
if(str1.equalsIgnoreCase(str2)==true)
{
	System.out.println("strings are equal");
	
}
else
{
	System.out.println("strings are not equal");
}
	}

}
