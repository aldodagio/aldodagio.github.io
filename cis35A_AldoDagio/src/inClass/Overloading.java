// CIS35A - Aldo Dagio
// Description - this class is used to demonstrate overloading methods. 

package inClass;

public class Overloading {

	public static void main(String[] args) {

		             Overloading obj = new Overloading();
		             obj.methodOvr();
		             obj.methodOvr(5,9.0,"Overloaded method that includes 3 parameters, one is a string.");
		             obj.methodOvr(0.0,50.0,2.0);
		             obj.methodOvr(50,9);
		       }

		       public void methodOvr(){
		             System.out.println("This is the method X with 0 parameters! Use me to print!");
		       }

		       public void methodOvr(float a,int b){
		    	   
		    	   a -= b;
		    	   
		             System.out.println(a+ "= a -=b; This is the method X with 2 parameters! Use me to subtract!");
		       }

		       public void methodOvr(int a){
		    	   a++;
		             System.out.println("Invoke me as a counter! a = " + a);
		       }

		       public void methodOvr(double a, double b, double c){
		    	   
		    	   a = b/c;
		             System.out.println(a+ "= a = b/c; This is the method with 3 parameter, all doubles!");
		       }

		       public void methodOvr(int a, double b, String c){
		    	   	b += a;
		            System.out.println(c + b + " ");
		       }
}

/*
This is the method X with 0 parameters! Use me to print!
Overloaded method that includes 3 parameters, one is a string.14.0 
25.0= a = b/c; This is the method with 3 parameter, all doubles!
41.0= a -=b; This is the method X with 2 parameters! Use me to subtract!
 */
