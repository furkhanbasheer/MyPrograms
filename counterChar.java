import java.util.Scanner;
public class counterChar
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=s.nextLine();
		System.out.println("Enter Character");
		char target=s.next().charAt(0);
		//int Count=0;
		for(int i=0; i<str.length(); i++) {
			if(target==str.charAt(i))
				// if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
				//Count++;
				System.out.print(target);
		}
	}
}
