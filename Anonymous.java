class Calculator {
    void square(int x){
        System.out.println(x*x);
    }
}

public class Anonymous {
	public static void main(String[] args) {
		new Calculator().square(7); // Calculator c[] = new Calculator; 
	}
}
