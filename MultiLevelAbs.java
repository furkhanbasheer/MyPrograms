abstract class Animal
{
	abstract void eat();

}
abstract class Mammal extends Animal
{
    abstract void sound();
	void sleep()
	{
		System.out.println("Elephant sleep");
	
	}
}
class Elephant extends Mammal{
    void eat()
    {
        System.out.println("Elephant eat");
    }
    void sound()
    {
        System.out.println("Elephant trumpets");
    }
}
public class MultiLevelAbs {
	public static void main (String [] args ) {
		
		Elephant e = new Elephant();
		e.eat();
		e.sound();
		e.sleep();
	}
}
