
package extraCredit;
import java.util.Scanner;


public class MaxValue_Occurence {

	public static void main (String[] args)

	{

	Scanner input = new Scanner(System.in);

	System.out.println("Enter numbers(q to end input): ");
	
	String line = input.nextLine();
	String[] split = line.trim().split("\\s+");
	int[] nums = new int[split.length];
	int max = 0, count = 0, temp = 0;
	for(int i = 0; i < split.length; i++)
	{
		nums[i] = Integer.parseInt(split[i]);
		
		for(int j = 0; j < nums.length; j++)
		{
			
			if(nums[j] > temp)
			{
				temp = nums[j];
			}
				max = temp;
				
				if(max == temp)
					count++;
				
		}
		
	}
	
	System.out.println("" + max);
	System.out.println("" + count);
	}
}
	

	