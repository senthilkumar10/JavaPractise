package week3;

public class MatrixPrinting {

	public static void main(String[] args) {

		int arr[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

		System.out.println("The 4X4 Matrix is :-");

		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.print("\n");
		}

		System.out.println("\nThe Sprial form is :- ");

		for(int a=0;a<4;a++)
			System.out.print(arr[0][a]+" "); 

		for(int b=1;b<=3;b++)
			System.out.print(arr[b][3]+" "); 

		for(int c=2;c>=0;c--)
			System.out.print(arr[3][c]+" "); 

		for(int d=2;d>=1;d--)
			System.out.print(arr[d][0]+" "); 

		for(int e=1;e<=2;e++)
			System.out.print(arr[1][e]+" "); 

		for(int f=2;f>=1;f--)
			System.out.print(arr[2][f]+" "); 

	}
}





