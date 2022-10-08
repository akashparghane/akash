package LogicalDay1;

import java.util.Scanner;

public class EvenOddnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the number");
		int number=sc.nextInt();
		if(number%2==0) {
			System.out.println("You Enter the Even numer is "+number);
		}else {
			System.out.println("You enter odd number is "+number);
		}

	}

}
