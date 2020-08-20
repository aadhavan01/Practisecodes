package pkg;

import java.util.Arrays;

public class Anagrams {
	
	
	
	public static void IsAnagram(String s1, String s2) {
		
	boolean status = true;
		
		String ST = s1.replaceAll("\\s", "");
		String ST1 = s2.replaceAll("\\s", "");
		
		if(ST.length() != ST1.length())
		{
			
			status = false;
		}
		
		else {
			
			char a[]=ST.toLowerCase().toCharArray();
			char b[]=ST1.toLowerCase().toCharArray();
			
			Arrays.sort(a);
			Arrays.sort(b);
			
			System.out.println(a);
			System.out.println(b);
			
			status = Arrays.equals(a, b);
			System.out.println(status);
		}
		
		if(status) {
			
			System.out.println("Given strings are anagram");
		}
		else System.out.println("Strings are not anagram");
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Anagrams.IsAnagram("peek", "keep");
	}

}
