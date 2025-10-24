abstract class Animal
{
	abstract void sound();

}
class Dog extends Animal
{
	void sound()
	{
		System.out.println("Dog bars");
	}
}
class Cat extends Animal{
    void sound()
    {
        System.out.println("Cat bars");
    }
}
public class PolyMor {
	public static void main (String [] args ) {
		Cat c = new Cat();
		c.sound();
		Dog d = new Dog();
		d.sound();
	}
}
