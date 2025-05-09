package POLY;

class ola{
	void book()
	{
		System.out.println("Ola");
	}
}
class MINI extends ola
   {
	void book()
	{
		System.out.println("Bike----->");
	}
}
class PRIME extends ola{
	void book()
	{
		System.out.println("Car");
	}
}

class Auto extends ola{
	void book()
	{
		System.out.println("Auto");
	}
}
class Ride
{
	static void Choose(ola o1)
	{
		o1.book();
	}
}

public class Mainclass {
	public static void main(String[] args) {
		MINI M1 = new MINI();
		PRIME P1 = new PRIME();
		Auto A1 = new Auto();
		Ride.Choose(M1);
		Ride.Choose(P1);
		Ride.Choose(P1);
		
		
		
	}

}
