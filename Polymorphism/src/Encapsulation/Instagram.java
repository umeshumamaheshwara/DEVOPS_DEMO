package Encapsulation;

class Insta
{
	private String MSG = "HHHH";
	
	public String GetMSG()
	{
		return MSG;
	}
	public void SetMSG(String MSG)
	{
		this.MSG = MSG;
	}
}

public class Instagram {
	public static void main(String[] args) {
		Insta I1 = new Insta();
		System.out.println(I1.GetMSG());
		I1.SetMSG("FFFF");
		System.out.println(I1.GetMSG());
	}

}
