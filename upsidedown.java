import java.util.Scanner;           
public class upsidedown {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=0,x=(n*2)-1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++)
                System.out.print("  ");
                for (int k=1;k<=x;k++)
                    System.out.print("* ");
                    m++;
                    x-=2;
                     System.out.println();
            }         
        }
}
