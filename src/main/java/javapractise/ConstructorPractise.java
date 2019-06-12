package javapractise;

public class ConstructorPractise {
	
	String test;
	
	public ConstructorPractise() {
		test = "This is for test";
	}
	
	public ConstructorPractise(String text) {
		this.test = text;
	}

	public static void main(String[] args) {
		ConstructorPractise obj = new ConstructorPractise();
		System.out.println(obj.test);
		

	}

}
