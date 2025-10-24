import java.util.Scanner;           
public class butterfly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=(n*2)-1,x=m,y=0,z=n;
        for(int i=1;i<=m;i++){
            for(int j=1;j<=y;j++)
            System.out.print("  ");
            for (int k=1;k<=x;k++)
                System.out.print(z+" ");
                if(i>=n){
                    z++;
                    y--;
                    x+=2;
                }
                else{
                    z--;
                    x-=2;
                    y++;
                }
                System.out.println();
        }
        }
}
