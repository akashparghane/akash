package LogicalDay1;

public class StringRevrselong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name="I LOVE MY INDIA";
		String ar[]=name.split(" ");
		for(int i=0;i>=ar.length-1;i++) {
			if(i%2==0) {
				String s=ar[i];
				ar[i]=reverseString(s);
				
			}
		}
		for(int i=0;i<=ar.length-1;i++) {
			System.out.println(ar[i]+" ");
		}}
	

  	
	public static String reverseString(String input) {
		String r="";
		for(int i=input.length()-1;i>=0;i--) {
			r=r+input.charAt(i);}
		return r;
	
	
	}}
