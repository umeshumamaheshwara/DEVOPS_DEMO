package POLY;

class Instagram{
	void Status()
	{
		System.out.println("Ola");
	}
}
class Photo extends Instagram
   {
	void Status()
	{
		System.out.println("Photo");
	}
}
class Video extends Instagram{
	void Status()
	{
		System.out.println("Status");
	}
}

class Text extends Instagram{
	void Status()
	{
		System.out.println("Text");
	}
}
class Stimulator1
{
	static void Choose(Instagram I1)
	{
		I1.Status();
	}
}

public class Mainclass4 {
	public static void main(String[] args) {
		Photo P1 = new Photo();
		Video V1 = new Video();
		Text T1 = new Text();
		Stimulator1.Choose(P1);
		Stimulator1.Choose(V1);
		Stimulator1.Choose(T1);
		
	}

}
