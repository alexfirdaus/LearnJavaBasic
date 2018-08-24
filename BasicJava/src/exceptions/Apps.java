package exceptions;


public class Apps {
	public static void main(String args[]) {
	      
		//Example: try catch block
		int num1, num2;
	      try {
	         num1 = 0;
	         num2 = 23 / num1;
	         System.out.println(num2);
	      }
	      catch (ArithmeticException e) { 
	         System.out.println("do not divide a number by zero");
	      }
	      catch (Exception e) {
	         System.out.println("Exception occurred");
	      }
	      System.out.println("out from try-catch block.");
	      System.out.println("====================================");
	      
	      //Example of Multiple catch blocks
	      try{
	          int a[]=new int[5];
	          a[9]=30/10;
	          System.out.println("First print statement in try block");
	      }
	      catch(ArithmeticException e){
	         System.out.println("Warning: ArithmeticException");
	      }
	      catch(ArrayIndexOutOfBoundsException e){
	         System.out.println("Warning: ArrayIndexOutOfBoundsException");
	      }
	      catch(Exception e){
	         System.out.println("Warning: Some Other exception");
	      }
	    System.out.println("out from try-catch block.");
	      System.out.println("====================================");
	    
	    //Nested Try Catch Example
	  //main try-block
	      try{
	    	//try-block2
	        try{     
	            //try-block3
	            try{
	            	int arr[]= {1,2,3,4};
	            	System.out.println(arr[10]);
	            }catch(ArithmeticException e){
	            	System.out.print("Arithmetic Exception");
	            	System.out.println(" handled in try-block3");
	            }
	        }
	        catch(ArithmeticException e){
	           System.out.print("Arithmetic Exception");
	           System.out.println(" handled in try-block2");
	        }
	    }
	    catch(ArithmeticException e3){
	    	System.out.print("Arithmetic Exception");
	     	System.out.println(" handled in main try-block");
	    }
	    catch(ArrayIndexOutOfBoundsException e4){
	    	System.out.print("ArrayIndexOutOfBoundsException");
	     	System.out.println(" handled in main try-block");
	    }
	    catch(Exception e5){
	    	System.out.print("Exception");
	     	System.out.println(" handled in main try-block");
	     }
	      System.out.println("====================================");
		    
		    //Example 2: Nested try block
	    //Parent try block
	      try{
	     	//Child try block1
	          try{
	             System.out.println("Inside block1");
	             int b =45/0;
	             System.out.println(b);
	          }
	          catch(ArithmeticException e1){
	             System.out.println("Exception: e1");
	          }
	          //Child try block2
	          try{
	             System.out.println("Inside block2");
	             int b =45/0;
	             System.out.println(b);
	          }
	          catch(ArrayIndexOutOfBoundsException e2){
	             System.out.println("Exception: e2");
	          }
	         System.out.println("Just other statement");
	     }
	     catch(ArithmeticException e3){
	     	 System.out.println("Arithmetic Exception");
	          System.out.println("Inside parent try catch block");
	     }
	     catch(ArrayIndexOutOfBoundsException e4){
	     	System.out.println("ArrayIndexOutOfBoundsException");
	          System.out.println("Inside parent try catch block");
	     }
	     catch(Exception e5){
	     	System.out.println("Exception");
	          System.out.println("Inside parent try catch block");
	     }
	     System.out.println("Next statement..");

	      System.out.println("====================================");
	      //A Simple Example of finally block
	      System.out.println(myMethod());
	}
	
	public static int myMethod()
	   {
	      try {
	        return 112;
	      }
	      /* Finally block will always execute
	       * even if there is no exception in try block
	       */
	      finally {
	        System.out.println("This is Finally block");
	        System.out.println("Finally block ran even after return statement and even if there is no exception in try block");
	      }
	   }
}
