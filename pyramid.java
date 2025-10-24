import java.util.Scanner;           
public class pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=(n*2)-1,x=n-1,y=1;    /z=1;
        for(int i=1;i<=m;i++){
            for(int j=1;j<=x;j++)
            System.out.print("  ");
            for (int k=1;k<=y;k++)
                System.out.print("* "); /// (z+””)
                if(i>=n){
                    x++;
                    y-=2;
                }
                else{
                    x--;
                    y+=2;
                }
//z++;
                System.out.println();
        }
        }
}
