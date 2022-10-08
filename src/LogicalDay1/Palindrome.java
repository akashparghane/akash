package LogicalDay1;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter your name");
		String name = sc.next();
		String rev="";
		for (int i = name.length()-1; i>=0; i--) {
			rev=rev+name.charAt(i);
		}
		System.out.println("Reverse name of your name is "+rev);
		if(rev.equals(name)) {
			System.out.println("Your name is Palindrome");}
			else {
				System.out.println("Your name is not palindrome");
			}
		}

	}


