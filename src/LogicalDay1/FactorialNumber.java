package LogicalDay1;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter the Number");
	    int num = sc.nextInt();
	    int fact = 1;
	    for(int i=num;i>=1;i--) {
	    	fact=fact*i;}
	    System.out.println("Factorial of "+num+ "is "+fact);
	    }

}
