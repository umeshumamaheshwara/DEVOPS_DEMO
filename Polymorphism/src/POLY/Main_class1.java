package POLY;

class Game{
	void buy()
	{
		System.out.println("BUY");
	}
}
class Bgmi extends Game
   {
	void buy()
	{
		System.out.println("BAGMI ");
	}
}
class Cod extends Game{
	void buy()
	{
		System.out.println("COD");
	}
}

class COC extends Game{
	void buy()
	{
		System.out.println("COC");
	}
}
class Attack
{
	static void choose(Game G1)
	{
		G1.buy();
	}
}

public class Main_class1 {
	public static void main(String[] args) {
		Bgmi B1 = new  Bgmi();
		Cod C1 = new Cod();
		COC S1 = new COC();
		Attack.choose(B1);
		Attack.choose(C1);
		Attack.choose(S1);
	}
}
