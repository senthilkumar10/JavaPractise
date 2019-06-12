package week5;

public class LearnStatic {

		   static String s2="World"; 
	       public static void main(String[] args) {
   
	              method1();
	              LearnStatic obj1 = new LearnStatic();
	              obj1.method2();

	       }

	       public static void method1()
	       {
	              String s1="Hello";
	              System.out.println(s1+ " " +s2); 
	       }  
	 

	       public void method2()
	       {
	              String s3="Hello";
	              System.out.println(s3+" "+s2);
	       }


	}


