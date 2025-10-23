class Animal
{
    void sound()
    {
        System.out.println("Animals sound");
    }
}
class cat  
{
    void sou()
    {
        System.out.println("cat sou");
    }
}
class dog extends Animal
{
    void sound()
    {
        System.out.println("dog sound barks");
    }
}
class c extends cat
{
    void sou()
    {
        System.out.println("cat sou milk");
    }
}
public class OverRide
{
    public static void main(String[] args)
    {
        Animal a;
        cat b;
        a=new Animal();
        a.sound();
        b=new cat();
        b.sou();
        a=new dog();
        a.sound();
        b=new c();
        b.sou();
    }
}
