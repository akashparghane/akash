package LogicalDay1;

import java.util.Scanner;

public class ReverseName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter your Name");
		String name = sc.next();
		System.out.println("your name is "+name);
		String rev="";
		for (int i=name.length()-1;i>=0;i--) {
			rev=rev+name.charAt(i);
			
		}
		System.out.println("Your reverse name is "+rev);
		

	}

}
