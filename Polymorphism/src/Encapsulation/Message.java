package Encapsulation;

class firstclass6{
	private String bloked="block a contact";
	public String getstory() {
		return bloked;
	}
	public void setstory(String story) {
		this.bloked=story;
	}
}

public class  Message{
     public static void main(String[] args) {
    	 firstclass6 s1 = new firstclass6();
    	 System.out.println(s1.getstory());
    	 s1.setstory("Un-Block a contact");
    	 System.out.println(s1.getstory());
	}
}
