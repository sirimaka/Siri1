

public class demo14 {
	
	    public static void main(String[] args) {
	        double principal = 1000;  
	        double rate = 15 / 100.0; 
	        int time = 5;             

	       
	        double simpleInterest = principal * rate * time;

	        
	        double totalAmount = principal + simpleInterest;

	        System.out.println("Total Amount based on Simple Interest: " + totalAmount);
	    }
	}



