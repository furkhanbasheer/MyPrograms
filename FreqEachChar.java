import java.util.Scanner;
public class FreqEachChar
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int allpha = 256;
		int count[] = new int[allpha];
		String str=s.nextLine();
		for(int i=0; i<str.length(); i++) {
			count[(int)str.charAt(i)]++;
		}
		for(int i=0; i<256; i++) {
			if(count[i]!=0)
				System.out.println((char) i+" occurred for : "+count[i]);
			}

	}

}
