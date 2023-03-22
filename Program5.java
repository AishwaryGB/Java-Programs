/**
 * 
 */
package bldeatraining;

/**
 * @author zoya
 *
 */
import java.util.Scanner;
public class Program5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter the age:");
int age=sc.nextInt();
if (age<18)
{
	System.out.println("you are still young");	
}
else if (age>65)
{
	System.out.println("you are too old");
}
else
{
	System.out.println("you are elgible to be groom");
}

	}

}
