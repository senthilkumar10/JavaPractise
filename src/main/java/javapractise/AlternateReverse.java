package javapractise;

public class AlternateReverse {

	public static void main(String[] args) {
	
		 String a = "This Sentence is to Test Alternate Reverse example";
         System.out.println(a);
         String b[] = a.split(" ");

         for(int i=0;i<b.length;i++)
         {
                if(i%2==0){
                      System.out.print(b[i]);
                }
                else
                {            
                      for(int j=(b[i].length()-1);j>=0;j--)
                      {
                             System.out.print(b[i].charAt(j));
                      }
                }
         System.out.print(" ");

         }

	}

}
