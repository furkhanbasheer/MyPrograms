import java.util.Scanner;
public class dayCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int dd,mm,yyyy,sum=0;
    System.out.print("Enter date in dd mm yyyy format: ");
    dd=sc.nextInt();
    mm=sc.nextInt();
    yyyy=sc.nextInt();
    switch (mm-1) {
        case 12 : sum+=31;
        case 11 : sum+=30;
        case 10 : sum+=31;
        case 9 : sum+=30;
        case 8 : sum+=31;
        case 7 : sum+=31;
        case 6 : sum+=30;
        case 5 : sum+=31;
        case 4 : sum+=30;
        case 3 : sum+=31;
        case 2 : sum+=28;
        case 1 : sum+=31;
    }
    System.out.println(sum+dd);
}
}
