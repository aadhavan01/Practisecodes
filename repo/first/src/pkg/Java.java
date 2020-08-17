package pkg;

public class Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i;
		String str = "Hello Stackoverflow! WaZZuP";
		String lower = "";
		String upper = "";
		String other = "";

		for (i = 0; i < str.length(); i++){
		    if (Character.isUpperCase(str.charAt(i))){
		        upper += str.charAt(i);
		    }else if (Character.isLowerCase(str.charAt(i))){
		        lower += str.charAt(i);
		    }else{
		        other += str.charAt(i);
		    }
		}

		System.out.println("In the String '" + str + "' there are " + upper.length() + " Upper Case, " + lower.length() + " Lower Case and " + other.length() + " Other Characters");
		System.out.println("Upper Chars are: '" + upper + "'");
		System.out.println("Lower Chars are: '" + lower + "'");
		System.out.println("Other Chars are: '" + other + "'");

	}

}
