package LogicalDay1;

public class Replace_Special_char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String s ="@KAS%";
		//String corrected = s.replaceAll("", "");
		
		//System.out.println(corrected);
		String s="@Aka!s&H*";
		String correctedName = s.replaceAll("[^a-zA-Z0-9]","");
		System.out.println(correctedName);
		
	}

}
