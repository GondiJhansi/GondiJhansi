package File;

import java.util.*;

public class Array {

	public static void main(String[] args) {
		//int i,j;
		Scanner sc = new Scanner(System.in);
		int i,j;
		System.out.println("Enter no of rows and cols");
		int row = sc.nextInt();
		int col = sc.nextInt();
		int matrix[][] = new int[row][col];
		System.out.println("Enter elements");
		
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				matrix[i][j] = sc.nextInt();
			}
		}
		System.out.println("The resultant is:");
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				System.out.print(matrix[i][j]+"  ") ;
			}
			System.out.println();
		}
		
		
	}

}
