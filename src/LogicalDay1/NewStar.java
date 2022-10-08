package LogicalDay1;

public class NewStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//*****
	    // ****
		//  ***
		//   **
		//    *
		int star =5;
		int space =0;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=space;i++) {
				System.out.print(" ");
			}
			for(int k=1;k<=star;i++) {
				System.out.print("*");
			}space++;
			star--;
			
			System.out.println();
		}
	}

}
