
public abstract class TypeCast {

	public static void main(String[] args) {
		 int iA = 100;  
         
	        // automatic type conversion 
	        long lA = iA;  
	          
	        // automatic type conversion 
	        float fA = lA;  
	        System.out.println("Int value "+iA); 
	        System.out.println("Long value "+lA); 
	        System.out.println("Float value "+fA); 
	        
	       char chB = 'c'; 
	       int numB = 88; 
	        //chB = num; will through error 
	        
	        double dC = 100.04;  
	          
	        //explicit type casting 
	        long lC = (long)dC; 
	          
	        //explicit type casting  
	        int iC = (int)lC;  
	        System.out.println("Double value "+dC); 
	          
	        //fractional part lost 
	        System.out.println("Long value "+lC);  
	          
	        //fractional part lost 
	        System.out.println("Int value "+iC);  
	        
	        
	        
	        byte bD;  
	        int iD = 257;  
	        double dD = 323.142; 
	        System.out.println("Conversion of int to byte.");  
	          
	        //i%256 
	        bD = (byte) iD;  
	        System.out.println("i = " + iD + " b = " + bD); 
	        System.out.println("\nConversion of double to byte."); 
	          
	        //d%256 
	        bD = (byte) dD;  
	        System.out.println("d = " + dD + " b= " + bD); 
	        
	        
	        byte bE = 42;  
	        char cE = 'a';  
	        short sE = 1024; 
	        int iE = 50000; 
	        float fE = 5.67f; 
	        double dE = .1234; 
	          
	        // The Expression 
	        double result = (fE * bE) + (iE / cE) - (dE * sE); 
	          
	        //Result after all the promotions are done 
	        System.out.println("result = " + result); 
	        
	        
	        byte bF = 42;  
	        char cF = 'a';  
	        short sF = 1024; 
	        int iF = 50000; 
	        float fF = 5.67f; 
	        double dF = .1234; 
	          
	        // The Expression 
	        double result1 = (fF * bF) + (iF / cF) - (dF * sF); 
	          
	        //Result after all the promotions are done 
	        System.out.println("result = " + result1); 
	}

}
