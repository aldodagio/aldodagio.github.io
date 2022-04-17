package week1Day1;

import java.util.Scanner;

public class TwoDimensionalArrays {
	static int[][] twoD; 
	static int row, col;
	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);	
		System.out.println("What is row size?");
		row = input.nextInt();
		System.out.println("What is column size?");
		col = input.nextInt();
		
		twoD = new int[row][col];
		
		for(int i = 0; i < row; i++)
		{
			for(int j = 0; j < col; j++)
			{
				System.out.printf("Enter the value for item ?");
				twoD[i][j] = input.nextInt();
			}
		}
		
		for(int i = 0; i < row; i++)
		{
			for(int j = 0; j < col; j++)
			{
				System.out.printf("arrayNum[%d][%d]=%d\n", i, j, twoD[i][j]);
				
			}
		}
	}

}
