package Training;
import java.util.Scanner;
abstract class Shapes
{
	double area;
	abstract void collect();
	abstract void calculate();
	void display()
	{
		System.out.println("area");
		
	}
}
class Circle extends Shapes{
	double pi=3.142;
	double r;
	void collect() {
		
	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the radius");
	r=sc.nextDouble();	
}
	void calculate()
	{
		area=pi*r*r;
	
	}
}
class Rectangle extends Shapes{
	double l,b;
	void collect()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the length");
		l=sc.nextDouble();
		System.out.println("enter the breadth");
		b=sc.nextDouble();
	}
	void calculate()
	{
		area=l*b;
		
	}
}
class Square extends Shapes{
	double side;
	void collect()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the side");
		side=sc.nextDouble();
	}
	void calculate()
	{
		area=side*side;
	}
}
class Geometry{
	void permit(Shapes s)
	{
		s.collect();
		s.calculate();
		s.display();
		
	}
}
public class Launch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Circle c=new Circle();
Rectangle r=new Rectangle();
Square s=new Square();
Geometry g=new Geometry();
g.permit(c);
g.permit(r);
g.permit(s);
	}

}
