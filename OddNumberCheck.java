package OddNoCheck;

public class OddNumberCheck {
	public static void main(String[] args) {
        try {
            //checkForEvenNumber(4);  
           
             checkForEvenNumber(7);
        } catch (OddNumberException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }

 
    public static void checkForEvenNumber(int number) throws OddNumberException {
        if (number % 2 != 0) {
            throw new OddNumberException("The number is odd.");
        } else {
            System.out.println("The number is even.");
        }
    }

    
    static class OddNumberException extends Exception {
        public OddNumberException(String message) {
            super(message);
        }
    }
}
