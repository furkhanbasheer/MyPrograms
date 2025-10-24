class cal 
{
    int add(int a,int b)
    {
        return a+b;
    }
    double add(double a,double b)
    {
        return a+b;
    }
    int add(int a,int b,int c)
    {
        return a+b+c;
    }
}
public class OverLoad
{
    public static void main(String[] args)
    {
       cal c=new cal();
       System.out.println(c.add(1,2));
       System.out.println(c.add(1.2,2.3));
       System.out.println(c.add(1,5,3));
    }
}
