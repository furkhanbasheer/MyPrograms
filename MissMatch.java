import java.io.*;
import java.util.*;
class MissMatch {
	public static void main(String[] args){
	    Scanner sc = new Scanner(System.in);
		try {
		    System.out.println("Enter the Amoubt : ");
		    int amount = sc.nextInt();
		    int balance = 5000;
		    
		    int remaining = balance - amount;
		    System.out.println("Transaction successfull, Remaining  "+ remaining);
			}
		catch(InputMismatchException e ){
		    System.out.println(e);
		}
		
			System.out.println("Program continues normally...");
		
		sc.close();}}
