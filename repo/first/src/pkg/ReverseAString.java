package pkg;

public class ReverseAString {

	public static void main(String[] args) {
		
		String st = "Hello Yes";
		
		String rev="";
		
		System.out.println(st.length());
		
		for(int i = st.length()-1;i>=0;i--) {
			
			rev= rev+st.charAt(i);
			
			System.out.print(st.charAt(i));
			
			
		}
		
	//	System.out.println(rev);
		

	}

}
