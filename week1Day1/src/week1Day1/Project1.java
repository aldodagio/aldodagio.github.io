/* 
 * @author: Aldo Dagio-Ortega
 * Description: This program loops through the given number of employees for a company.
 * 				It then calculates the federal tax, state tax and net salary for each employee in the company. 
 * 				The calculation is based on base salary, marital status and the state the employee lives in.
 * Date: 08/27/2021
 * @version: 1
*/

package week1Day1;

import java.util.Scanner;

public class Project1 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Scanner input1 = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);
		Scanner input3 = new Scanner(System.in);
		Scanner input4 = new Scanner(System.in);
		
		System.out.println("How many employees do you have in your company?");
		int num = input.nextInt();
		if(num > 0) {
		String[] newEmployee = new String[num];
		double[] sal = new double[num];
		String[] marStatus = new String[num];
		String[] state = new String[num];
		double[] taxAccumulator = new double[num];
		double[] netSal = new double[num];
	
		for(int i = 0; i < num; i++)
		{
			System.out.println("Please enter the name of your employee. (Enter employees full name. Ex: Aldo Dagio)");
			newEmployee[i] = input1.nextLine();
			System.out.println("Please enter the salary for " + newEmployee[i] + ". (Salary must be greater than or equal to zero. Ex: 4500)");
			sal[i] = input2.nextDouble();
			System.out.println("Please enter the marital status for " + newEmployee[i] + ". (Please enter either single or married. Ex: Single)");
			marStatus[i] = input3.nextLine();
			System.out.println("Please enter the state that " + newEmployee[i] + " resides in. (Please enter the abbreviation for the state the employee resides in. Ex: CA)");
			state[i] = input4.next();
		}
			for(int j = 0; j < num; j++)
			{
				if(sal[j] >= 0) {
				if(marStatus[j].equalsIgnoreCase("single"))
				{
				if(sal[j] >= 0 && sal[j] <= 8000)
				{
					taxAccumulator[j] = sal[j] * .1;
					if(state[j].equalsIgnoreCase("ca") || state[j].equalsIgnoreCase("nv") || state[j].equalsIgnoreCase("az") || state[j].equalsIgnoreCase("tx"))
					{
						taxAccumulator[j] += sal[j] * .1;
					}
					else taxAccumulator[j] += sal[j] * .12;
					
					netSal[j] = sal[j] - taxAccumulator[j];
				}
				else if(sal[j] > 8000 && sal[j] <= 32000)
				{
					taxAccumulator[j] -= 800;
					taxAccumulator[j] = sal[j] * .15;
					if(state[j].equalsIgnoreCase("ca") || state[j].equalsIgnoreCase("nv") || state[j].equalsIgnoreCase("az") || state[j].equalsIgnoreCase("tx"))
					{
						taxAccumulator[j] += sal[j] * .1;
					}
					else  taxAccumulator[j] += sal[j] * .12;
					
					netSal[j] = sal[j] - taxAccumulator[j];
				}
				else if(sal[j] > 32000)
				{	taxAccumulator[j] -= 4400;
					taxAccumulator[j] = sal[j] * .25;
					if(state[j].equalsIgnoreCase("ca") || state[j].equalsIgnoreCase("nv") || state[j].equalsIgnoreCase("az") || state[j].equalsIgnoreCase("tx"))
					{
						taxAccumulator[j] += (sal[j] * .1);
					}
					else taxAccumulator[j] += (sal[j] * .12);
					
					netSal[j] = sal[j] - taxAccumulator[j];
				}
				}
				else if(marStatus[j].equalsIgnoreCase("married"))
				{
					if(sal[j] >= 0 && sal[j] <= 16000)
					{
							taxAccumulator[j] = sal[j] * .1;
						if(state[j].equalsIgnoreCase("ca") || state[j].equalsIgnoreCase("nv") || state[j].equalsIgnoreCase("az") || state[j].equalsIgnoreCase("tx"))
						{
							taxAccumulator[j] += sal[j] * .1;
						}
						else taxAccumulator[j] += sal[j] * .12;
						
						netSal[j] = sal[j] - taxAccumulator[j];
					}
					else if(sal[j] > 16000 && sal[j] <= 64000)
					{
						taxAccumulator[j] -= 1600;
						taxAccumulator[j] = sal[j] * .15;
						if(state[j].equalsIgnoreCase("ca") || state[j].equalsIgnoreCase("nv") || state[j].equalsIgnoreCase("az") || state[j].equalsIgnoreCase("tx"))
						{
							taxAccumulator[j] += sal[j] * .1;
						}
						else taxAccumulator[j] += sal[j] * .12;
						
						netSal[j] = sal[j] - taxAccumulator[j];
					}
					else if(sal[j] > 64000)
					{
						taxAccumulator[j] -= 8800;
						taxAccumulator[j] += sal[j] * .25;
						if(state[j].equalsIgnoreCase("ca") || state[j].equalsIgnoreCase("nv") || state[j].equalsIgnoreCase("az") || state[j].equalsIgnoreCase("tx"))
						{
							taxAccumulator[j] += sal[j] * .1;
						}
						else taxAccumulator[j] += sal[j] * .12;
						
						netSal[j] = sal[j] - taxAccumulator[j];
					}
				}
				}
				else System.out.println("Negative values for salary are not permitted.");
		}
		
			for(int k = 0; k < num; k++)
			{
				System.out.println("Employee name: " + newEmployee[k]);
				System.out.println("Employee salary before taxes: $" + sal[k]);
				System.out.println("Employee marital status: " + marStatus[k]);
				System.out.println("Employee state of residence: " + state[k]);
				System.out.println("Employee net salary after taxes: $" + netSal[k]);
				System.out.println("Employee taxes paid (federal + state): $" + taxAccumulator[k]);
				System.out.println();
			}
		
	}
		else System.out.println("Negative values for number of employees is not permitted.");
	}
}
