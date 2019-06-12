package javapractise;

import javax.swing.JOptionPane;

public class TryJavaPane {

	public static void main(String[] args) {
				
		String fn = JOptionPane.showInputDialog("Enter the First Number");
		String ln = JOptionPane.showInputDialog("Enter the Second Number");
		
		int sum = Integer.parseInt(fn)+Integer.parseInt(ln);
		
		int option = JOptionPane.showConfirmDialog(null, "The Answer is "+sum,"The Sum of two digits...",JOptionPane.YES_NO_CANCEL_OPTION);
		if(option==0) {
			System.out.println("Option Yes is Selected");
			
		}
	}

}
