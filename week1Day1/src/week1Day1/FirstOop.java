/* 
 * @author: Aldo Dagio
 * Description:  
 * Date:
 * @version: 
*/

package week1Day1;


import java.util.Scanner;

public class FirstOop {


	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int val1, val2, res;
		System.out.println("please enter an integer value");
		val1 = input.nextInt();
		System.out.println("please enter an integer value");
		val2 = input.nextInt();
		/*int num = 34; 
		System.out.println("Hello World!");
		System.out.println("num = " + num);
		*/
		
		res = val1 + val2;
		
		System.out.println("result is: " + res);
		
	}
	
	
}
