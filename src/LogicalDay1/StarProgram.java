package LogicalDay1;

public class StarProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int star=5;
		int space =0;
		for(int i=0;i<=5;i++) {
			for(int j=1;j<=space;j++) {
			System.out.print(" ");
		}

		for(int k=1;k<=star;k++) {
			System.out.print("*");
		}space++;
		star--;
		
		System.out.println();
	}

}}
