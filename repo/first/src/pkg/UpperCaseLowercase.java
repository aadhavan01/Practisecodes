package pkg;

public class UpperCaseLowercase {

	public static void main(String[] args) {
		
		String upper="";
		String lower = "";
		String Other="";
		
		String st= "Hello World program";
		
				
		System.out.println(st.length());
		
		for(int i = 0;i<st.length();i++) {
			
			if (Character.isUpperCase(st.charAt(i))) {
				
				upper += st.charAt(i); 
				
			}
			
    if (Character.isLowerCase(st.charAt(i))) {
				
				lower += st.charAt(i); 
				
			}
			
    
    
			
		}
		
		
		System.out.print(upper);
		
		System.out.println();
		
		System.out.print(lower);
		
		System.out.println();
		
		int arr[] = new int[] {2,7};
		
		System.out.println(arr.length);
		
	}

}
