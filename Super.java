class parent
{
    String name = "Parent"; // super class means sub class 
}
class Child extends parent
{
    String name = "Child";
    void show()
    {
        System.out.println("Child name: "+ name);
        System.out.println("parent name: "+ super.name); 
    }
}
public class Super {
    public static void main (String[] args) {
    {
        Child o = new Child();
        o.show();
    }
}}
