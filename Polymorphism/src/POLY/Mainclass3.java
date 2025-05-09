package POLY;

class Whatsapp{
	void features()
	{
		System.out.println("Whatsapp");
	}
}
class Chats extends Whatsapp
   {
	void features()
	{
		System.out.println("Chats");
	}
}
class Status extends Whatsapp{
	void features()
	{
		System.out.println("Status");
	}
}

class Calls extends Whatsapp{
	void features()
	{
		System.out.println("Calls");
	}
}
class Stimulator
{
	static void Choose(Whatsapp w1)
	{
		w1.features();
	}
}

public class Mainclass3 {
	public static void main(String[] args) {
		Chats C1 = new Chats();
		Status S1 = new Status();
		Calls Ca1 = new Calls();
		Stimulator.Choose(C1);
		Stimulator.Choose(S1);
		Stimulator.Choose(Ca1);
		
		
		
	}

}
