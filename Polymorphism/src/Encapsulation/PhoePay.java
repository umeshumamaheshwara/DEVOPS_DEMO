package Encapsulation;

class Phonepay
{
	private int PSW = 9482110;
	public int getPSW()
	{
		return PSW;
	}
	public void setPSW(int PSW)
	{
		this.PSW = PSW;
	}
}

public class PhoePay {
  public static void main(String[] args) {
	  
	  Phonepay P1 = new Phonepay();
	   System.out.println(P1.getPSW());
	   P1.setPSW(123456);
	   System.out.println(P1.getPSW());
}
}
