abstract class animal
{
    abstract void sound();
    //void animal()
    //{
    //    System.out.println("animal barks");
    //}
    
}
class dog extends animal
{
    void sound()
    {
        System.out.println("dog barks");
    }
}
public class Abs {
    public static void main (String [] args ){
        dog p = new dog();
        p.sound();
        //p.animal();
    } }
