package javapractise;

import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

import org.apache.commons.codec.binary.Base64;

public class Encoder {

	private static JPasswordField jpf;
	private static int okOption;
	private static String cypherString;
	
	public static String encode(String plainText) {
		byte[] cypherString = Base64.encodeBase64(plainText.getBytes());
		return new String(cypherString);
	}
	
	public static String encodeNow() {
		String readString;
		do {
			jpf = new JPasswordField();
			okOption = JOptionPane.showConfirmDialog(null, jpf, "Enter Password", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE);
			readString = new String(jpf.getPassword());
			cypherString = encode(readString);
		}while(okOption != JOptionPane.OK_OPTION || readString.equals(""));
		return cypherString;
	}
	
}
