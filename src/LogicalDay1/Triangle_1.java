package LogicalDay1;

public class Triangle_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int space=3; 
		 int star=1; 
		 for(int i=1; i<=4; i++) // Outer for loop for the no of Rows
		 { 
		 for(int j=1; j<=space; j++) // Inner For Loop for Space
		 { 
		 System.out.print(" "); 
		 } 
		 for(int j=1; j<=star; j++) // Inner For Loop for star
		 { 
		 System.out.print("* "); 
		 } 
		 System.out.println(); 
		 space--; 
		 star++; 
		 }
		

	}

}
