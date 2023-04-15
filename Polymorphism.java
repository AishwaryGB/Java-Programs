package Training;
class Animal
{
	void eat()
	{
		System.out.println("animal eats");
		
	}
	void sleep()
	{
		System.out.println("animal sleep");
	}
	void breathe()
	{
		System.out.println("animal breathe");
	}
}
class Elephant extends Animal
{
	void eat()
	{
		System.out.println("elephant is eating sugarcane");
	}
}
class Lion extends Animal
{
	void eat()
	{
		System.out.println("lion is eating meat");
	}
}
class Monkey extends Animal{
	void eat()
	{
		System.out.println("monkey is eating banana");
	}
}
public class Polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Elephant e=new Elephant();
Lion l=new Lion();
Monkey m=new Monkey();
Animal ref;
ref=e;
ref.sleep();
ref.eat();
ref.breathe();
System.out.print("-------");
ref=l;
ref.sleep();
ref.eat();
ref.breathe();
System.out.print("-----");
ref=m;
ref.sleep();
ref.eat();
ref.breathe();
	}
}
	

