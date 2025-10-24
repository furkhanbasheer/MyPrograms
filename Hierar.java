class Shape // base class
{
	float length,breadth,radius;
}
class Rect extends Shape // base class
{
	Rect(float l,float b)
	{
	    length = l;
	    breadth = b;
	}
	float rectangleArea()
	{
	    return length*breadth;
	}
}
class Circle extends Shape  //Derived class
{
	    Circle(float r)
	    {
	        radius = r;
	    }
	    float circleArea()
	    {
	        return 3.14f*(radius*radius);
	    }
}

class Square extends Shape
{
    Square(float l)
    {
        length = l;
    }
    float squareArea()
    {
        return length*length;
    }
}
public class Hierar
{
	public static void main(String[] args) {
		Rect o1 = new Rect(2,5);
		System.out.println("area of rectangle = " +o1.rectangleArea());
		
		Circle o2 = new Circle(5);
		System.out.println("area of circle = " +o2.circleArea());
		
		Square o3 = new Square(3);
		System.out.println("area of Square = " +o3.squareArea());
	}
}
