package Encapsulation;


class Whatsapp1
{
	private String MSG = "Hello";
	


public String Send()
{
	return MSG;
}
public void Resend(String MSG)
{
	this.MSG = MSG;
}
}

public class WhatsApp {
	public static void main(String[] args) {
		Whatsapp1 W1 = new Whatsapp1();
		System.out.println(W1.Send());
		W1.Resend("BII");
		System.out.println(W1.Send());
		
	}
	
}
