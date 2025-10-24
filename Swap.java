import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = "", str2 = "";
        
        System.out.print("Enter a String: ");
        str1 = sc.nextLine();  // use nextLine() to include spaces
        
        for (int i = 0; i < str1.length(); i++) {
            char c = str1.charAt(i);
            
            if (Character.isUpperCase(c)) {
                str2 += Character.toLowerCase(c);
            } else if (Character.isLowerCase(c)) {
                str2 += Character.toUpperCase(c);
            } else {
                str2 += c;
            }
        }
        
        System.out.println("Swapped String = " + str2);
        sc.close();
    }
}
