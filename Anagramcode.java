//steps involved
//step-1 collect the strings
//step-2 convert the string into a Char array
//step-3 sort the array
//step-4 compare the array for equality
package Strings.pkg;
import java.util.Scanner;
import java.util.Arrays;
public class Anagramcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//step-1
		Scanner sc=new Scanner(System.in);
		System.out.println("string-1:");
		String s1=sc.next();
		System.out.println("string-2:");
		String s2=sc.next();
		//step-2 
		char[]c1=s1.toCharArray();
		char[]c2=s2.toCharArray();
		//step-3
		Arrays.sort(c1);
		Arrays.sort(c2);
		//step-4
		if (Arrays.equals(c1, c2)) {
			System.out.println("Anagram");
		}
		else
		{
			System.out.println("Not Anagram");
		}
	}


		
	}


