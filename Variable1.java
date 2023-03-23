package Training;





	class Dog
	{
		String name;
		int cost;
		int age;
		String color;
	}
	public class Variable1 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Dog d=new Dog();
			System.out.println(d.name);
			System.out.println(d.cost);
			System.out.println(d.age);
			System.out.println(d.color);
			d.name="tommy";
			d.cost=5000;
			d.age=7;
			d.color="black";
			
			System.out.println(d.name);
			System.out.println(d.cost);
			System.out.println(d.age);
			System.out.println(d.color);
		}

	}

