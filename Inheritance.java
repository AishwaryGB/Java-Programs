package Training;
class Plane{
	void takeoff()
	{
		System.out.println("plane takeoff");
	}
	void fly() {
		System.out.println("plne is flying");
	}
	void land() {
	System.out.println("plane landed");
	}
}
class cargoplane extends Plane{
	void fly()
	{
		System.out.println("cargo plane is flying at low heights");
	}
	void Carrygoods()
	{
		System.out.println("cargoplane carry goods");
	}
}
class fighterplane extends Plane{
	void fly()
	{
		System.out.println("fighter plane if flying at great heights");
	}
	void carryweapons()
	{
		System.out.println("fighter plane carry weapons");
	}
}
class passengerplane extends Plane{
	void fly()
	{
		System.out.println("passenger plane is flying at medium heights");
	}
	void carrypassengers() {
		System.out.println("passenger plane carry passengers");
	}
}
public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
cargoplane cp=new cargoplane();
fighterplane fp=new fighterplane();
passengerplane pp=new passengerplane();
cp.takeoff();
cp.fly();
cp.land();
cp.Carrygoods();
System.out.println("----");
fp.takeoff();
fp.fly();
fp.land();
fp.carryweapons();
System.out.println("-----");
pp.takeoff();
pp.fly();
pp.land();
pp.carrypassengers();
System.out.println("------");
	}

	}


