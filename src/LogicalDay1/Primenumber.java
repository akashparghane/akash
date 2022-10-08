package LogicalDay1;

public class Primenumber {
	public static void main(String[] args) {
		int num =123456;
		String s = Integer.toString(num);
		String r="";
		for(int i=s.length()-1;i>=0;i--) {
			r=r+s.charAt(i)
;
			}
		int rev = Integer.parseInt(r);
		System.out.println("The Original number is "+num);
		System.out.println("The reverse number is "+rev );
		
		
	

	}
}




