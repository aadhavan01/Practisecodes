package pkg;

import java.util.Scanner;

public class DistinctCharacters {
	
	
		static final int NO_OF_CHARS = 256; 
		
		static int counter=0;
		
	static 	String buffer;
	       
	    /* Print duplicates present in the passed string */
	    static void printDistinct(String str) 
	    {   // Create an array of size 256 and count of 
	        // every character in it 
	        int[] count = new int[NO_OF_CHARS]; 
	       
	        /* Count array with frequency of characters */
	        int i; 
	        for ( i = 0; i < str.length(); i++) {
	        	//System.out.println(str.charAt(i));
	            if(str.charAt(i)!=' ') 
	                count[(int)str.charAt(i)]++; 
	        }
	        System.out.println(i);
	      
	        
	        int n = i; 
	       
	        // Print characters having count more than 0 
	        for (i = 0; i < n; i++) {
	            if (count[(int)str.charAt(i)] == 1) {
	                
	            counter++;
	            }
	        }
	        
	        System.out.println(counter);
	        
	        
    } 
	    
	    public static int countUniqueCharacters(String input) {
	        String buffer = "";
	        for (int i = 0; i < input.length(); i++) {
	        	
	            if (!buffer.contains(String.valueOf(input.charAt(i)))) {
	                buffer += input.charAt(i);
	                System.out.println(buffer);
	            }
	        }
	        return buffer.length();
	    }
	    
	    public static void usingMap(String str) {
	    	
	    	char[] chars = str.toCharArray();
	    	
	    	StringBuilder sb = new StringBuilder();
	    	boolean repeatedChar;
	    	int count;
	    	for (int i = 0; i < chars.length; i++) {
	    	    repeatedChar = false;
	    	    for (int j = i + 1; j < chars.length; j++) {
	    	        if (chars[i] == chars[j]) {
	    	            repeatedChar = true;
	    	            break;
	    	        }
	    	    }
	    	    if (!repeatedChar) {
	    	        sb.append(chars[i]);
	    	    }
	    	}
	    	
	    	System.out.println(sb);
	    	
	    }

	
		
		
		public static void main(String[] args) {
		 /*   Scanner myObj = new Scanner(System.in);  // Create a Scanner object
		    System.out.println("Enter the String");

		    String userName = myObj.nextLine();// Read user input
		    
		    System.out.println("Username is: " + userName); */ // Output user input
		    
		  //  DistinctCharacters.printDistinct("comiccomedy");
		    
		 System.out.println(DistinctCharacters.countUniqueCharacters("comiccoemdy"));   
		 
		// DistinctCharacters.usingMap("comiccomedy");
		    
		  }
		

	

}
