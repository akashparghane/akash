package LogicalDay1;

public class Space_measure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "V E L O C  I TY";
		int counter = 0;
		for(int i=0;i<=s.length()-1;i++) {
			char blank = s.charAt(i);
			if(blank==' ') {
				counter++;
				
				
			}
			
		}
		System.out.println(counter);
	}
	
}
