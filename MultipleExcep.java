import java.io.*;

class MultipleExcep {
	public static void main(String[] args){
		try {
			int a[] = new int[5];
			a[5]=30/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic Exception occurs");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array Index Out Of Bounds Exception occurs");
		}
		catch(Exception e)
		{
			System.out.println("parent Exception occurs");
		}
		System.out.println("rest of code ");
	}
}
