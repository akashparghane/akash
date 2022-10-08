package LogicalDay1;

import java.util.Iterator;
import java.util.Scanner;

public class Multification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int num1=2;
		//int num2=3;
		//int sum=0;
		//for(int i=1;i<=num2;i++) {
			// sum=sum+num1;}
		//System.out.println("Mutification value is "+sum);
			 
			Scanner sc= new Scanner(System.in);
			System.out.println("Please enter first value");
			int num1 = sc.nextInt();
			System.out.println("Please enter second value");
			int  num2= sc.nextInt();
			System.out.println("Please enter sum value");
			int  sum= sc.nextInt();
			for(int i=1;i<num2;i++) {
				sum=sum+num2;}
			System.out.println("Your Multification is "+sum);
				
			
		

	}

}
