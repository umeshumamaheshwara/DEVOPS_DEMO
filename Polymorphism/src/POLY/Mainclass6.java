package POLY;

class Zomato{
	void Place()
	{
		System.out.println("Ola");
	}
}
class FURNITURE extends Zomato
   {
	void Place()
	{
		System.out.println("Bike----->");
	}
}
class GROCERY extends Zomato{
	void Place()
	{
		System.out.println("Car");
	}
}

class SPORTS extends Zomato{
	void Place()
	{
		System.out.println("Auto");
	}
}
class ORDER
{
	static void FOOD(Zomato  Z1)
	{
		Z1.Place();
	}
}

public class Mainclass6 {
	public static void main(String[] args) {
		FURNITURE F1 = new FURNITURE();
		GROCERY G1 = new GROCERY();
		SPORTS S1 = new SPORTS();
		ORDER.FOOD(F1);
		ORDER.FOOD(S1);
		ORDER.FOOD(G1);
		
		
	}

}
