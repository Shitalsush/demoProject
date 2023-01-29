package projectDemo;

public class Dog extends Animal{

	
	public  void animalSound()
	{
		System.out.println("Sound");
	}

	public static void main(String args[])
	{
		Dog d1=new Dog();
		d1.animalSound();
	}
	
	
}
