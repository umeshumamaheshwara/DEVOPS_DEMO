package POLY;


class Animal
{
	void noise()
	{
		System.out.println("Same Noise");
	}
}

class Dog extends Animal
{
	void noise()
	{
		System.out.println("Bow Bow ");
	}
}

class Cat extends   Animal
{
	void noise()
	{
		System.out.println("Mewow meow");
	}
}
class polymarphism
{
	void poly(Animal a1) {
		
		a1.noise();
		
	}
}


public class Main {
	public static void main(String[] args) {
		Dog D1 = new Dog();
		Cat C1 = new Cat();
		
		polymarphism p1 = new polymarphism();
		p1.poly(C1);
		p1.poly(D1);
		
	}

}
