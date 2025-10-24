import java.io.*;

class ArrayIndexBound {
	public static void main(String[] args){
		try {
			int a[] = new int[5];
			a[5]=30/0;}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic Exception occurs");
		}
		try{
			int b[] = new int[5];
			b[6]=9;
		}
		
		catch(ArrayIndexOutOfBoundsException e){
		    System.out.println("ArrayIndexOutOfBoundsException");
		}
		
		finally{
		    System.out.println("finally occurs");
		}
		System.out.println("rest of code ");
	}
}
