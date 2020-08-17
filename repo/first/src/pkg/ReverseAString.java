package pkg;

public class ReverseAString {

	public static void main(String[] args) {
		
		String st = "Hello Yes";
		
		System.out.println(st.length());
		
		for(int i = st.length()-1;i>=0;i--) {
			
			System.out.print(st.charAt(i));
			
			
		}
		

	}

}
