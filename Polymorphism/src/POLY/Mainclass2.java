package POLY;

class Flipkart{
	void buy()
	{
		System.out.println("BUY");
	}
}
class Furniture extends Flipkart
   {
	void buy()
	{
		System.out.println("FURNITURE ");
	}
}
class Grocery extends Flipkart{
	void buy()
	{
		System.out.println("GROCERY");
	}
}

class sports extends Flipkart{
	void buy()
	{
		System.out.println("SPORTS");
	}
}
class order
{
	static void select(Flipkart F1)
	{
		F1.buy();
	}
}

public class Mainclass2 {
	public static void main(String[] args) {
		Furniture F1 = new  Furniture();
		Grocery G1 = new Grocery();
		sports S1 = new sports();
		order.select(F1);
		order.select(G1);
		order.select(S1);	
	}

}
