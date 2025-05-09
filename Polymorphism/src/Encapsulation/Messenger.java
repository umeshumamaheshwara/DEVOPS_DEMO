package Encapsulation;

class firstclass5{
	private String Archiv="archive a chat";
	public String getstory() {
		return Archiv;
	}
	public void setstory(String story) {
		this.Archiv=story;
	}
}

public class Messenger{
     public static void main(String[] args) {
    	 firstclass5 s1 = new firstclass5();
    	 System.out.println(s1.getstory());
    	 s1.setstory("Un-archive a chat");
    	 System.out.println(s1.getstory());
	}
}
