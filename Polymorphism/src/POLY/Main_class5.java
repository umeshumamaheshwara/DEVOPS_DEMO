package POLY;

class Rapido{
	void book()
	{
		System.out.println("Ola");
	}
}
class BIKE extends Rapido
   {
	void book()
	{
		System.out.println("Bike----->");
	}
}
class CAR extends Rapido{
	void book()
	{
		System.out.println("Car");
	}
}

class AUTO extends Rapido{
	void book()
	{
		System.out.println("Auto");
	}
}
class Ride1
{
	static void Choose(Rapido R1)
	{
		R1.book();
	}
}

public class Main_class5 {
	public static void main(String[] args) {
		BIKE B1 = new BIKE();
		CAR C1 = new CAR();
		AUTO A1 = new AUTO();
		Ride1.Choose(B1);
		Ride1.Choose(C1);
		Ride1.Choose(A1);
		
		
		
	}

}

