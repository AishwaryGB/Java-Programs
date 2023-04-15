package Training;
import java.util.Scanner;
public class Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter the numerator");
int num=sc.nextInt();
System.out.println("enter the denominator");
int deno=sc.nextInt();
int res=num/deno;//critical statement
System.out.println(res);
	}

}
