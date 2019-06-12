package week3;

import java.util.Scanner;

public class MatrixDiagonal {

	public static void main(String[] args) {
		int row=0,col=0,mat=0,sum1=0,sum2=0;
		System.out.print("Enter the No of rows: ");
		Scanner input = new Scanner(System.in);
		row=input.nextInt();
		System.out.print("Enter the No of Columns: ");
		col=input.nextInt();
		int diag=col;
		int aDiag=col;
		int sumpr1=col;

		int c[][] = new int[row][col];

		System.out.println("\nEnter the values for each elements: ");


		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print("Matrix ["+i+"]["+j+"] = ");
				mat=input.nextInt();
				c[i][j]=mat;
			}
		}

		System.out.println("\nThe Matrix for "+row+" X "+col + ": \n");


		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(c[i][j] + " ");

			}
			System.out.println();
		}

		System.out.print("\nThe Diagonal values of given Matrix: ");


		for(int i=0;i<=(row-1);i++)
		{
			diag=diag-1;
			System.out.print(c[i][diag] + " ");
		}


		System.out.print("\nThe values above the Diagonal of given Matrix: ");


		for(int i=0;i<=(row-2);i++)
		{
			for(int j=0;j<=(col-2);j++)
			{
				System.out.print(c[i][j] + " ");
				sum1 = sum1+c[i][j];
			}
			col--;
		}

		System.out.println("\nThe sum of values above diagonal is = "+sum1);

		System.out.print("The values below the Diagonal of given Matrix: ");

		int count=0;

		for(int i=(row-1);i>=0;i--)
		{
			for(int j=(aDiag-1);j>count;j--)
			{
				System.out.print(c[i][j] + " ");
				sum2 = sum2+c[i][j];
			}
			count++;
		}

		System.out.print("\nThe sum of values below diagonal is = "+sum2);


		if(sum1>sum2)
		{
			System.out.print("\nThe values above the Diagonal is greatest: ");
			for(int i=0;i<=(row-2);i++)
			{
				for(int j=0;j<=(sumpr1-2);j++)
				{
					System.out.print(c[i][j] + " ");
				}
				sumpr1--;
			}
		}
		else
		{
			System.out.print("\nThe values below the Diagonal is greatest: ");
			int count1=0;
			for(int i=(row-1);i>=0;i--)
			{
				for(int j=(aDiag-1);j>count1;j--)
				{
					System.out.print(c[i][j] + " ");
				}
				count1++;
			}

		}


	}

}
