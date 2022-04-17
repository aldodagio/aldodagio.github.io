package discreteMath;

public class Exceptional {
	    public static void main(String args[]) {     
	    	int w,x,y,z;    
	    	w = x = y = z = -6;   
	    	try {           
	    		int[] someData = {0, 11, 7, 35};  
	    		int[] myArray = null;     
	    		int[] noData = {};          
	    		System.out.println("Test 1:");    
	    		w = foo(myArray, 2);       
	    		System.out.println("Test 2:");        
	    		x = foo(someData, 3);         
	    		System.out.println("Test 3:");    
	    		y = foo(someData, 5);         
	    		System.out.println("Test 4:");
	    		
	    		z = foo(noData, 0);  
    } catch (Exception e) { 
    	System.out.println("Hmmm... what happened?");    
    	}        System.out.println("w="+w + "  x="+x + "  y="+y + "  z="+z);   
    	}    public static int foo(int[] a, int n) throws Exception {     
    		int result = 0;     
    		try {           
    			for (int i = 0; i < n; i++)        
    				result += a[i];          
    			result /= a.length;      
    			} 
    		catch (ArrayIndexOutOfBoundsException aioobe) {  
    			System.out.println("Oops!");      
    			} catch (NullPointerException npe) {        
    				System.out.println("Oh, my goodness!");     
    				} catch (ArithmeticException ae) {        
    					System.out.println("Bad news.");      
    					throw ae;       
    					} finally {    
    						System.out.println("result = " + result);     
    						}        return result;    }
    	}

