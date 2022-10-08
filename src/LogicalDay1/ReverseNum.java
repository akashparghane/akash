package LogicalDay1;

public class ReverseNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 123;
		int rn=0;
		for (int i =num; i>0 ; i=i/10) {
			int rem=i%10;
			rn=rn*10+rem;
			
		}
		System.out.println(rn);

	}

}
