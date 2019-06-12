package week6;

public class SpaceTrimming {

	public static void main(String[] args) {
	
	String s = "   aa bbbbb     ccc    d ";
	System.out.println("Before Trimming "+"\n"+s);
	System.out.println("\n"+"After Trimming"+"\n"+s.replaceAll("\\s+", " ").trim());
	
	}

}
