package LogicalDay1;

public class Armstrong_n {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int orgNum = 371;
		 int sum = 0;

		 for(int i=orgNum; i > 0; i = i/10)
		 {
		 int rem = i % 10;
		 sum = sum + (rem*rem*rem);
		 }

		if(orgNum==sum)
		 {
		 System.out.println("Given Number "+orgNum+" is Armstrong Number");
		 }
		else
		 {
		 System.out.println("Given Number "+orgNum+" is NOT Armstrong Number");
		 }
		 }}

		
	


