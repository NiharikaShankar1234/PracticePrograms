package StringExamples;

public class VowelCheck {
	 public static void main(String[] args) {
	       try {
	    	   checkForVowels("Hello");
	    	   checkForVowels("Hmmm");
	       }
	       catch(NoVowelsException e) {
	    	   System.out.println("Exception:"+e.getMessage());
	       }
	 }
	 
	 public static void checkForVowels(String input) 
			 throws NoVowelsException{
		  if (!containsVowels(input)) {
	            throw new NoVowelsException("The string does not contain any vowels.");
	        }
		  else {
	            System.out.println("The string contains vowels.");
	        }
	 
	 }
	 private static boolean containsVowels(String str) {
	        return str.matches(".[aeiouAEIOU].");
	    }
	 static class NoVowelsException extends Exception {
	        public NoVowelsException(String message) {
	            super(message);
	        }
	    }
}