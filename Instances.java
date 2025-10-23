class Animal {
    void sound(){
        System.out.println("Animal makes sounds");
    }
    void so(){
        System.out.println("Animal makes so");
    }
}

public class Instances {
	public static void main(String[] args) throws Exception {
		Animal obj = Animal.class.newInstance();
		obj.sound();
		obj.so();
	}
}
