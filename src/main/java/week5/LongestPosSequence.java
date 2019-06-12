package week5;

import java.util.Arrays;

public class LongestPosSequence {

	public static void main(String[] args) {

		int input[] = {-1,2,-3,-4,5,6,7,-8,9,10};
		int len = input.length;
		int pos[] = new int[len];
		int seq[] = new int[len];
		int inc = 0,k=1;

		for(int i=0;i<len;i++)
		{
			if(input[i]>=0)
			{
				//	pos = Arrays.copyOf(input, len);
				pos[inc]=input[i];
				inc++;
				//System.out.println("The position is = "+ inc + " The Value is = "+pos[inc]);
			}
		}

		int poslen = pos.length;

		/*	for(int j=0;j<pos.length;j++)
		{
			System.out.println("The posistion is = "+ j + " The Value is = "+pos[j]);
		}*/

		for(int j=0;j<poslen;j++)
		{
			//System.out.println("The position of J = "+ j + " The Value is = "+pos[j]);
			//System.out.println("The position of K = "+ k + " The Value is = "+pos[k]);

			int firstNbr = pos[j]+1;
			if(pos[k]==firstNbr)
			{
				seq[j]=pos[j];
			}
			k++;
		}

		
		
		
	}

}
