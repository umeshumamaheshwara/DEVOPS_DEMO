package POLY;

class SBI
{
	private String PWD = "SBI1234";


   public String FUCK()
  {
	return PWD;
  }
   
   public String suck(String a) 
   {
	    PWD = a;
	    return a;
   }
 }

public class Encapsulation {
	public static void main(String[] args) {
		SBI S1 = new SBI();
		System.out.println(S1.FUCK());
		S1.suck("uffff");
		System.out.println(S1.FUCK());
		
	}

}
