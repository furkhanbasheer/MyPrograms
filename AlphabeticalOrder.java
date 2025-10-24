import java.util.Scanner;
public class AlphabeticalOrder
{
    private int x;
    String str;
    public AlphabeticalOrder()
    {
        x=0;
    }
    public void readInput()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("enter String");
        str = in.nextLine();
    }
    public void arrangeString()
    {
        char ch;
        for(int i = 65;i<90;i++)
        {
            for(int j = 0;j<str.length();j++)
            {
                ch = str.charAt(j);
                if (ch == (char)i || ch == (char)(i+32))
                {
                    System.out.println(ch);
                }
            }
        }
    }
public static void main(String[] args) {
		AlphabeticalOrder AO = new AlphabeticalOrder();
		AO.readInput();
		AO.arrangeString();
}
}
