package week4;

public class AscendingOrder {

	public static void main(String[] args) {
		System.out.println("Provide some numbers to print in Ascending order = ");
		int nbr1[] = {6,7,8,9,9,2,3,4};
		int nbr2;
		
		for(int i=1;i<nbr1.length;i++)
		{
			for(int j=0;j<=i;j++)
			{
				if(nbr1[i]<nbr1[j])
				{
					nbr2=nbr1[j];
					nbr1[j]=nbr1[j];
					nbr1[i]=nbr2;
				}
			}
			
			for(int s=0;s<nbr1.length;s++)
			{
				System.out.print(nbr1[i]);
			}
				

		}
		

	}

}
