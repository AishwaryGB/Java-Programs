package Strings.pkg;


public class Stringcode2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="RAJARAMMOHANROY";
System.out.println(str.length());
System.out.println(str.toUpperCase());
System.out.println(str.toLowerCase());
System.out.println(str. charAt(1));
//System.out.println(str.charAt(120));//
int a=10+str.charAt(1);
System.out.println(a);
System.out.println(str.indexOf('R'));
System.out.println(str.indexOf('Z'));
System.out.println(str.startsWith("Raja"));
	System.out.println(str.endsWith("Roy"));
	System.out.println(str.endsWith("Boy"));
	System.out.println(str.startsWith("Ram"));
	System.out.println(str.contains("Mohan"));
	System.out.println(str.contains("mohan"));
	System.out.println(str.contains("Rohan"));
	}
}
