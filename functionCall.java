class Car {
	void drive() {
		System.out.println("Car is Driving....");
	}
}
class Bike {
	void ride() {
		System.out.println("Bike is Driving....");
	}
}
public class functionCall {
	public static void main(String[] args) {
		Car m = new Car();
		m.drive();
		Bike n = new Bike();
		n.ride();
	}
}
