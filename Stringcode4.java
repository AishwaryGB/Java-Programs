package Strings.pkg;
import java.util.Scanner;
public class Stringcode4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter the string:");
String str1=sc.nextLine();
str1=str1.toLowerCase();
int vowel=0;
int cons=0;
for(int i=0;i<=str1.length()-1;i++)
	
{
	if(str1.charAt(i)=='a'||str1.charAt(i)=='e'||str1.charAt(i)=='i'||str1.charAt(i)=='o'||str1.charAt(i)=='u')
	{
		vowel++;
	}
	else
	{
		cons++;
	}
}
System.out.println("vowel count="+vowel);
System.out.println("consonent count="+cons);
	}

}
